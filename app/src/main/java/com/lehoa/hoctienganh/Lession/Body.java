package com.lehoa.hoctienganh.Lession;

import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Body {
    ArrayList<ItemLession> arrayList;

    public Body(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_body, "Body", "Cơ Thể", R.raw.sound_body));
        arrayList.add(new ItemLession(1, R.drawable.img_back, "Back", "Lưng", R.raw.sound_back));
        arrayList.add(new ItemLession(2, R.drawable.img_arm, "Arm", "Vai", R.raw.sound_arm));
        arrayList.add(new ItemLession(3, R.drawable.img_blood, "Blood", "Máu", R.raw.sound_blood));
        arrayList.add(new ItemLession(4, R.drawable.img_bone, "Bone", "Xương", R.raw.sound_bone));
        arrayList.add(new ItemLession(5, R.drawable.img_ear, "Ear", "Tai", R.raw.sound_ear));
        arrayList.add(new ItemLession(6, R.drawable.img_eye, "Eye", "Mắt", R.raw.sound_eye));
        arrayList.add(new ItemLession(7, R.drawable.img_finger, "Finger", "Ngón Tay", R.raw.sound_finger));
        arrayList.add(new ItemLession(8, R.drawable.img_foot, "Foot", "Bàn Chân", R.raw.sound_foot));
        arrayList.add(new ItemLession(9, R.drawable.img_hair, "Hair", "Tóc", R.raw.sound_hair));
        arrayList.add(new ItemLession(10, R.drawable.img_hand, "Hand", "Bàn Tay", R.raw.sound_hand));
        arrayList.add(new ItemLession(11, R.drawable.img_head, "Head", "Đầu", R.raw.sound_head));
        arrayList.add(new ItemLession(12, R.drawable.img_heart, "Heart", "Tim", R.raw.sound_heart));
        arrayList.add(new ItemLession(13, R.drawable.img_knee, "Knee", "Đầu Gối", R.raw.sound_knee));
        arrayList.add(new ItemLession(14, R.drawable.img_leg, "Leg", "Chân", R.raw.sound_leg));
        arrayList.add(new ItemLession(15, R.drawable.img_lip, "Lip", "Môi", R.raw.sound_lip));
        arrayList.add(new ItemLession(16, R.drawable.img_nose, "Nose", "Mũi", R.raw.sound_nose));
        arrayList.add(new ItemLession(17, R.drawable.img_tongue, "Tongue", "Lưỡi", R.raw.sound_tongue));
        arrayList.add(new ItemLession(18, R.drawable.img_tooth, "Tooth", "Răng", R.raw.sound_tooth));
        arrayList.add(new ItemLession(19, R.drawable.img_thumb, "Thumb", "Ngón Cái", R.raw.sound_thumb));

    }
}
