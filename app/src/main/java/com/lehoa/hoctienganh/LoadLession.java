package com.lehoa.hoctienganh;

import com.lehoa.hoctienganh.Lession.Action;
import com.lehoa.hoctienganh.Lession.Alphabets;
import com.lehoa.hoctienganh.Lession.Animals;
import com.lehoa.hoctienganh.Lession.Body;
import com.lehoa.hoctienganh.Lession.Careers;
import com.lehoa.hoctienganh.Lession.Colors;
import com.lehoa.hoctienganh.Lession.Emotions;
import com.lehoa.hoctienganh.Lession.Foods;
import com.lehoa.hoctienganh.Lession.Fruits;
import com.lehoa.hoctienganh.Lession.Home;
import com.lehoa.hoctienganh.Lession.Landscapes;
import com.lehoa.hoctienganh.Lession.Numbers;
import com.lehoa.hoctienganh.Lession.Transport;
import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.Lession.Sports;

import java.util.ArrayList;
// sử dụng cho màn hình main
public class LoadLession {
    int id;
    ArrayList<ItemLession> arrayList;

    public LoadLession(int id, ArrayList<ItemLession> arrayList) {
        this.id = id;
        this.arrayList = arrayList;

        if(id == 0){
            new Alphabets(arrayList);
        }
        if(id == 1){
            new Numbers(arrayList);
        }
        if(id == 2){
            new Colors(arrayList);
        }
        if(id == 3){
            new Fruits(arrayList);
        }
        if(id == 4){
            new Animals(arrayList);
        }
        if(id == 5){
            new Foods(arrayList);
        }
        if(id == 6){
            new Home(arrayList);
        }
        if(id == 7){
            new Careers(arrayList);
        }
        if(id == 8){
            new Transport(arrayList);
        }
        if(id == 9){
            new Body(arrayList);
        }
        if(id == 10){
            new Emotions(arrayList);
        }
        if(id == 11){
            new Sports(arrayList);
        }
        if(id == 12){
            new Landscapes(arrayList);
        }
        if(id == 13){
            new Action(arrayList);
        }

    }
}
