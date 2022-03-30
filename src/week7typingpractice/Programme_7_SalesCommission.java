package week7typingpractice;

import java.util.Scanner;

public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Seller Name : ");
        String name =scanner.nextLine();
        System.out.println("Enter Seller ID : ");
        int sellerId = scanner.nextInt();
        System.out.println("Enter Sales Amount : ");
        int salesAmount =scanner.nextInt();
        System.out.println("Enter Basic Salary : ");
        int basicSalary = scanner.nextInt();
        //creating the object to call instance method
        Programme_7_SalesCommission salesCommission =new Programme_7_SalesCommission();
        int grossSalary =basicSalary + salesCommission.calculateCommission(salesAmount);
        System.out.println("Seller's name is           : "+name);
        System.out.println("Seller's id is             :"+sellerId);
        System.out.println("Seller's sales amount is   : "+salesAmount);
        System.out.println("Seller's basic salary is   :"+grossSalary);
        // closing the scanner object;
        scanner.close();

    }

    // calculating the sales commission
    public int calculateCommission (int salesAmount){

        int commission;
        if(salesAmount>=50000)

        {
            commission=(salesAmount*35)/100;
            System.out.println("Sales Commission is "+commission);
        }
        else if(salesAmount>=30000){
            commission =(salesAmount*20)/100;
            System.out.println("Sales Commission is "+commission);
        }
        {
            commission =(salesAmount*10)/100;
            System.out.println("Sales Commission is "+commission);
        }
        {
            commission =(salesAmount*5)/100;
            System.out.println("Sales Commission is "+commission);
        }
        {
            commission =(salesAmount*2)/100;
            System.out.println("Sales Commission is "+commission);
        }


       return commission;
    }


}
