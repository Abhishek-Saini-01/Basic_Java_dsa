public class BitManipulation {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n&bitMask)==0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static  int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        } else{
            return 1;
        }      
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0) {
        //     return clearIthBit(n, i);
        // } else{
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;

    }
    public static int clearLastIthBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
           if((n&1)!=0){
            count++;
           } 
           n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // oddOrEven(5);
        // System.out.println(getIthBit(10, 2));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearLastIthBit(15, 2));
        // System.out.println(clearBitsInRange(10, 2, 7));
        // System.out.println(isPowerOfTwo(8));
        // System.out.println(countSetBits(16));

        // System.out.println(fastExpo(3, 5));

        //Question 2 :Swap two numbers without using any thirdvariable
        int x=3, y=4;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap: x = "+x+" and y = "+y);

        //Question 3 :Add 1 to an integer using Bit Manipulation.(Hint: try using Bitwise NOT Operator)
        // int x=6;
        // System.out.println(x + " " + 1 + " is " + -~x); //-~x add 1 to an interger x 

        //Q4: uppercase to lower case using bit
        // for(char ch = 'A'; ch <= 'Z'; ch++){
        //     System.out.print((char)(ch | 32));
        // }
    }
}
