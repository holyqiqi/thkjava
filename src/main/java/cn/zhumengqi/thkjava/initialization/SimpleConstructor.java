package cn.zhumengqi.thkjava.initialization;

import static cn.zhumengqi.util.Print.*;

/**
 * Created by zhumengqi on 17-4-24.
 * 简单构造器示例
 */
class Rock {
    Rock() { // 构造方法
        println("rock");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            //Rock rock = new Rock(); 这种方式和下面的区别？
            new Rock();
        }
    }
}
