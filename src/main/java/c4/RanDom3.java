/**
 * 25个int，if-else归类大于、小于、等于其后的数
 */
package c4;

import java.util.Random;

public class RanDom3 {

    public static void main(String[] args){
        while(true){
            Random random = new Random();
            int i=0;
            int[] randomNumArray = new int[25];
            do{
                int randomNum = random.nextInt();
                randomNumArray[i] = randomNum;
                //System.out.println(i + ": " + randomNum);
            }while(++i<25);

            // 将与其后的排序
            for(i = 0; i < 24; i++){
                int result = randomNumArray[i] -  randomNumArray[i+1];
                //System.out.println(i);
                if (result < 0) {
                    System.out.println(i + ", " + randomNumArray[i] + ", " + randomNumArray[i+1] + "  <");
                }
                if (result > 0) {
                    System.out.println(i + ", " + randomNumArray[i] + ", " + randomNumArray[i+1] + "  >");
                }
                if (result == 0) {
                    System.out.println(i + ", " + randomNumArray[i] + ", " + randomNumArray[i+1] + "  =");
                }
            }
            System.out.println(i + ", " + randomNumArray[24] );
        }
    }
}
