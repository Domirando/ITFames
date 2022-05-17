package com.example.recyclerview.model;

import java.io.Serializable;

public class Product implements Serializable {
    String name, dec, fullDesc;
    int img;
    public String title(String smth, String s){
        String desc = "";
        int j = 0;
        if(s.equals("title")){
            String title="";
            for (int i = 0; i < smth.length(); i++) {
                char myString = smth.charAt(i);
                j = i;
                if (myString != '.') {
                    title += myString;
                }else{
                    desc=title;
                    j = i;
                    break;
                }
            }
        }else if(s.equals("desc")){
            String r = "";
            for (int i = j; i < smth.length(); i++) {
                r += String.valueOf(smth.charAt(i));
            }
            desc = r;
        }
        return desc;
    }
    public Product(String name, String dec, int img) {
        this.name = name;
        this.dec = title(dec, "title");
        this.fullDesc = title(dec, "desc");
        this.img = img;
    }

    public String getName() {
        return dec;
    }

    public String fullDesc() {
        return fullDesc;
    }

    public int getImg() {
        return img;
    }
}
