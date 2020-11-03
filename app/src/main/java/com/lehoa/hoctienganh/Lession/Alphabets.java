package com.lehoa.hoctienganh.Lession;

import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Alphabets {
    ArrayList<ItemLession> arrayList;

    public Alphabets(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_a, "A", "", R.raw.sound_a));
        arrayList.add(new ItemLession(1, R.drawable.img_b, "B", "", R.raw.sound_b));
        arrayList.add(new ItemLession(2, R.drawable.img_c, "C", "", R.raw.sound_c));
        arrayList.add(new ItemLession(3, R.drawable.img_d, "D", "", R.raw.sound_d));
        arrayList.add(new ItemLession(4, R.drawable.img_e, "E", "", R.raw.sound_e));
        arrayList.add(new ItemLession(5, R.drawable.img_f, "F", "", R.raw.sound_f));
        arrayList.add(new ItemLession(6, R.drawable.img_g, "G", "", R.raw.sound_g));
        arrayList.add(new ItemLession(7, R.drawable.img_h, "H", "", R.raw.sound_h));
        arrayList.add(new ItemLession(8, R.drawable.img_i, "I", "", R.raw.sound_i));
        arrayList.add(new ItemLession(9, R.drawable.img_j, "J", "", R.raw.sound_j));
        arrayList.add(new ItemLession(10, R.drawable.img_k, "K", "", R.raw.sound_k));
        arrayList.add(new ItemLession(11, R.drawable.img_l, "L", "", R.raw.sound_l));
        arrayList.add(new ItemLession(12, R.drawable.img_m, "M", "", R.raw.sound_m));
        arrayList.add(new ItemLession(13, R.drawable.img_n, "N", "", R.raw.sound_o));
        arrayList.add(new ItemLession(14, R.drawable.img_o, "O", "", R.raw.sound_n));
        arrayList.add(new ItemLession(15, R.drawable.img_p, "P", "", R.raw.sound_p));
        arrayList.add(new ItemLession(16, R.drawable.img_q, "Q", "", R.raw.sound_q));
        arrayList.add(new ItemLession(17, R.drawable.img_r, "R", "", R.raw.sound_r));
        arrayList.add(new ItemLession(18, R.drawable.img_s, "S", "", R.raw.sound_s));
        arrayList.add(new ItemLession(19, R.drawable.img_t, "T", "", R.raw.sound_t));
        arrayList.add(new ItemLession(20, R.drawable.img_u, "U", "", R.raw.sound_u));
        arrayList.add(new ItemLession(21, R.drawable.img_v, "V", "", R.raw.sound_v));
        arrayList.add(new ItemLession(22, R.drawable.img_w, "W", "", R.raw.sound_w));
        arrayList.add(new ItemLession(23, R.drawable.img_x, "X", "", R.raw.sound_x));
        arrayList.add(new ItemLession(24, R.drawable.img_y, "Y", "", R.raw.sound_y));
        arrayList.add(new ItemLession(25, R.drawable.img_z, "Z", "", R.raw.sound_z));


    }
}
