package cn.zhumengqi.thkjava.c1;

import static cn.zhumengqi.util.Print.*;

public class HelloWorld {
    private void printHelloWorld(){
        println("Hello world!");
    }
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.printHelloWorld();
    }
}
