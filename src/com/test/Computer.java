package com.test;

public class Computer extends CPU{
    CPU cpu = new CPU();
    public Computer(){
    }
    public Computer(String name,int n,int p){
        cpu.setName(name);
        cpu.setCoreNum(n);
        cpu.setPrice(p);
    }
}
