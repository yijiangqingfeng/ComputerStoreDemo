package com.test;

/*
 * Hint
 * java可以自动补全方法名称，类名等
 * 有一些快捷键可以试着用用，比如ctrl alt L可以格式化代码，sout + 回车，psvm + 回车
 * 代码有错误时，会有红波浪线在错误位置提示，鼠标放在提示位置可以查看报错信息，它也会给你提供一些解决方案供你参考
 * */
public class ComputerStore {
    public static void main(String[] args) {
        Computer a = new Computer("Intel",1,1000);
        a.cpu.getInfo();
    }
}
