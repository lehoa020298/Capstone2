package com.lehoa.hoctienganh.Model;

public class ItemLession {
    public ItemLession(Integer id, Integer img, String eng, String vie, int file) {
        this.id = id;
        this.img = img;
        this.eng = eng;
        this.vie = vie;
        this.file = file;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getVie() {
        return vie;
    }

    public void setVie(String vie) {
        this.vie = vie;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    Integer id;
    Integer img;
    String eng;
    String vie;
    int file;

}
