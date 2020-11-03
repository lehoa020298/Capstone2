package com.lehoa.hoctienganh.Lession;

import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Transport {
    ArrayList<ItemLession> arrayList;

    public Transport(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_truck, "Truck", "Xe Tải", R.raw.sound_truck));
        arrayList.add(new ItemLession(1, R.drawable.img_taxi, "Taxi", "Xe Taxi", R.raw.sound_taxi));
        arrayList.add(new ItemLession(2, R.drawable.img_car, "Car", "Xe Hơi", R.raw.sound_car));
        arrayList.add(new ItemLession(3, R.drawable.img_ambulance, "Ambulance", "Xe Cứu Thương", R.raw.sound_ambulance));
        arrayList.add(new ItemLession(4, R.drawable.img_fire_engine, "Fire Engine", "Xe Cứu Hoả", R.raw.sound_fireengine));
        arrayList.add(new ItemLession(5, R.drawable.img_submarine, "Submarine", "Tàu Ngầm", R.raw.sound_submarine));
        arrayList.add(new ItemLession(6, R.drawable.img_bicycle, "Bicycle", "Xe Đạp", R.raw.sound_bicycle));
        arrayList.add(new ItemLession(7, R.drawable.img_plane, "Plane", "Máy Bay Phản Lực", R.raw.sound_plane));
        arrayList.add(new ItemLession(8, R.drawable.img_helicopter, "Helicopter", "Máy Bay Trực Thăng", R.raw.sound_helicopter));
        arrayList.add(new ItemLession(9, R.drawable.img_train, "Train", "Tàu Lửa", R.raw.sound_train));
        arrayList.add(new ItemLession(10, R.drawable.img_subway, "Subway", "Tàu Điện Ngầm", R.raw.sound_subway));
        arrayList.add(new ItemLession(11, R.drawable.img_ship, "Ship", "Tàu Thuỷ", R.raw.sound_ship));
        arrayList.add(new ItemLession(12, R.drawable.img_yacht, "Yacht", "Thuyền Buồm", R.raw.sound_yacht));
        arrayList.add(new ItemLession(13, R.drawable.img_tank, "Tank", "Xe Tăng", R.raw.sound_tank));
        arrayList.add(new ItemLession(14, R.drawable.img_tractor, "Tractor", "Máy Kéo", R.raw.sound_tractor));
        arrayList.add(new ItemLession(15, R.drawable.img_forklift, "Forklift", "Xe Nâng", R.raw.sound_forklift));
        arrayList.add(new ItemLession(16, R.drawable.img_carriage, "Carriage", "Xe Ngựa", R.raw.sound_carriage));
        arrayList.add(new ItemLession(17, R.drawable.img_motorbike, "Motorbike", "Xe Moto", R.raw.sound_motorbike));
        arrayList.add(new ItemLession(18, R.drawable.img_space_shuttle, "Space Shuttle", "Phi Thuyền", R.raw.sound_spaceshuttle));
        arrayList.add(new ItemLession(19, R.drawable.img_boat, "Boat", "Thuyền", R.raw.sound_boat));
    }
}
