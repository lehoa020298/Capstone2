package com.lehoa.hoctienganh.Adapter;

import android.content.Intent;
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
import com.lehoa.hoctienganh.Activity.LessionActivity;
import com.lehoa.hoctienganh.Activity.MainActivity;
import com.lehoa.hoctienganh.Model.ItemMain;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

import static android.content.Context.WINDOW_SERVICE;

public class AdapterMain extends RecyclerView.Adapter<AdapterMain.MyViewHolder> {

    private ArrayList<ItemMain> arrayList;
    private MainActivity context;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView ten;
        ImageView img, imgbackground;

        public MyViewHolder(View view) {
            super(view);
            ten = view.findViewById(R.id.txt_item_main);
            img = view.findViewById(R.id.img_item_main);
            imgbackground = view.findViewById(R.id.imgbackground_item_main);

            // sự kiện chọn vào item trên main truyền tham số sang màn hình LessionActivity
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(context, LessionActivity.class);
                    i.putExtra("id", arrayList.get(getPosition()).getId());
                    context.startActivity(i);
                    //context.overridePendingTransition(R.anim.slide_left, R.anim.slide_out_right);
                    //new LoadAdFull(context);
                }
            });
        }
    }

    public AdapterMain(ArrayList<ItemMain> arrayList, MainActivity context) {
        this.arrayList = arrayList;
        this.context = context;

    }

    @Override
    public AdapterMain.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_item_main, parent, false);

        return new AdapterMain.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final AdapterMain.MyViewHolder holder, int position) {
        WindowManager wm = (WindowManager) context.getSystemService(WINDOW_SERVICE);
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(displayMetrics);
        Resources r = context.getResources();
        float truPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, r.getDisplayMetrics());
        int width = (int) (displayMetrics.widthPixels / 2 - truPx);


        holder.ten.setText(arrayList.get(position).getName());
        Glide.with(context).load(arrayList.get(position).getImg()).override(width, (int) (width - truPx)).into(holder.img);
        Glide.with(context).load(arrayList.get(position).getBackground()).override(width, (int) (width - truPx)).into(holder.imgbackground);
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
}
