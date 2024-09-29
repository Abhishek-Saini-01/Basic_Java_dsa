import java.util.Scanner;

public class Functions {
    public static void averageOfThreenumbers(int a, int b, int c){
        System.out.println((a+b+c)/3);
    }
    public static boolean isEven(int n){
        if( n%2 == 0){
            return true;
        }
        return false;
    }

    public static boolean palindrome(int n){
        int original = n;
        int rev = 0;
        while (n>0) {
            int lastNumber = n%10;
            rev = rev*10 + lastNumber;
            n = n/10;
        }
        if(rev == original){
            return true;
        }
        return false;
    }

    public static int sumOfNumber(int n){
        int sum = 0;
        while (n>0) {
            int last = n%10;
            sum += last;
            n = n/10;       
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // averageOfThreenumbers(a, b, c);
        // System.out.println(isEven(980964566));
        // System.out.println(palindrome(123));
        System.out.println(sumOfNumber(756575));
    }
}
