public class twoDArrays {

    public static void printSpiral(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        int sc = 0;
        int sr = 0;
        int er = n - 1;
        int ec = m - 1;

        int col = 0;
        int row = 0;

        while(sc<=ec && sr<=er){ // till when my range is valid
            // col downwards -> printing starting column
            col = sc; 
            for(row = sr; row<=er; row++){
                System.out.print(arr[row][col]+" ");
            }
            sc++;

            // row towards right -> printing end row
            row = er;
            for(col= sc; col<=ec; col++){
                System.out.print(arr[row][col]+" ");
            }
            er--;

            // col upwards -> printing end column
            col = ec;
            for(row=er; row>=sr; row--){
                System.out.print(arr[row][col]+" ");
            }
            ec--;

            // row towards left
            row = sr;
            for(col=ec; col>=sc; col--){
                System.out.print(arr[row][col]+" ");
            }
            sr++;

            System.out.println();
        }
    }
    public static int diagonalSum (int[][] matrix){
        int sum=0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }else if(i+j == matrix.length-1){
        //             sum+=matrix[i][j]; 
        //         }
        //     }
        // }   // complexity = O(n^2)

        for(int i=0; i<matrix.length; i++){
            //primary diagonal 
            sum+=matrix[i][i];
            //secondary diagonal
            if(i!=matrix.length-1-i)
                sum+=matrix[i][matrix.length-1-i]; // else if condition of above loop
        }  // complexity = O(n)
        return sum;
    }

    public static boolean staircaseSearch(int[][] matrix,int key){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Found at ("+row+","+col+ ")");
                return true;
            }else if(key<matrix[row][col]){
                col--;
            } else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
 public static void main(String[] args) {
        // int matrix[][] =  new int[3][3];

        // int n= matrix.length;//lenght of row
        // int m= matrix[0].length;//lenght of column

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input Matrix values:");
        // for (int i = 0; i<3; i++) {
        //     for (int j = 0; j<3; j++) {
        //         System.out.print("Enter value of " + i + "," + j + " :");
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("Matrix values are :");
        // for (int i = 0; i<3; i++) {
        //     for (int j = 0; j<3; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{12,13,14,15}};

        // printSpiral(matrix);

        System.out.println(diagonalSum(matrix));

        staircaseSearch(matrix, 13);

    }
    
}
