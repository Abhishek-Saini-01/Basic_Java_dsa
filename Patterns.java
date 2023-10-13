public class Patterns {
    public static void hollowSquare(int rows, int columns){
        
        for(int i = 1; i <=columns; i++){
            for(int j = 1; j <= rows ; j++){
                //cell - (1,j)
                if(i==1 || i == rows || j==1 || j == columns){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void invertedRotatedHalfPyramid(int n){
        for(int i = 1; i <= n; i++){
            //spaces
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void invertedHalfPyramidWithNumbers(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int n){
        int counter = 1;
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTraingle(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if((i+j)%2==0){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i = 1; i <= n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
    public static void solidRombus(int n){
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowRombus(int n){
        
        for(int i = 1; i <=n; i++){
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n ; j++){
                //cell - (1,j)
                if(i==1 || i == n || j==1 || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void diamond(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= ((2*i) -1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= ((2*i) -1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        // hollowSquare(4, 5);

        // invertedRotatedHalfPyramid(5);
        // invertedHalfPyramidWithNumbers(5);

        // floydTriangle(5);
        // zeroOneTraingle(5);
        // butterfly(5);
        // solidRombus(5);
        // hollowRombus(5);
        diamond(5);
    }    
}
