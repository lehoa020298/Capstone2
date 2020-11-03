package com.lehoa.hoctienganh.Lession;

import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class Careers {
    ArrayList<ItemLession> arrayList;

    public Careers(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, R.drawable.img_chef, "Chef", "Đầu Bếp", R.raw.sound_chef));
        arrayList.add(new ItemLession(1, R.drawable.img_doctor, "Doctor", "Bác Sĩ", R.raw.sound_doctor));
        arrayList.add(new ItemLession(2, R.drawable.img_fireman, "Fireman", "Lính Cứu Hoả", R.raw.sound_fireman));
        arrayList.add(new ItemLession(3, R.drawable.img_fammer, "Farmer", "Nông Dân", R.raw.sound_farmer));
        arrayList.add(new ItemLession(4, R.drawable.img_nurse, "Nurse", "Y Tá", R.raw.sound_nurse));
        arrayList.add(new ItemLession(5, R.drawable.img_police, "Police", "Cảnh Sát", R.raw.sound_police));
        arrayList.add(new ItemLession(6, R.drawable.img_postman, "Postman", "Người Đưa Thư", R.raw.sound_postman));
        arrayList.add(new ItemLession(7, R.drawable.img_pilot, "Pilot", "Phi Công", R.raw.sound_pilot));
        arrayList.add(new ItemLession(8, R.drawable.img_teacher, "Teacher", "Giáo Viên", R.raw.sound_teacher));
        arrayList.add(new ItemLession(9, R.drawable.img_student, "Student", "Học Sinh", R.raw.sound_student));
        arrayList.add(new ItemLession(10, R.drawable.img_barber, "Barber", "Thợ Cắt Tóc", R.raw.sound_barber));
        arrayList.add(new ItemLession(11, R.drawable.img_singer, "Singer", "Ca Sĩ", R.raw.sound_singer));
        arrayList.add(new ItemLession(12, R.drawable.img_dentist, "Dentist", "Nha Sĩ", R.raw.sound_dentist));
        arrayList.add(new ItemLession(13, R.drawable.img_astronaut, "Astronaut", "Phi Hành Gia", R.raw.sound_astronaut));
        arrayList.add(new ItemLession(14, R.drawable.img_baker, "Baker", "Thợ Làm Bánh", R.raw.sound_barber));
        arrayList.add(new ItemLession(15, R.drawable.img_poet, "Poet", "Nhà Thơ", R.raw.sound_poet));
        arrayList.add(new ItemLession(16, R.drawable.img_detective, "Detective", "Nhà Thám Tử", R.raw.sound_detective));
        arrayList.add(new ItemLession(17, R.drawable.img_worker, "Worker", "Công Nhân", R.raw.sound_worker));
        arrayList.add(new ItemLession(18, R.drawable.img_engineer, "Engineer", "Kĩ Sư", R.raw.sound_engineer));
    }
}
