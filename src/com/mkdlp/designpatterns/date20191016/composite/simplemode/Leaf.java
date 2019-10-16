package com.mkdlp.designpatterns.date20191016.composite.simplemode;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("当前类不支持此功能");
    }

    @Override
    public void remove(Component c) {
        System.out.println("当前类不支持此功能");
    }

    @Override
    public void operation(int depth) {
        String preFix=super.getPrefix(depth);
        System.out.println(preFix+this.name);
    }
}
