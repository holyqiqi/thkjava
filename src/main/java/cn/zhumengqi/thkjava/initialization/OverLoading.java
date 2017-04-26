package cn.zhumengqi.thkjava.initialization;

import static cn.zhumengqi.util.Print.*;

/**
 * Created by zhumengqi on 17-4-25.
 * 构造器重载、方法重载
 */
class Tree {
    private int height; //Warning 1:变量不定义为private，idea会报警告
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
    void info(String s){ //Warning 2:只有一处调用了info(s)方法，猜测为idea(预)运行后发现s永远为定值，这里也报告警告，提示将s写到代码中，不提出来作为行参。
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
