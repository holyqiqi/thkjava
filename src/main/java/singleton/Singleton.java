package singleton;

public class Singleton{

    private Singleton(String[] args){
        System.out.println("输出中文" + args.toString());
    }
    private static Singleton single=null;

    public static Singleton getInstance(String[] args){
        if (single == null){
            single = new Singleton(args);
        }
        return single;
    }

    public static void main(String[] args){
        Singleton single = new Singleton(args);
        Singleton single2 = new Singleton(args);
        Singleton.getInstance(args);
    }
}
