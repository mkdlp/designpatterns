package com.mkdlp.designpatterns.date20190902.decorator;

public class ConcreteDecorator extends Decorator {


    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void doAnotherThing1(){
        System.out.println("唱跳");
    }

    public void doAnotherThing2(){
        System.out.println("RAP");
    }

    public void doAnotherThing3(){
        System.out.println("篮球");
    }

    @Override
    public void doSomething() {
        doAnotherThing1();
        doAnotherThing2();
        super.doSomething();
        doAnotherThing3();
    }
}
