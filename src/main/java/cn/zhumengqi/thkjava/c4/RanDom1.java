package cn.zhumengqi.thkjava.c4;

public class RanDom1 {
    private static void printNum(int start, int end) {
        while (start < end) {
            System.out.print(start + ", ");
            start++;
        }
        System.out.print(end);
        System.out.println();
    }
    public static void main(String[] args){
        int a = 1;
        int b = 100;
        // 当a,b不写成变量，直接用printNum(1,100)时，idea提示警告start,end为定值1/100
        RanDom1.printNum(a,b);
    }
}
