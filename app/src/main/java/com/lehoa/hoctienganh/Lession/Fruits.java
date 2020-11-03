package com.lehoa.hoctienganh.Lession;

import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Fruits {
    ArrayList<ItemLession> arrayList;

    public Fruits(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_mango, "Mango", "Quả Xoài", R.raw.sound_mango));
        arrayList.add(new ItemLession(1, R.drawable.img_lemon, "Lemon", "Quả Chanh", R.raw.sound_lemon));
        arrayList.add(new ItemLession(2, R.drawable.img_apple, "Apple", "Quả Táo", R.raw.sound_apple));
        arrayList.add(new ItemLession(3, R.drawable.img_grapes, "Grape", "Quả Nho", R.raw.sound_grape));
        arrayList.add(new ItemLession(4, R.drawable.img_custard_apple, "Custard apple", "Quả Na", R.raw.sound_custardapple));
        arrayList.add(new ItemLession(5, R.drawable.img_payaya, "Papaya", "Quả Đu Đủ", R.raw.sound_papaya));
        arrayList.add(new ItemLession(6, R.drawable.img_tomato, "Tomato", "Quả Cà Chua", R.raw.sound_tomato));
        arrayList.add(new ItemLession(7, R.drawable.img_pineapple, "Pineapple", "Quả Dứa", R.raw.sound_pineapple));
        arrayList.add(new ItemLession(8, R.drawable.img_cherry, "Cherry", "Quả Anh Đào", R.raw.sound_cherry));
        arrayList.add(new ItemLession(9, R.drawable.img_pear, "Pear", "Quả Lê", R.raw.sound_pear));
        arrayList.add(new ItemLession(10, R.drawable.img_strawberry, "Strawbery", "Quả Dâu", R.raw.sound_strawbery));
        arrayList.add(new ItemLession(11, R.drawable.img_banana, "Banana", "Quả Chuối", R.raw.sound_banana));
        arrayList.add(new ItemLession(12, R.drawable.img_watermelon, "Watermelon", "Quả Dưa Hấu", R.raw.sound_watermelon));

        arrayList.add(new ItemLession(13, R.drawable.img_coconut, "Coconut", "Quả Dừa", R.raw.sound_coconut));
        arrayList.add(new ItemLession(14, R.drawable.img_dragon_fruit, "Dragon Fruit", "Quả Thanh Long", R.raw.sound_dragonfruit));
        arrayList.add(new ItemLession(15, R.drawable.img_durian, "Durian", "Quả Sầu Riêng", R.raw.sound_durian));
        arrayList.add(new ItemLession(16, R.drawable.img_guava, "Guava", "Quả Ổi", R.raw.sound_guava));
        arrayList.add(new ItemLession(17, R.drawable.img_jackfruit, "jackfruit", "Quả Mít", R.raw.sound_jackfruit));
        arrayList.add(new ItemLession(18, R.drawable.img_longan, "Longan", "Quả Nhãn", R.raw.sound_longan));
        arrayList.add(new ItemLession(19, R.drawable.img_lychee, "Lychee", "Quả Vải", R.raw.sound_lychee));
        arrayList.add(new ItemLession(20, R.drawable.img_raisin, "Raisin", "Nho Khô", R.raw.sound_raisin));
        arrayList.add(new ItemLession(21, R.drawable.img_rambutan, "Rambutan", "Quả Chôm Chôm", R.raw.sound_rambutan));
        arrayList.add(new ItemLession(22, R.drawable.img_tamarind, "Tamarind", "Quả Me", R.raw.sound_tamarind));
    }
}
