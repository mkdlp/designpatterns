package com.mkdlp.designpatterns.date20190909.builder.innerclass;

public interface Builder {

    Builder buildA(String res);

    Builder buildB(String res);

    Builder buildC(String res);

    Builder buildD(String res);

    Product build();

}
