package com.lehoa.hoctienganh.Adapter;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.lehoa.hoctienganh.Activity.EventHandlerClass;
import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

import static android.content.Context.WINDOW_SERVICE;

// Màn hinh dưới lession
public class AdapterTab extends RecyclerView.Adapter<AdapterTab.MyViewHolder> {

    private ArrayList<ItemLession> arrayList;
    Context context;
    RecyclerView rv;
    LayoutInflater inflater;

    public AdapterTab(Context context, ArrayList<ItemLession> arrayList, RecyclerView rv) {
        this.arrayList = arrayList;
        this.context = context;
        this.rv = rv;
        inflater = LayoutInflater.from(context);
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt_eng;
        TextView txt_vie;

        public MyViewHolder(View view) {
            super(view);
            img = view.findViewById(R.id.img_item_tab);
            txt_eng = view.findViewById(R.id.txt_eng);
            txt_vie = view.findViewById(R.id.txt_vie);
        }
    }


    @Override
    public AdapterTab.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_item_tab, parent, false);
        return new AdapterTab.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        WindowManager wm = (WindowManager) context.getSystemService(WINDOW_SERVICE);
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(displayMetrics);
        Resources r = context.getResources();
        float truPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, r.getDisplayMetrics());
        int width = (int) (displayMetrics.widthPixels / 2 - truPx);

        final ItemLession itemLession = arrayList.get(position);
        Glide.with(context).load(itemLession.getImg()).override(width, (int) (width - truPx)).into(holder.img);
        holder.txt_eng.setText(itemLession.getEng());
        holder.txt_vie.setText(itemLession.getVie());
        final int file = itemLession.getFile();

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EventHandlerClass.startMediaPlayer(context, file);
            }
        });
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}

