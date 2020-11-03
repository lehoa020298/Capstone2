package com.lehoa.hoctienganh.Lession;

import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Action {
    ArrayList<ItemLession> arrayList;

    public Action(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_carry, "Carry", "Mang vác", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, R.drawable.img_crawl, "Crawl", "Bò", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, R.drawable.img_crouch, "Crouch", "Ngồi Co Lại", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, R.drawable.img_dive, "Dive", "Lặn", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, R.drawable.img_hit, "Hit", "Đánh", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, R.drawable.img_hold, "Hold", "Giữ", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, R.drawable.img_jump, "Jump", "Nhảy", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, R.drawable.img_kick, "Kick", "Đá", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, R.drawable.img_lift, "Lift", "Nâng", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, R.drawable.img_pick_up, "Pick Up", "Nhặt lên", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, R.drawable.img_pull, "Pull", "Kéo", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, R.drawable.img_push, "Push", "Đẩy", R.raw.sound_push));
        arrayList.add(new ItemLession(12, R.drawable.img_run, "Run", "Chạy", R.raw.sound_run));
        arrayList.add(new ItemLession(13, R.drawable.img_sit, "Sit", "Ngồi", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, R.drawable.img_throw, "Throw", "Ném", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, R.drawable.img_walk, "Walk", "Đi Bộ", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, R.drawable.img_punch, "Punch,", "Đấm", R.raw.sound_punch));
        arrayList.add(new ItemLession(17, R.drawable.watering, "Sprinklers,", "Tưới nước", R.raw.sound_sprinklers));
        arrayList.add(new ItemLession(18, R.drawable.img_exercise, "Do exercise,", "Tập thể dục", R.raw.sound_doexercise));
        arrayList.add(new ItemLession(19, R.drawable.img_kite, "Fly a kite,", "Thả Diều", R.raw.sound_flyakite));
    }
}
