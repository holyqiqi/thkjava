package cn.zhumengqi.thkjava.initialization;

import static cn.zhumengqi.util.Print.println;

/**
 * 方法虽然通过参数的顺序不同得以重载，但是不推荐用，会使得代码难以维护。
 */
public class OverLoadingOrder {
    private static void f(String s, int i){
        println("String:" + s + ", int:" + i);
    }
    private static void f(int i, String s){
        println("int:" + i + ", String:" + s);
    }
    public static void main(String[] args) {
        f("String first", 1);
        f(99, "int first");
    }
}
