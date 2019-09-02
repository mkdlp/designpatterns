package com.mkdlp.designpatterns.date20190830.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        StrategyContext context=new StrategyContext("A");
        context.contextStrategy();

        context=new StrategyContext("B");
        context.contextStrategy();
    }
}
