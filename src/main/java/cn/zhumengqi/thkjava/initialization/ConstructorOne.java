package cn.zhumengqi.thkjava.initialization;

/**
 * Created by zhumengqi on 17-4-24.
 * 本题其实不需要自己写一个初始化方法，而是为了帮助读者理解Java内部会帮我们自动调用构造方法而已。
 * 参考问答（java中“未初始化的String引用”怎么理解（TK in java的习题））：https://segmentfault.com/q/1010000004476561/a-1020000004476847
 */
public class ConstructorOne {
    private static String unInitStr;

    public static void main(String[] args) {
        System.out.println(unInitStr);
    }
}
