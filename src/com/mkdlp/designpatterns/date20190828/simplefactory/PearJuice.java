package com.mkdlp.designpatterns.date20190828.simplefactory;

import com.mkdlp.designpatterns.date20190828.simplefactory.Juice;

public class PearJuice extends Juice {

    @Override
    public void saleJuice() {
        System.out.println("make a Pear juice");
    }
}
