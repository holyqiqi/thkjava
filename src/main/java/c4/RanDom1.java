package c4;

public class RanDom1 {
    public static void printNum(int start,int end) {
        while (start < end) {
            System.out.print(start + ", ");
            start ++;
        }
        System.out.print(end);
        System.out.println();
    }
    public static void main(String[] args){
        RanDom1.printNum(1,100);
    }
}
