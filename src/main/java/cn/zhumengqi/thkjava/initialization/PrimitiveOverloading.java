package cn.zhumengqi.thkjava.initialization;

import static cn.zhumengqi.util.Print.*;

/**
 * Created by zhumengqi on 17-4-26.
 * 传入的数据类型（实际形式参数）小于方法中声明的形式参数类型，实际数据类型就会被提升。
 * 1.char型略有不同，如果无法找到恰好接受char参数的方法，会把char直接提升至int型。
 * 2.常数5被当做int值处理
 * 3.常数5.1和5.0被全当做double值处理，而非float
 */
public class PrimitiveOverloading {
    void f1(char x) { println("f1(char)"); }
    void f1(byte x) { println("f1(byte)"); }
    void f1(short x) { println("f1(short)"); }
    void f1(int x) { println("f1(int)"); }
    void f1(long x) { println("f1(long)"); }
    void f1(float x) { println("f1(float)"); }
    void f1(double x) { println("f1(double)"); }

    void f2(byte x) { println("f2(byte)"); }
    void f2(short x) { println("f2(short)"); }
    void f2(int x) { println("f2(int)"); }
    void f2(long x) { println("f2(long)"); }
    void f2(float x) { println("f2(float)"); }
    void f2(double x) { println("f2(double)"); }

    void f3(short x) { println("f3(short)"); }
    void f3(int x) { println("f3(int)"); }
    void f3(long x) { println("f3(long)"); }
    void f3(float x) { println("f3(float)"); }
    void f3(double x) { println("f3(double)"); }

    void f4(int x) { println("f4(int)"); }
    void f4(long x) { println("f4(long)"); }
    void f4(float x) { println("f4(float)"); }
    void f4(double x) { println("f4(double)"); }

    void f5(long x) { println("f5(long)"); }
    void f5(float x) { println("f5(float)"); }
    void f5(double x) { println("f5(double)"); }
    
    void f6(float x) { println("f6(float)"); }
    void f6(double x) { println("f6(double)"); }

    void f7(double x) { println("f7(double)"); }

    private void testConstVal() {
        println("5: ");
        f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);println();
    }
    private void testChar() {
        char x = 'x';
        print("char: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
    }
    private void testByte() {
        Byte x = 0;
        print("byte: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
    }
    private void testShort() {
        Short x = 0;
        print("short: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
    }
    private void testInt() {
        int x = 0;
        print("int: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
    }
    private void testLong() {
        long x = 0;
        print("long: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
    }
    private void testFloat() {
        float x = 0;
        print("float: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
    }
    private void testDouble() {
        double x = 0;
        print("double: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
    }
    public static void main(String[] args) {
        PrimitiveOverloading p = new PrimitiveOverloading();
        p.testConstVal();
        p.testChar();
        p.testByte();
        p.testShort();
        p.testInt();
        p.testFloat();
        p.testLong();
        p.testDouble();
    }
} /* 输出结果：
/opt/default/jdk/bin/java -javaagent:/opt/idea-IU-171.3780.107/lib/idea_rt.jar=43701:/opt/idea-IU-171.3780.107/bin -Dfile.encoding=UTF-8 -classpath /opt/default/jdk/jre/lib/charsets.jar:/opt/default/jdk/jre/lib/deploy.jar:/opt/default/jdk/jre/lib/ext/cldrdata.jar:/opt/default/jdk/jre/lib/ext/dnsns.jar:/opt/default/jdk/jre/lib/ext/jaccess.jar:/opt/default/jdk/jre/lib/ext/jfxrt.jar:/opt/default/jdk/jre/lib/ext/localedata.jar:/opt/default/jdk/jre/lib/ext/nashorn.jar:/opt/default/jdk/jre/lib/ext/sunec.jar:/opt/default/jdk/jre/lib/ext/sunjce_provider.jar:/opt/default/jdk/jre/lib/ext/sunpkcs11.jar:/opt/default/jdk/jre/lib/ext/zipfs.jar:/opt/default/jdk/jre/lib/javaws.jar:/opt/default/jdk/jre/lib/jce.jar:/opt/default/jdk/jre/lib/jfr.jar:/opt/default/jdk/jre/lib/jfxswt.jar:/opt/default/jdk/jre/lib/jsse.jar:/opt/default/jdk/jre/lib/management-agent.jar:/opt/default/jdk/jre/lib/plugin.jar:/opt/default/jdk/jre/lib/resources.jar:/opt/default/jdk/jre/lib/rt.jar:/home/mike/workspace/out-of-work/thkjava/target/classes cn.zhumengqi.thkjava.initialization.PrimitiveOverloading
5:
f1(int)
f2(int)
f3(int)
f4(int)
f5(long)
f6(float)
f7(double)

char: f1(char)
f2(int)
f3(int)
f4(int)
f5(long)
f6(float)
f7(double)

byte: f1(byte)
f2(byte)
f3(short)
f4(int)
f5(long)
f6(float)
f7(double)

short: f1(short)
f2(short)
f3(short)
f4(int)
f5(long)
f6(float)
f7(double)

int: f1(int)
f2(int)
f3(int)
f4(int)
f5(long)
f6(float)
f7(double)

float: f1(float)
f2(float)
f3(float)
f4(float)
f5(float)
f6(float)
f7(double)

long: f1(long)
f2(long)
f3(long)
f4(long)
f5(long)
f6(float)
f7(double)

double: f1(double)
f2(double)
f3(double)
f4(double)
f5(double)
f6(double)
f7(double)


Process finished with exit code 0
*/
