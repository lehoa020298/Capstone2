package com.lehoa.hoctienganh.Lession;

import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Numbers {
    ArrayList<ItemLession> arrayList;

    public Numbers(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_0, "Zero", "Số 0", R.raw.sound_zero));
        arrayList.add(new ItemLession(1, R.drawable.img_1, "One", "Số 1", R.raw.sound_one));
        arrayList.add(new ItemLession(2, R.drawable.img_2, "Two", "Số 2", R.raw.sound_tow));
        arrayList.add(new ItemLession(3, R.drawable.img_3, "Three", "Số 3", R.raw.sound_three));
        arrayList.add(new ItemLession(4, R.drawable.img_4, "Four", "Số 4", R.raw.sound_four));
        arrayList.add(new ItemLession(5, R.drawable.img_5, "Five", "Số 5", R.raw.sound_file));
        arrayList.add(new ItemLession(6, R.drawable.img_6, "Six", "Số 6", R.raw.sound_six));
        arrayList.add(new ItemLession(7, R.drawable.img_7, "Seven", "Số 7", R.raw.sound_seven));
        arrayList.add(new ItemLession(8, R.drawable.img_8, "Eight", "Số 8", R.raw.sound_eight));
        arrayList.add(new ItemLession(9, R.drawable.img_9, "Nine", "Số 9", R.raw.sound_night));
        arrayList.add(new ItemLession(10, R.drawable.img_10, "Ten", "Số 10", R.raw.sound_ten));
        arrayList.add(new ItemLession(11, R.drawable.img_11, "Eleven", "Số 11", R.raw.sound_eleven));
        arrayList.add(new ItemLession(12, R.drawable.img_12, "Twelve", "Số 12", R.raw.sound_twelve));
        arrayList.add(new ItemLession(13, R.drawable.img_13, "Thirteen", "Số 13", R.raw.sound_thirteen));
        arrayList.add(new ItemLession(14, R.drawable.img_14, "Fourteen", "Số 14", R.raw.sound_fourteen));
        arrayList.add(new ItemLession(15, R.drawable.img_15, "Fifteen", "Số 15", R.raw.sound_fifteen));
        arrayList.add(new ItemLession(16, R.drawable.img_16, "Sixteen", "Số 16", R.raw.sound_sixteen));
        arrayList.add(new ItemLession(17, R.drawable.img_17, "Seventeen", "Số 17", R.raw.sound_seventeen));
        arrayList.add(new ItemLession(18, R.drawable.img_18, "Eighteen", "Số 18", R.raw.sound_eighteen));
        arrayList.add(new ItemLession(19, R.drawable.img_19, "Nineteen", "Số 19", R.raw.sound_nineteen));
        arrayList.add(new ItemLession(20, R.drawable.img_20, "Twenty", "Số 20", R.raw.sound_twenty));
    }
}
