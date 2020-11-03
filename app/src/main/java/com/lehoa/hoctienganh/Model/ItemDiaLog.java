package com.lehoa.hoctienganh.Model;

public class ItemDiaLog {
    public ItemDiaLog(int id, Integer imgdialog, String name) {
        this.id = id;
        this.imgdialog = imgdialog;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getImgdialog() {
        return imgdialog;
    }

    public void setImgdialog(Integer imgdialog) {
        this.imgdialog = imgdialog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int id;
    Integer imgdialog;
    String name;
}
