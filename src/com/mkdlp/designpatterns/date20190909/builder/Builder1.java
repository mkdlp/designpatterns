package com.mkdlp.designpatterns.date20190909.builder;

public class Builder1 implements IBuilder{

    private Product product;

    public Builder1() {
        this.product = new Product();
    }

    @Override
    public void buildPart1() {
        System.out.println("builder1:建造part1");
        product.setPart1("part1");
    }

    @Override
    public void buildPart2() {
        System.out.println("builder1:建造part2");
        product.setPart2("part2");
    }

    @Override
    public void buildPart3() {
        System.out.println("builder1:建造part3");
        product.setPart3("part3");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
