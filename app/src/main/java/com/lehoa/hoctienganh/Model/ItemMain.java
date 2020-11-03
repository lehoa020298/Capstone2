package com.lehoa.hoctienganh.Model;

public class ItemMain {

    public ItemMain(Integer id, Integer background, Integer img, String name) {
        this.id = id;
        this.background = background;
        this.img = img;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBackground() {
        return background;
    }

    public void setBackground(Integer background) {
        this.background = background;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer id;
    Integer background;
    Integer img;
    String name;

}
