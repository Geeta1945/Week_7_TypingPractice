package week7typingpractice;

import java.util.Scanner;

/**
 * Write a java program which input any number between 1 and  7 ,so it will print the days name
 * Monday, Tuesday,....Sunday of the week accordingly by using switch.
 * NOTE: If number is out of selection print message "Week contains 1 to 7 days "
 */

public class Programme_13_FindTheDayName {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 1 and 7 : ");
        int day =scanner.nextInt();
        finTheDaysName(day);
        // closing the scanner object
        scanner.close();

    }

    // Finding the name of the day
    public static void finTheDaysName(int day){

        switch(day){
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7 :
                System.out.println("It's Sunday");
            default:
                System.out.println("Week contains 1 to 7 days");




        }
    }

}
