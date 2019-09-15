package com.mkdlp.designpatterns.date20190907.template;

/**
 * 将公共的不变的算法逻辑
 * 1、使用抽象类定义模板类，并在其中定义所有的基本方法、模板方法，钩子方法，不限数量，以实现功能逻辑为主。
 * 其中基本方法使用final修饰，其中要调用基本方法和钩子方法，基本方法和钩子方法可以使用protected修饰，表明可被子类修改。
 * 2、定义实现抽象类的子类，重写其中的模板方法，甚至钩子方法，完善具体的逻辑。
 * 使用场景：
 * 1、在多个子类中拥有相同的方法，而且逻辑相同时，可以将这些方法抽出来放到一个模板抽象类中。
 * 2、程序主框架相同，细节不同的情况下，也可以使用模板方法。
 */
public abstract class HouseTemplate {

    public final void buildHouse(){
        System.out.println("打地基！");
        System.out.println("灌梁！");
        System.out.println("码砖！");
        System.out.println("封顶！");
        buildDoor();
        buildFloor();
        if(isBuildWardrobe()){
            buildWardrobe();
        }else{
            System.out.println("不安装衣柜!");
        }
    }

    /**
     * 钩子函数
     * @return
     */
    protected boolean isBuildWardrobe(){
        return true;
    }

    public abstract void buildDoor();

    public abstract void buildFloor();

    public abstract void buildWardrobe();

}
