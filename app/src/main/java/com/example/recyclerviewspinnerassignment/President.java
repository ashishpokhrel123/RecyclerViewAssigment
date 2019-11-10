package com.example.recyclerviewspinnerassignment;

public class President {

    private String name;
    private String desc;
    private int imgid;

    public President(String name, String desc, int imgid) {

        this.name = name;
        this.desc = desc;
        this.imgid = imgid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {

        this.desc = desc;
    }

    public int  getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {

         this.imgid=imgid;
    }
}




