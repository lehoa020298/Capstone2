package com.lehoa.hoctienganh.Lession;

import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Home {
    ArrayList<ItemLession> arrayList;

    public Home(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_bed, "Bed", "Cái Giường", R.raw.sound_bed));
        arrayList.add(new ItemLession(1, R.drawable.img_wardrobe, "Wardrode", "Tủ Quần Áo", R.raw.sound_wardrode));
        arrayList.add(new ItemLession(2, R.drawable.img_sofa, "Sofa", "Ghế Sopha", R.raw.sound_sofa));
        arrayList.add(new ItemLession(3, R.drawable.img_lamp, "Lamp", "Đèn", R.raw.sound_lamp));
        arrayList.add(new ItemLession(4, R.drawable.img_fan, "Fan", "Quạt", R.raw.sound_fan));
        arrayList.add(new ItemLession(5, R.drawable.img_fridge, "Fridge", "Tủ Lạnh", R.raw.sound_fridge));
        arrayList.add(new ItemLession(6, R.drawable.img_oven, "Oven", "Lò Nướng", R.raw.sound_oven));
        arrayList.add(new ItemLession(7, R.drawable.img_cooker, "Cooker", "Nồi Cơm Điện", R.raw.sound_cooker));
        arrayList.add(new ItemLession(8, R.drawable.img_blanket, "Blanket", "Khăn", R.raw.sound_blanket));
        arrayList.add(new ItemLession(9, R.drawable.img_laptop, "Laptop", "Máy Tính Xách Tay", R.raw.sound_laptop));
        arrayList.add(new ItemLession(10, R.drawable.img_chair, "Chair", "Ghế Đẩu", R.raw.sound_chair));
        arrayList.add(new ItemLession(11, R.drawable.img_table, "Table", "Bàn", R.raw.sound_table));
        arrayList.add(new ItemLession(12, R.drawable.img_bookshelf, "Bookshelf", "Kệ Sách", R.raw.sound_bookshelf));
        arrayList.add(new ItemLession(13, R.drawable.img_pillow, "Pillow", "Gối", R.raw.sound_pillow));
        arrayList.add(new ItemLession(14, R.drawable.img_trash_can, "Trash Can", "Thùng Rác", R.raw.sound_trashcan));
        arrayList.add(new ItemLession(15, R.drawable.img_iron, "Iron", "Bàn Ủi", R.raw.sound_iron));
        arrayList.add(new ItemLession(16, R.drawable.img_mirror, "Mirror", "Gương", R.raw.sound_mirror));
        arrayList.add(new ItemLession(17, R.drawable.img_clock, "Clock", "Đồng Hồ", R.raw.sound_clock));
        arrayList.add(new ItemLession(18, R.drawable.img_basket, "Basket", "Cái Giỏ", R.raw.sound_basket));
        arrayList.add(new ItemLession(19, R.drawable.img_shower, "Shower", "Vòi Sen", R.raw.sound_shower));
    }
}
