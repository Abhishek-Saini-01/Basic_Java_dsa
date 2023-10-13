public class Arrays {

    public static void printArray(int array[]){

         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int linearSearch(int[] array, int n){
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == n) {
                return i;
            } 
        }
        return -1;
    }

    public static int largestInArray(int array[]){
        int largest = Integer.MIN_VALUE; // largest = -infinity
        for(int i = 0; i < array.length; i++) {
            if(largest < array[i]){
                largest = array[i];
            }
        }
        return largest;
    }

    public static int binarySearch(int array[], int search){
        int start = 0, end = array.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(array[mid]==search){
                return  mid;
            }            
            if(array[mid] < search){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void reverse(int array[]){
        int first = 0, last = array.length-1;
        while(first < last){
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;

            first++;
            last--;
        }
    }


    public static void pairInArray(int array[]){
        for(int i=0; i<array.length; i++){
            int curr = array[i];
            for(int j=i+1; j<array.length; j++){
                System.out.print("(" + curr +"," +array[j] + ")");
            }
            System.out.println();
        }
    }
    
    public static void printSubarrays(int array[]){
        int totalSubarrays = 0;
        for(int i=0; i<array.length;i++){
            int start = i;
            for(int j=i; j<array.length;j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(array[k]+" ");
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println("Total Subarrays: "+ totalSubarrays);
    } 
    
    
    public static void maxSubarraySum(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<array.length;i++){
            int start = i;
            for(int j=i; j<array.length;j++){
                int end = j;
                currSum = 0; 
                for(int k=start; k<=end; k++){
                    //subArraySum
                    currSum += array[k];
                }
                System.out.println("Current sum: "+currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                };
            }
        }

        System.out.println("Max subarray sum: "+ maxSum);
    } 

    public static void maxSubarraySumUsingPrefixArray(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];

        prefix[0] = array[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + array[i];
        }

        for(int i=0; i<array.length;i++){
            int start = i;
            for(int j=i; j<array.length;j++){
                int end = j;
                currSum = start==0 ? prefix[end] :prefix[end] - prefix[start] - 1; 
                
                if(maxSum < currSum){
                    maxSum = currSum;
                };
            }
        }

        System.out.println("Max subarray sum: "+ maxSum);
    } 

    public static void kadanes(int array[]){
       int ms = Integer.MIN_VALUE;//max sum
       int cs = 0;//current sum

       for (int i = 0; i < array.length; i++){
            cs = cs + array[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
       }
       System.out.println("Our maximum subarray sum: "+ ms);
    } 

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};
        // int[] numbers2 = new int[8];
        //input numbers2 array from user
        // System.out.println("Enter numbers for array 2: ");
        // for (int i = 0; i < numbers2.length; i++) {
        //     numbers2[i] = sc.nextInt();
        // }

        //numbers array print
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.print(numbers[i] + " ");
        // }
        printArray(numbers);
        

        System.out.println();
        //numbers2 array print
        // for (int i = 0; i < numbers2.length; i++) {
        //     System.out.print(numbers2[i] + " ");
        // }
        // printArray(numbers2);


        //Searching 
        // int indexNumber =  linearSearch(numbers, 9);
        // if (indexNumber>=0) {
        //     System.out.println("number found on index " + indexNumber);
        // } else {
        //     System.out.println("number is not present in array");
        // }

        //largest in Array
        // int largest = largestInArray(numbers);
        // System.out.println("largest in array " + largest);

        //binary Search
        // System.out.println(binarySearch(numbers, 6));

        // int index = binarySearch(numbers, 5);
        // if(index == -1){
        //     System.out.println("Number not found");
        // } else {
        //     System.out.println("Number found at index: " + index);
        // }

        //reverse an Array 
        // reverse(numbers);
        // printArray(numbers);
      
        //print pairs of arrays
        // pairInArray(numbers);

        //print sun Arrays:
        // printSubarrays(numbers);


        // max subarray sum
        // maxSubarraySum(numbers);

        //max subarray sum using prefix array
        maxSubarraySumUsingPrefixArray(numbers);

        //max subarray sum using KADANE's Algorithm
        kadanes(numbers);
    }
}
