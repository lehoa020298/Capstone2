package com.lehoa.hoctienganh.Lession;

import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Colors {
    ArrayList<ItemLession> arrayList;

    public Colors(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_white, "White", "Màu Trắng", R.raw.sound_white));
        arrayList.add(new ItemLession(1, R.drawable.img_yellow, "Yellow", "Màu Vàng", R.raw.sound_yellow));
        arrayList.add(new ItemLession(2, R.drawable.img_orange, "Orange", "Màu Cam", R.raw.sound_orange));
        arrayList.add(new ItemLession(3, R.drawable.img_pink, "Pink", "Màu Hồng", R.raw.sound_pink));
        arrayList.add(new ItemLession(4, R.drawable.img_red, "Red", "Màu Đỏ", R.raw.sound_red));
        arrayList.add(new ItemLession(5, R.drawable.img_brown, "Brown", "Màu Nâu", R.raw.sound_brown));
        arrayList.add(new ItemLession(6, R.drawable.img_green, "Green", "Màu Xanh Lá", R.raw.sound_green));
        arrayList.add(new ItemLession(7, R.drawable.img_blue, "Blue", "Màu Xanh Dương", R.raw.sound_blue));
        arrayList.add(new ItemLession(8, R.drawable.img_purple, "Purple", "Màu Tím", R.raw.sound_purple));
        arrayList.add(new ItemLession(9, R.drawable.img_grey, "Grey", "Màu Xám", R.raw.sound_grey));
        arrayList.add(new ItemLession(10, R.drawable.img_black, "Black", "Màu Đen", R.raw.sound_black));
        arrayList.add(new ItemLession(11, R.drawable.imgbr_5, "momentum", "Màu Đà", R.raw.sound_momentum));
    }
}
