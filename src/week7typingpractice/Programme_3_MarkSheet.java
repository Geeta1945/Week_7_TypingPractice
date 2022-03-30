package week7typingpractice;
import java.util.Scanner;

/**
 * write a java program to input student Name,roll No and three subjects Maths, Science and
 * English marks(marks is between "0 to 100")and if it is out of range print error message "Invalid
 * Input, Marks should be between "0 and 100")and find out total,percentage and result.
 * If he/She is pass or fail on basis of percentage(pass>=35) and also give them grade if %>=80 A+,
 * %>=60 A,%> =50 B, %> =35 C and print mark sheet in following format

 * |_________________________________
 *  | Mark Sheet |
 *  |_______________________________|
 *  | Name : Jay |
 *  | Roll No: 08 |
 *  |_______________________________|
 *  | Subjects : Marks |
 *  |_______________________________|
 *  | Math : 98 |
 *  | Science : 90 |
 *  | English : 85 |
 *  |_______________________________|
 *  | Total : 273 |
 *  |_______________________________|
 *  | Percentage : 91.0 |
 *  | Result : Pass |
 *  | Grade : A+ |
 *  |_______________________________|
  */


public class Programme_3_MarkSheet {

    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name      \t\t:\t");

        String name = scanner.next();
        System.out.println("Enter Student Roll Number \t\t:\t");
        int rollNum = scanner.nextInt();
        System.out.println("Enter Maths Marks \t\t:\t");
        int mathMarks = scanner.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {

            System.out.println("\n Invalid input, Marks should between 0 and 100");
            System.out.println("\n Please enter correct marks \t \t:\t");
            mathMarks = scanner.nextInt();
        }

        System.out.println("Enter Science Marks \t\t:\t");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {

            System.out.println("\n Invalid input, Marks should between 0 and 100");
            System.out.println("\n Please enter correct marks \t \t:\t");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter English Marks \t\t:\t");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {

            System.out.println("\n Invalid input, Marks should between 0 and 100");
            System.out.println("\n Please enter correct marks \t \t:\t");
            englishMarks = scanner.nextInt();
        }

        int total = sum(mathMarks, scienceMarks, englishMarks);
        int percentage = (total *100)/300;
        String result =calculateResult(mathMarks,scienceMarks,englishMarks);
        String grade = calculateGrade(percentage,result);
        printTheMArkSheet(name,rollNum,mathMarks,scienceMarks,englishMarks,total,percentage,result,grade);

        // Closing the scanner object
        scanner.close();

    }

    // calculating the sum
    public static int sum(int a,int b,int c){
        return a+b+c;

    }

    // calculating the results on subjects marks
    public static String calculateResult(int mathMarks,int scienceMarks,int englishMarks){
        if (mathMarks<35 ||scienceMarks<35 ||englishMarks<35)
        {
            return "Fail";
        }
        else{

            return "Pass";
        }


    }

    // calculating the grade on percentage and result
    public static String calculateGrade(int percentage,String result){

        String grade =null;
        if(result.equalsIgnoreCase("Pass")){

            if(percentage>=80){
                grade= "A+";
            }
            else if(percentage>=60){
                grade ="A";
            }
            else if(percentage>=50){
                grade ="B";
            }
            else if(percentage>=35){
                grade ="C";
            }
        }

        else
        {
            grade ="_";
        }
        return grade;
    }

    //printing the Marks sheet
    public static void printTheMArkSheet(String name,int rollNum, int mathsMarks, int scienceMarks,int englishMarks,
                                         double total,double percentage, String result, String grade){

        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");


    }




}
