package com.mkdlp.designpatterns.date20190909.builder.innerclass;

public class ConcreteBuilder implements Builder {

    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public Builder buildA(String res) {
        product.setBuildA(res);
        return this;
    }

    @Override
    public Builder buildB(String res) {
        product.setBuildB(res);
        return this;
    }

    @Override
    public Builder buildC(String res) {
        product.setBuildC(res);
        return this;
    }

    @Override
    public Builder buildD(String res) {
        product.setBuildD(res);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }
}
