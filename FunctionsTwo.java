public class FunctionsTwo {
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of: " + myNum  + " = " + decNum);
    }

    public static void decToBinary(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;
        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow)); 
            pow++;
            decNum = decNum/2;
        }
        System.out.println("binary of: " + myNum  + " = " + binNum);

    }

    public static void averageof(int a, int b, int c) {
        float average = (a + b + c )/3;
        System.out.println("average of 3 numbers is: " + average);
    }

    public static boolean isEven(int  num ){
        if (num%2==0){
            return true;
        }
        return false;
    }
    public static boolean palindrome(int num){
        int original = num;
        int newNum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            newNum = (newNum * 10) + lastDigit;
            num = num/10;
        }
        // System.out.println(newNum);
        if(original == newNum){
            return true;
        } 

        return false;        
    }

    public static void sumDigit(int num){
        int original = num;
        int sum = 0;

        while(num > 0){
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num/10;
        }
        System.out.println("Sum of given "+ original +" is : "+ sum);
    }

    public static void main(String[] args){
        // binToDec(101);

        // decToBinary(5);

        // Question 1 :Write a Java method to compute the averageof three numbers
        // averageof(2, 4, 6);

        // Question2:Write a method named isEven that accepts an int argument.The method should return true if the argument is even,or false otherwise.Also write a program to test your method
        // System.out.println(isEven(5));

        // Question3: Write a Java program to check if a number is a palindrome in Java?(121 is apalindrome, 321 is not)
        // System.out.println(palindrome(121));

        // System.out.println(Math.abs(45));

        // Question 5 :Write a Java method to compute the sum of the digits in an integer
        sumDigit(123);

    }
}
