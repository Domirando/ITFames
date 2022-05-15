package com.example.recyclerview.model;

import java.io.Serializable;

public class Product implements Serializable {
    String name, dec, fullDesc;
    int img;
    public String title(String smth){
        String desc = "";
        for (int i = 0; i < smth.length(); i++) {
            char myString = smth.charAt(i);
            if (myString != '.') {
                desc += myString;
            }else{
                break;
            }
        }
        return desc;
    }
    public Product(String name, String dec, int img) {
        this.name = name;
        this.dec = title(dec);
        this.fullDesc = dec;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getDec() {
        return dec;
    }

    public String fullDesc() {
        return fullDesc;
    }

    public int getImg() {
        return img;
    }
}
