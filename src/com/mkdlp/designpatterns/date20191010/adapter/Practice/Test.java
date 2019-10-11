package com.mkdlp.designpatterns.date20191010.adapter.Practice;

public class Test {

    public static void main(String[] args) {
        Player f=new Forwards();
        f.attack();
        f.defence();
        Player g=new Guards();
        g.attack();
        g.defence();
        Player c=new Center();
        c.attack();
        c.defence();
        Player fc=new Adapter(new ForeignCenter());
        fc.attack();
        fc.defence();
    }
}
