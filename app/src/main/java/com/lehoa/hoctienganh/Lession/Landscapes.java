package com.lehoa.hoctienganh.Lession;

import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Landscapes {
    ArrayList<ItemLession> arrayList;

    public Landscapes(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_abyss, "Abyss", "Vực Thẳm", R.raw.sound_abyss));
        arrayList.add(new ItemLession(1, R.drawable.img_desert, "Desert", "Sa Mạc", R.raw.sound_desert));
        arrayList.add(new ItemLession(2, R.drawable.img_hill, "Hill", "Đồi", R.raw.sound_hill));
        arrayList.add(new ItemLession(3, R.drawable.img_island, "Island", "Đảo", R.raw.sound_island));
        arrayList.add(new ItemLession(4, R.drawable.img_lake, "Lake", "Hồ", R.raw.sound_lake));
        arrayList.add(new ItemLession(5, R.drawable.img_mountain, "Mountain", "Núi", R.raw.sound_mountain));
        arrayList.add(new ItemLession(6, R.drawable.img_plain, "Plain", "Đồng Bằng", R.raw.sound_plain));
        arrayList.add(new ItemLession(7, R.drawable.img_plateau, "Plateau", "Cao Nguyên", R.raw.sound_plateau));
        arrayList.add(new ItemLession(8, R.drawable.img_river, "River", "Sông", R.raw.sound_river));
        arrayList.add(new ItemLession(9, R.drawable.img_sea, "Sea", "Biển", R.raw.sound_sea));
        arrayList.add(new ItemLession(10, R.drawable.img_forest, "Forest", "Rừng", R.raw.sound_forest));
        arrayList.add(new ItemLession(11, R.drawable.img_valley, "Valley", "Thung Lũng", R.raw.sound_valley));
        arrayList.add(new ItemLession(12, R.drawable.img_volcano, "Volcano", "Núi Lửa", R.raw.sound_volcano));
        arrayList.add(new ItemLession(13, R.drawable.img_waterfall, "Waterfall", "Thác Nước", R.raw.sound_waterfall));
    }
}
