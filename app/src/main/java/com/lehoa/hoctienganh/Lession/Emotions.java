package com.lehoa.hoctienganh.Lession;

import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Emotions {
    ArrayList<ItemLession> arrayList;

    public Emotions(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_angry, "Angry", "Tức Giận", R.raw.sound_angry));
        arrayList.add(new ItemLession(1, R.drawable.img_bored, "Bored", "Chán", R.raw.sound_bored));
        arrayList.add(new ItemLession(2, R.drawable.img_cold, "Cold", "Lạnh", R.raw.sound_cold));
        arrayList.add(new ItemLession(3, R.drawable.img_happy, "Happy", "Hạnh Phúc", R.raw.sound_happy));
        arrayList.add(new ItemLession(4, R.drawable.img_hot, "Hot", "Nóng", R.raw.sound_hot));
        arrayList.add(new ItemLession(5, R.drawable.img_hungry, "Hungry", "Đói", R.raw.sound_hungry));
        arrayList.add(new ItemLession(6, R.drawable.img_sad, "Sad", "Buồn", R.raw.sound_sad));
        arrayList.add(new ItemLession(7, R.drawable.img_scary, "Scary", "Sợ", R.raw.sound_scary));
        arrayList.add(new ItemLession(8, R.drawable.img_shy, "Shy", "Thẹn Thùng", R.raw.sound_shy));
        arrayList.add(new ItemLession(9, R.drawable.img_sleepy, "Sleepy", "Buồn Ngủ", R.raw.sound_sleepy));
        arrayList.add(new ItemLession(10, R.drawable.img_surprise, "Surprise", "Ngạc Nhiên", R.raw.sound_surprise));
        arrayList.add(new ItemLession(11, R.drawable.img_tired, "Tired", "Mệt Mỏi", R.raw.sound_tired));

    }
}
