//tjudge Lab 2 - Exercise 1
//A review assignment. Was asked to create an array of 20 numbers, from random values between 0 and 99
//To sort the values, print the values, add another value and sort the values again with the new value
import java.util.*;
class ale3a {
    public static void main(String args[]){
        ArrayList list=new ArrayList();
        for(int i=0;i<20;++i){
            Random rand = new Random();
            int al = rand.nextInt(100);
            list.add(al);
        }
        System.out.println("\r\n After first sort");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("\r\n After adding item with the unsorted item");
        Random rand = new Random();
        int n = rand.nextInt(100);
        list.add(n);
        System.out.println(list);
        System.out.println("\r\n After sorting again");
        Collections.sort(list);
        System.out.println(list);
    }


}


