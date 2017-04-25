package cn.zhumengqi.thkjava.initialization;

import static cn.zhumengqi.util.Print.*;

/**
 * Created by zhumengqi on 17-4-25.
 * 构造器重载、方法重载
 */
class Tree {
    private int height;
    Tree(){
        println("种一棵树");
        height = 0;
    }
    Tree(int initialHeight){
        height = initialHeight;
        println("种一棵树，包含默认高度" + initialHeight);
    }
    void info(){
        println("树高：" + height);
    }
    void info(String s){
        println(s + "树高：" + height);
    }
}

public class OverLoading {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("重载方法");
        }
        new Tree();
    }
}
