package com.mkdlp.designpatterns.date20190830.strategy;

/**
* @description 策略A
* @author  mkdlp
* @date  2019/8/30 10:58
*/
public class StrategyA implements Strategy{
    @Override
    public void doStrategy() {
        System.out.println("现在执行的是策略A");
    }
}
