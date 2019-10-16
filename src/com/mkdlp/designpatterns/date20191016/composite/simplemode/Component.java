package com.mkdlp.designpatterns.date20191016.composite.simplemode;

public abstract class Component {

    protected String name;

    public Component() {
    }

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void operation(int depth);

    public String getPrefix(int times){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<times;i++){
            sb.append("-");
        }
        return sb.toString();
    }
}
