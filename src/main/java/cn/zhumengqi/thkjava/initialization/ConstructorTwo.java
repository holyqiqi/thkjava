package cn.zhumengqi.thkjava.initialization;

/**
 * Created by zhumengqi on 17-4-24.
 * 差异: unInitStr先被初始化为null, 再被初始化为2，被初始化了2次
 * 参考：http://blog.163.com/linux_sun37/blog/static/241153008201410493023/
 */
public class ConstructorTwo {
    private int initStr = 1; //定义时就初始化的String引用
    private int unInitStr ;    //通过构造器初始化的String域，需要调用构造器

    private ConstructorTwo() {
        unInitStr = 2;
    }

    public static void main(String[] args) {
        System.out.println(new ConstructorTwo().initStr);
        System.out.println(new ConstructorTwo().unInitStr);
    }
}
