package com.lehoa.hoctienganh.Adapter;

import android.app.Activity;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.lehoa.hoctienganh.Activity.EventHandlerClass;
import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Random;

public class AdapterGame extends RecyclerView.Adapter<AdapterGame.MyViewHolder> {

    private ArrayList<ItemLession> arrayList, arrayListAll;
    private Activity context;
    TextToSpeech textToSpeech;
    ImageButton btSound;
    int pos;
    int file;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img, imgCorrect;
        public MyViewHolder(View view) {
            super(view);
            img = view.findViewById(R.id.img_item_game);
            imgCorrect = view.findViewById(R.id.img_correct);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(pos == getLayoutPosition()){
                        imgCorrect.setImageResource(R.drawable.img_icon_correct);
                        imgCorrect.setVisibility(View.VISIBLE);
                        win(imgCorrect);
                    }else {
                        imgCorrect.setImageResource(R.drawable.img_icon_fail);
                        imgCorrect.setVisibility(View.VISIBLE);
                        lose(imgCorrect);
                    }
                }
            });
        }
    }

    public AdapterGame(ArrayList<ItemLession> arrayList, ArrayList<ItemLession> arrayListAll,
                       Activity context, int pos, ImageButton btSound) {
        this.arrayList = arrayList;
        this.arrayListAll = arrayListAll;
        this.context = context;
        this.pos = pos;
        this.btSound = btSound;

        random();
        playGame();
        repeatSound();
    }

    @Override
    public AdapterGame.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_item_game, parent, false);

        return new AdapterGame.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AdapterGame.MyViewHolder holder, int position) {
        Picasso.get().load(arrayList.get(position).getImg()).fit().into(holder.img);
        file = arrayList.get(pos).getFile();
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private void random(){
        arrayList.clear();
        for(int i = 0; i < 4; i++){
            Random r = new Random();
            int ran = r.nextInt(arrayListAll.size() - 1);
            arrayList.add(arrayListAll.get(ran));
            arrayListAll.remove(ran);
        }
        arrayListAll.addAll(arrayList);
        notifyDataSetChanged();
    }

   //Nói dịch đoạn text phát âm
    private void playGame(){
        Random r = new Random();
        pos = r.nextInt(arrayList.size() - 1);
        EventHandlerClass.startMediaPlayer(context, arrayList.get(pos).getFile());
    }
    private void repeatSound(){
        btSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventHandlerClass.startMediaPlayer(context, file);
            }
        });
    }

    private void win(final ImageView img){
        MediaPlayer mp;
        mp = MediaPlayer.create(context, R.raw.sound_win);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                random();
                playGame();
                img.setVisibility(View.GONE);
            }
        });
    }

    private void lose(final ImageView img){
        MediaPlayer mp;
        mp = MediaPlayer.create(context, R.raw.sound_lose);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                img.setVisibility(View.GONE);
            }
        });
    }
}

