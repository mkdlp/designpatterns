package com.mkdlp.designpatterns.date20190917.reflectabstractfactory;

public class Producer {

    public final static String foodName="com.mkdlp.designpatterns.date20190917.reflectabstractfactory.FoodA";

    //public final String foodName="com.mkdlp.designpatterns.date20190917.reflectabstractfactory.FoodA";

    public static Food getFood(){
        Food food=null;
        try {
            Class clz=Class.forName(foodName);
            food=(Food)clz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return food;
    }

    public static void main(String[] args) {
        Food food=getFood();
        food.test();
    }

}
