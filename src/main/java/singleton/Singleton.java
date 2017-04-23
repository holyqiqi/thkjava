package singleton;

import java.util.Arrays;

public class Singleton{

    private Singleton(String[] args){
        System.out.println("输出中文" + Arrays.toString(args));
    }
    private static Singleton single=null;

    private static Singleton getInstance(String[] args){
        if (single == null){
            single = new Singleton(args);
        }
        return single;
    }

    public static void main(String[] args){
        Singleton single = new Singleton(args);
        Singleton single2 = new Singleton(args);
        // Singleton.getInstance(args)时，getInstance可以为void类型 TODO:研究下究竟应选择哪种使用方式
        Singleton a = Singleton.getInstance(args);
    }
}
