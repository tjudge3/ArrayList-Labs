//tjudge lab1 exercise 2
//The assignment was a review assignment for working with arrays and sorting them. 
//It was to help us remember the differences between array and arraylist
import java.util.*;
public class clist
{
    public static void main(String[] args) {String clist[]={"Egypt","Switzerland","Argentina","Spain","Portugal","Luxemburg","India"};
System.out.println("given list:");
for(int i=0;i<clist.length;i++)
    {
        System.out.print(clist[i]+" - ");
    }
Arrays.sort(clist);
System.out.println("\r\n sorted list:");
for(int i=0;i<clist.length;i++)
    {
        System.out.print(clist[i]+" - ");
    }
}
}
