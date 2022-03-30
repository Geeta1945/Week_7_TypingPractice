package week7typingpractice;

/**
 * write a java program to print the numbers between 1 and 100 which can be divided by 3 and 5 separately.
 */
public class Programme_11_DividedByThreeAndFive {

    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 are : ");
        for(int i=1;i<=100;i++){
            dividedByThree(i);
        }
        System.out.println("\n_________________________________________________________________");
        System.out.println("Numbers divisible by 5 are : ");
        for(int x=1;x<=100;x++){
            divideByFive(x);
        }

    }

    // Divided by Three method
    public static void dividedByThree(int number){

        if(number%3==0){
            System.out.print(number +" , ");
        }

    }

    // Divided by Five method
    public static void divideByFive(int number){
        if(number%5==0){
            System.out.print(number +" , ");
        }

    }

    }

