//tjudge Lab 1 - Exercise 1
////The assignment was a review assignment for working with arrays
import java.util.*;
public class rvalues {
    public static void main(String[] args) {
        int array[]=new int[20];
        Random ran = new Random();
        for(int i=0;i<array.length;i++){
            array[i]=ran.nextInt(100);
        }
        System.out.println("\r\n Sequence");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" - ");
        }
        Arrays.sort(array);
        System.out.println("\r\n Sorted Sequence");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" - ");
        }

    }

}
