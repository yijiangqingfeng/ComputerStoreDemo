package com.test;

/*
 * 这里是一份简介，我们最终要实现一个ComputerStore
 * 它里面售卖一些组装机，这些组装机有四个硬件，我在这里帮你们定义了一个硬件基类，后面的硬件可以来继承该基类，并添加一些新属性
 * 要求：在硬件基类里声明name,price属性（注意访问限制），禁止使用public，完成getter和setter方法
 * */
public class Hardware{
    protected String name;
    protected double price;
    public void setName(String n) {
        name = n;
    }
    public void setPrice(double p) {
        price = p;
    }
    public String getName() {
        return name;
    }
    public double getPrice () {
        return price;
    }
}
