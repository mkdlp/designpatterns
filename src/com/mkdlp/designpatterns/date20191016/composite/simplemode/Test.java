package com.mkdlp.designpatterns.date20191016.composite.simplemode;

public class Test {
    public static void main(String[] args) {
        Composite root=new Composite("root");
        root.add(new Leaf("leaf a"));
        root.add(new Leaf("leaf b"));

        Composite comp=new Composite("Composite x");
        comp.add(new Leaf("leaf xa"));
        comp.add(new Leaf("leaf xb"));

        root.add(comp);

        Composite comp2=new Composite("Composite xy");
        comp2.add(new Leaf("leaf xya"));
        comp2.add(new Leaf("leaf xyb"));
        comp.add(comp2);

        Leaf leafD=new Leaf("LeafD");
        root.add(leafD);
        root.remove(leafD);

        root.operation(1);
    }
}
