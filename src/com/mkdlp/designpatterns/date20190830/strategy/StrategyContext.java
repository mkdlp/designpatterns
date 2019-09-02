package com.mkdlp.designpatterns.date20190830.strategy;
/**
* @description 上下文
* @author  mkdlp
* @date  2019/8/30 10:57
*/
public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(String strategyType) {
        switch (strategyType){
            case "A":
                this.strategy = new StrategyA();
                break;
            case "B":
                this.strategy = new StrategyB();
                break;
        }
    }

    public void contextStrategy(){
        strategy.doStrategy();
    }
}
