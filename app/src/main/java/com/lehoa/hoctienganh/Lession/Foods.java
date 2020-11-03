package com.lehoa.hoctienganh.Lession;

import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Foods {
    ArrayList<ItemLession> arrayList;

    public Foods(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_bread, "Bread", "Bánh Mì", R.raw.sound_bread));
        arrayList.add(new ItemLession(1, R.drawable.img_cheese, "Cheese", "Phô Mai", R.raw.sound_cheese));
        arrayList.add(new ItemLession(2, R.drawable.img_food_chicken, "Chicken", "Thịt Gà", R.raw.sound_chicken));
        arrayList.add(new ItemLession(3, R.drawable.img_chocolate, "Chocolate", "Socola", R.raw.sound_chocolate));
        arrayList.add(new ItemLession(4, R.drawable.img_egg, "Egg", "Trứng", R.raw.sound_egg));
        arrayList.add(new ItemLession(5, R.drawable.img_food_fish, "Fish", "Cá", R.raw.sound_fish));
        arrayList.add(new ItemLession(6, R.drawable.img_ice_cream, "Ice Cream", "Kem", R.raw.sound_icecream));
        arrayList.add(new ItemLession(7, R.drawable.img_rice, "Rice", "Cơm", R.raw.sound_rice));
        arrayList.add(new ItemLession(8, R.drawable.img_noodle, "Noodle", "Mì", R.raw.sound_noodle));
        arrayList.add(new ItemLession(9, R.drawable.img_nuts, "Nuts", "Quả Hạch", R.raw.sound_nuts));
        arrayList.add(new ItemLession(10, R.drawable.img_pizza, "Pizza", "Bánh Pizza", R.raw.sound_pizza));
        arrayList.add(new ItemLession(11, R.drawable.img_sanwich, "Sandwich", "Bánh Sandwich", R.raw.sound_sandwich));
        arrayList.add(new ItemLession(12, R.drawable.img_cake, "Cake", "Bánh Ngọt", R.raw.sound_cake));
        arrayList.add(new ItemLession(13, R.drawable.img_hamburger, "Hamburger", "Bánh Hamburger", R.raw.sound_hamburger));
        arrayList.add(new ItemLession(14, R.drawable.img_butter, "Butter", "Bơ", R.raw.sound_butter));
        arrayList.add(new ItemLession(15, R.drawable.img_beef, "Beef", "Thịt Bò", R.raw.sound_beef));
        arrayList.add(new ItemLession(16, R.drawable.img_pork, "Pork", "Thịt Heo", R.raw.sound_pork));
        arrayList.add(new ItemLession(17, R.drawable.img_sausage, "Sausage", "Xúc Xích", R.raw.sound_sausage));
        arrayList.add(new ItemLession(18, R.drawable.img_steak, "Steak", "Bò hầm", R.raw.sound_steak));
    }
}
