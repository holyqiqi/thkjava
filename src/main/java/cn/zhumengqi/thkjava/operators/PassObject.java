package cn.zhumengqi.thkjava.operators;

/**
 * Created by zhumengqi on 17-4-24.
 * P40.方法别名问题
 */
class Letter {
    char c;
}
public class PassObject {
    /**
     * f方法：将letter的对象y的字符型c值更改为'z'
     * @param y Letter对象
     */
    private static void f(Letter y) { //书上没有private，这里会提示警告
        y.c = 'z';
    }
    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.c = 'a';
        System.out.println("1:x.c:" + letter.c);
        f(letter);
        System.out.println("2:x.c:" + letter.c);
    }
}
/*打印：
    1:x.c:a
    2:x.c:z
可见，传递了一个引用。
*/
