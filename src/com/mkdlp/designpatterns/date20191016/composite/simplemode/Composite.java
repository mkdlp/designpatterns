package com.mkdlp.designpatterns.date20191016.composite.simplemode;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> comList=new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        comList.add(c);
    }

    @Override
    public void remove(Component c) {
        comList.remove(c);
    }

    @Override
    public void operation(int depth) {
        String preFix=super.getPrefix(depth);
        System.out.println(preFix+this.name);
        for(Component c:comList){
            c.operation(depth+2);
        }
    }
}
