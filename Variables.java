import java.util.*;

public class Variables{
    public static void main(String[] args){
        // int a = 10;
        // int b = 5;
        // String name = "Abhishek";
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(name);

        // byte b = 8;
        // System.out.println(b);
        // char c = 'a';
        // System.out.println(c);

        // SUM OF TWO NUMBERS
        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // System.out.println(sum);

        // Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        // int num = sc.nextInt();
        // System.out.println(num);

        // float num = sc.nextFloat();
        // System.out.println(num);
        // boolean num = sc.nextBoolean();
        // System.out.println(num);

        // SUM OF TWO NUMBERS
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // int product = a * b;
        // System.out.println(sum);
        // System.out.println(product);

        //Area of circle
        // float r = sc.nextFloat();
        // float area = 3.14f * r * r;
        // System.out.println(area); 

        //Type Casting
        // char ch = 'Z';
        // short num = 50;
        
        // System.out.println(ch + num);

        /* Question1:In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers.
        (Hint : Average of N numbers is sum of those numbers divided by N)*/
        // Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();
        // int Sum = A+B+C;
        // int Average = Sum/3;
        // System.out.println(Average);

        /*
        Question2:In a program,input the side of a square.You have to output the area of the square.
        (Hint : area of a square is (side x side))
        */
        // Scanner sc = new Scanner(System.in);
        // int Side = sc.nextInt();
        // int Area = Side * Side ;
        // System.out.println(Area);

        /*
        Question3:Enter cost of 3 items from the user(using float data type)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
        */
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totalCost = pencil + pen + eraser;
        System.out.println("Total Cost: "+ totalCost);
        float newTotal = totalCost + (0.18f * totalCost);
        System.out.println("Billing: " + newTotal);

        // int $ = 24;
        // System.out.println($);

    }
}