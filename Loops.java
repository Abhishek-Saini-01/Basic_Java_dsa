import java.util.*;

public class Loops {
    public static void main(String[] args){
        // Question 1 :How many times 'Hello' is printed?
        // for(int i=0;i<5;i++) { 
        //     System.out.println("Hello"); 
        //     i+=2;
        // }


        // Question2: Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
        // Scanner sc = new Scanner(System.in);
        // int evenSum=0,oddSum=0;
        // for(int i=0;i<10;i++){
        //     System.out.println("Enter number: ");
        //     int n = sc.nextInt();
        //     if (n%2==0){
        //         evenSum+=n;
        //     } else {
        //         oddSum+=n;
        //     }
        // }
        // System.out.println("Even sum: " + evenSum);
        // System.out.println("Odd sum: " + oddSum);


        // Question 3 :Write a program to find the factorialof any number entered by the user
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number: ");
        // int num = sc.nextInt();
        // int fac=1;
        // for(int i=1;i<=num;i++){
        //     fac *= i;
        // }
        // System.out.println("Factorial is :" + fac);


        // Question 4: Write a program to print the multiplication table of a number N,entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }

}