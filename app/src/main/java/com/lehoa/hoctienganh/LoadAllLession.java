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
// sử dụng cho màn hình play games
public class LoadAllLession{

    ArrayList<ItemLession> arrayList;

    public LoadAllLession(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;

        new Alphabets(arrayList);
        new Numbers(arrayList);
        new Colors(arrayList);
        new Fruits(arrayList);
        new Animals(arrayList);
        new Foods(arrayList);
        new Home(arrayList);
        new Careers(arrayList);
        new Transport(arrayList);
        new Body(arrayList);
        new Emotions(arrayList);
        new Sports(arrayList);
        new Landscapes(arrayList);
        new Action(arrayList);
    }
}
