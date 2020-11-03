package com.lehoa.hoctienganh.Lession;


import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Animals {
    ArrayList<ItemLession> arrayList;

    public Animals(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_chicken, "Chicken", "Con Gà", R.raw.sound_chicken));
        arrayList.add(new ItemLession(1, R.drawable.img_cow, "Cow", "Con Bò", R.raw.sound_crow));
        arrayList.add(new ItemLession(2, R.drawable.img_horse, "Horse", "Con Ngựa", R.raw.sound_horse));
        arrayList.add(new ItemLession(3, R.drawable.img_donkey, "Donkey", "Con Lừa", R.raw.sound_donkey));
        arrayList.add(new ItemLession(4, R.drawable.img_sheep, "Sheep", "Con Cừu", R.raw.sound_sheep));
        arrayList.add(new ItemLession(5, R.drawable.img_pig, "Pig", "Con Heo", R.raw.sound_pig));
        arrayList.add(new ItemLession(6, R.drawable.img_dog, "Dog", "Con Chó", R.raw.sound_dog));
        arrayList.add(new ItemLession(7, R.drawable.img_cat, "Cat", "Con Mèo", R.raw.sound_cat));
        arrayList.add(new ItemLession(8, R.drawable.img_goat, "Goat", "Con Dê", R.raw.sound_goat));
        arrayList.add(new ItemLession(9, R.drawable.img_mouse, "Mouse", "Con Chuột", R.raw.sound_mouse));
        arrayList.add(new ItemLession(10, R.drawable.img_rabbit, "Rabbit", "Con Thỏ", R.raw.sound_rabbit));
        arrayList.add(new ItemLession(11, R.drawable.img_lion, "Lion", "Con Sư Tử", R.raw.sound_lion));
        arrayList.add(new ItemLession(12, R.drawable.img_bear, "Bear", "Con gấu", R.raw.sound_bear));
        arrayList.add(new ItemLession(13, R.drawable.img_tiger, "Tiger", "Con Hổ", R.raw.sound_tiger));
        arrayList.add(new ItemLession(14, R.drawable.img_panda, "Panda", "Con Gấu Trúc", R.raw.sound_panda));
        arrayList.add(new ItemLession(15, R.drawable.img_bat, "Bat", "Con Dơi", R.raw.sound_bat));
        arrayList.add(new ItemLession(16, R.drawable.img_spider, "Spider", "Con Nhện", R.raw.sound_spider));
        arrayList.add(new ItemLession(17, R.drawable.img_fish, "Fish", "Con Cá", R.raw.sound_fish));
        arrayList.add(new ItemLession(18, R.drawable.img_whale, "Whale", "Con Cá Voi", R.raw.sound_whale));
        arrayList.add(new ItemLession(19, R.drawable.img_dolphin, "Dolphin", "Con Cá Heo", R.raw.sound_dolphin));
        arrayList.add(new ItemLession(20, R.drawable.img_elephant, "Elephant", "Con Voi", R.raw.sound_elephant));
        arrayList.add(new ItemLession(21, R.drawable.img_zebra, "Zebra", "Con Ngựa Vằn", R.raw.sound_zebra));
        arrayList.add(new ItemLession(22, R.drawable.img_monkey, "Monkey", "Con Khỉ", R.raw.sound_monkey));
        arrayList.add(new ItemLession(23, R.drawable.img_kangaroo, "Kangaroo", "Chuột Túi", R.raw.sound_kangaroo));
    }
}
