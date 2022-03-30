package week7typingpractice;

import java.util.Arrays;
/*
Write a java program to sort a numeric array and a string array.
 */

public class Programme_17_SortArray {
    public static void main(String[] args) {
        // numeric array declaration

        int[] numArray ={1789,2035,1899,2040,1950,2255,7897,1455,787};
        // String Array declaration
        String [] strArray = {"Alpha","Bravo","Hotel","Mike","Sierra", "Peter","Kilo"};
        System.out.println("Actual numerical array was: "+Arrays.toString(numArray));
        // Sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted numerical array is : "+Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual StringArray was : "+Arrays.toString(strArray));
        // sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is : "+ Arrays.toString(strArray));


    }
}
