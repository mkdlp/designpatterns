package com.mkdlp.designpatterns.date20190828.simplefactory;

import com.mkdlp.designpatterns.date20190828.simplefactory.AppleJuice;
import com.mkdlp.designpatterns.date20190828.simplefactory.BananaJuice;
import com.mkdlp.designpatterns.date20190828.simplefactory.Juice;
import com.mkdlp.designpatterns.date20190828.simplefactory.PearJuice;

public class SimpleJuiceFactory {

    public static Juice getJuice(String juiceName){
        Juice juice=null;
        switch(juiceName){
            case "apple":
                juice = new AppleJuice();
                break;
            case "pear":
                juice = new PearJuice();
                break;
            case "banana":
                juice = new BananaJuice();
                break;
        }
        return juice;
    }


    public static void main(String[] args) {
        Juice juice=getJuice("apple");
        juice.saleJuice();
    }
}
