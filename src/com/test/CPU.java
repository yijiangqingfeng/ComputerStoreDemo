package com.test;
/*
* 这里是一份简介，我仅仅完成了一个硬件的继承，你们要完成四个硬件的继承，并完成每个硬件特有的属性的声明，以及信息的打印;
* 同样，属性不允许使用public限定，完成getter和setter方法
* 信息打印，写一个getInfo()方法，输出
* */

import java.util.Arrays;
import java.util.List;

public class CPU extends Hardware{
    private int coreNum;
    public CPU() {
    }
    public void setCoreNum(int c) {
        coreNum = c;
    }
    public int getCoreNum() {
        return coreNum;
    }
    public void getInfo() {
        System.out.println(getName() + " work \ncoreNum " + getCoreNum() + "\nprice " + getPrice());
    }
}
