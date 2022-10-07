//2022-09-10 tjudge - Lab 2 - Exercise 2
import java.util.*;
class ale3b {
    public static void main(String args[]){
        ArrayList<String> countryList = new ArrayList<String>(Arrays.asList( "Egypt", "Switzerland", "Argentina", "Spain", "Portugal", "Luxemburg") );
        System.out.println("\r\n After first sort");
        Collections.sort(countryList);
        System.out.println(countryList);
        countryList.add("Canada");
        System.out.println("\r\n After adding item with the unsorted item");
        System.out.println(countryList);
        Collections.sort(countryList);
        System.out.println("\r\n After sorting again with the new item");
        System.out.println(countryList);
    }


}