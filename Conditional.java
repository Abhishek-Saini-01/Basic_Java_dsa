import java.util.Scanner;
public class Conditional {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*
        // Write a Java program to get a number from the user and print whether it is positive or negative
        */
        // System.out.println("Enter number to check");
        // int num = scanner.nextInt();
        // if(num>=0){
        //     System.out.println("Number is Positive: " + num);
        // } else{
        //     System.out.println("Number is Negative: " + num);
        // }/


        /*
        //Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
        */
        // double temp=103.5;
        // if(temp>100){
        //  System.out.println("You have Fever with temperature :" + temp);
        // } else {
        //  System.out.println("You do not have Fever & Your Temp : " + temp );
        // }


        /*
        //Writea Java program to input week number(1-7) and print day of weekname using switch case
        */
        //    System.out.println("Enter week number(1-7) ");
        //    int weeknumber = scanner.nextInt();
        //    if(weeknumber>0 && weeknumber<=7){
        
        //     switch(weeknumber){
        //         case 1: System.out.println("Sunday");
        //                 break;
        //         case 2: System.out.println("Monday");
        //                 break;
        //         case 3: System.out.println("Tuesday");
        //                 break;
        //         case 4: System.out.println("Wednesday");
        //                 break;
        //         case 5: System.out.println("Thrusday");
        //                 break;
        //         case 6: System.out.println("Friday");
        //                 break;
            
        //         default: System.out.println("Saturday");
        //     }
        //    } else{
        //      System.out.println("Week day does not exist");
        //    }


        /*
        //What will be the value of x & y in the following program:
        */
        //    int a=63,b=36; 
        //    boolean x = (a<b) ? true : false; //false
        //    int y= (a>b) ? a : b; //a=>63
        //    System.out.println(x);
        //    System.out.println(y);
        
        
        /*
        //Writea Java program that takes a year from the user and print whether that year is a leap year or not
        */
       System.out.println("Enter Year");
       int year = scanner.nextInt();
       if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year + " is a leap Year");
                } else{
                    System.out.println(year + " is not leap Year");
                }
            } else{
                System.out.println(year + " is a leap Year");
            }
       }else{
                System.out.println(year + " is not leap Year");
        }
    }
}