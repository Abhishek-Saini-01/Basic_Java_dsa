import java.util.*;
public class Functions {
    //syntax of function
    public static void printHello(){
        System.out.println("This is print function");
        return;
    }
    public static void printCustomString(String str){
        System.out.println(str);
        return;
    }
    public static int sumOfNumber(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public static int getProduct(int num1, int num2){
        int product = num1 * num2;
        return product;
    }

// function to calculate the factotial
     public static int factorial(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;
        }
        return f;
    }
    // function to calculate the nCr = bionomial coefficient


    public static int bioCoeff(int n, int r){
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_n_r = factorial(n-r);

        int bioCoeff = fac_n/(fac_n_r * fac_r);
        return bioCoeff;
    }

    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int sum(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }
    public static float sum(float a, float b, float c){
        float sum = a+b+c;
        return sum;
    }

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int start, int end){
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        // printHello();
        // Scanner sc = new Scanner(System.in);
        // printCustomString("Enter Value of  num1 and num2: ");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // // int sum = sumOfNumber(num1, num2);
        // // System.out.println("Sum is " + sum);
        // // swap(num1, num2);
        // // System.out.println("New num1:  " + num1);
        // // System.out.println("New num2:  " + num2);

        // int product = getProduct(num1,num2);
        //  System.out.println("Product of two numbers is:  " + product);


        // System.out.println(bioCoeff(4,1);
        // System.out.println(sum(1,2));
        // System.out.println(sum(1,2,3));
        // System.out.println(sum(1.2f,2.2f,3.3f));

        // System.out.println(isPrime(12));


        primeInRange(10,50);
    }
}