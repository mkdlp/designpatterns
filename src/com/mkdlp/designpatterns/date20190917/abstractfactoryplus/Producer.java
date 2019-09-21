package com.mkdlp.designpatterns.date20190917.abstractfactoryplus;

public class Producer {

    public final String foodName="A";

    //public final String foodName="B";

    public Food getFood(){
        Food food=null;
        switch (foodName){
            case "A":
                food= new FoodA();
                break;
            case "B":
                food=  new FoodB();
                break;
        }
        return food;
    }

}
