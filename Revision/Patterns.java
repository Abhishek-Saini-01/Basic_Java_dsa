public class Patterns {
    public static void printHallowReactangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedRotatedHalfTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void invertedRotatedHalfTriangleWithNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i + 1) {
                    System.out.print(j);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }

    public static void floyodTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // if (i % 2 == 0) {
            //     for (int j = 1; j <= i; j++) {
            //         if(j % 2 != 0){
            //             System.out.print("0 ");
            //         } else {
            //             System.out.print("1 ");
            //         }
            //     }
            // } else {
            //     for (int j = 1; j <= i; j++) {
            //         if(j % 2 == 0){
            //             System.out.print("0 ");
            //         } else {
            //             System.out.print("1 ");
            //         }
            //     }
            // }
            for(int j=1; j<=i ; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
    }
    

    public static void butterfly(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n){
        for (int i = 1; i <= n; i++) {
            // for(int j =1; j<= (2*n)-i; j++){
            //     if(j<=n-i){
            //         System.out.print(" ");
            //     } else {
            //         System.out.print("*");
            //     }
            // }
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hallowRhombus(int n){
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++){
                if(i==1|| j==1 || i==n || j==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void dimaond(int n){
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1;j++){                
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >0; i--) {
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1;j++){                
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // printHallowReactangle(4, 4);
        // invertedRotatedHalfTriangle(10);
        // invertedRotatedHalfTriangleWithNumbers(5);
        // floyodTriangle(5);
        // zeroOneTriangle(5);
        // butterfly(5);
        // solidRhombus(5);
        // hallowRhombus(5);
        dimaond(5);
    }
}
