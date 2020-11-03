package com.lehoa.hoctienganh.Lession;


import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Sports {
    ArrayList<ItemLession> arrayList;

    public Sports(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_baseball, "Baseball", "Bóng Chày", R.raw.sound_baseball));
        arrayList.add(new ItemLession(1, R.drawable.img_basketball, "Basketball", "Bóng Rổ", R.raw.sound_basketball));
        arrayList.add(new ItemLession(2, R.drawable.img_cycling, "Cycling", "Đạp Xe", R.raw.sound_cycling));
        arrayList.add(new ItemLession(3, R.drawable.img_football, "Football", "Bóng Đá", R.raw.sound_football));
        arrayList.add(new ItemLession(4, R.drawable.img_golf, "Golf", "Đánh Golf", R.raw.sound_golf));
        arrayList.add(new ItemLession(5, R.drawable.img_gymnastics, "Gymnastics", "Thể Dục Dụng Cụ", R.raw.sound_gymnastics));
        arrayList.add(new ItemLession(6, R.drawable.img_ice_skating, "Ice Skating", "Trượt Băng", R.raw.sound_iceskating));
        arrayList.add(new ItemLession(7, R.drawable.img_riding, "Riding", "Đua Ngựa", R.raw.sound_riding));
        arrayList.add(new ItemLession(8, R.drawable.img_running, "Running", "Chạy Bộ", R.raw.sound_running));
        arrayList.add(new ItemLession(9, R.drawable.img_skateboarding, "Skateboarding", "Trượt ván", R.raw.sound_skateboarding));
        arrayList.add(new ItemLession(10, R.drawable.img_skiing, "Skiing", "Trượt Tuyết", R.raw.sound_skiing));
        arrayList.add(new ItemLession(11, R.drawable.img_swimming, "Swimming", "Bơi Lội", R.raw.sound_swimming));
        arrayList.add(new ItemLession(12, R.drawable.img_table_tennis, "Table Tennis", "Bóng Bàn", R.raw.sound_tabletennis));
        arrayList.add(new ItemLession(13, R.drawable.img_tennis, "Tennis", "Quần Vợt", R.raw.sound_tennis));
        arrayList.add(new ItemLession(14, R.drawable.img_volleyball, "Volleyball", "Bóng Chuyền", R.raw.sound_volleyball));
        arrayList.add(new ItemLession(15, R.drawable.img_windsurfing, "Windsurfing", "Lướt Ván Buồm", R.raw.sound_windsurfing));
        arrayList.add(new ItemLession(16, R.drawable.ing_badminton, "Badminton", "Cầu Lông", R.raw.sound_badminton));
        arrayList.add(new ItemLession(17, R.drawable.img_rugby, "Rugby", "Bóng Bầu Dục", R.raw.sound_rugby));
    }
}
