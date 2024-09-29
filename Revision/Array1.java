import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
public class Array1 {
    public static void inputArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value at index " + i);
            arr[i] = sc.nextInt();
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int largestInArray(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }       

        return max;
    }

    public static void reverseArray (int[] arr) {
        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;       
        
        while (start <= end) {
            int mid =  (start+end)/2; 
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return -1;
    }


    public static void pairs(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            int first = arr[i];
            for(int j = i+1; j < arr.length; j++) {
                System.out.print("(" + first + "," + arr[j] + ")");
            }
        }
    }

    public static void subarray(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            int start = i;
            for(int j = i; j < arr.length; j++) {
                int end = j;
                for(int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int maxSubArray(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            int start = i;
            for(int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++) {
                    currSum += arr[k];
                }
                System.out.println("CurrSum " + currSum );
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }

    public static int maxSubArraySumUsingPrefixArray(int[] arr){
        
        int maxSum = 0;
        int prefix[] = new int[arr.length];

        for(int i=0;i<arr.length; i++){
            int currSum = 0;
            for(int j=0; j<=i; j++){
                currSum += arr[j];
            }
            prefix[i] = currSum;
        };

        int currSum = 0;
        for(int i = 0; i < arr.length; i++) {
            int start = i;
            for(int j = i; j < arr.length; j++) {
                int end = j;
                
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1]; 
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

    return maxSum;
       
    }

    public static int maxSubArraySumUsingKadanesAlgo(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static int tarapingRainwater(int[] heights){
        int leftMax[] = new int[heights.length];
        leftMax[0]=heights[0];
        for(int i=1;i<heights.length;i++){
            leftMax[i] = Math.max(leftMax[i-1], heights[i]);
        }
 

        int rightMax[] = new int[heights.length];
        rightMax[heights.length-1]=heights[heights.length-1];
        for(int i = heights.length-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], heights[i]);
        }

        int trappedWater = 0;
        for(int i=0;i<heights.length;i++){
            trappedWater += Math.min(leftMax[i], rightMax[i]) - heights[i];
        }

        return trappedWater;
    }

    public static int buyStocks(int[] arr){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<arr.length;i++){
            if(buyPrice<arr[i]){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = arr[i];
            }
        }

        return maxProfit;
    }

    public static boolean leastTwiceNumber(int[] arr){
        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }


    public static int findTargetIndex(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static List<List<Integer>> triplets(int[] arr){
        List<List<Integer>> result =  new    ArrayList <List<Integer>> (); 
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1; k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == 0 && i!=j && i!= k && j!=k){
                        // System.out.println("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");
                        //for unique sets
                        List<Integer> triplet = new ArrayList < Integer > ();
                        triplet.add(arr[i]); 
                        triplet.add(arr[j]); 
                        triplet.add(arr[k]); 
                        Collections.sort(triplet); 
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
        return result;
    }
    public static void main(String[] args) {
        // int[] arr = new int[6];
        // inputArray(arr);
        int[] arr = { 1,-2,6,-1,3};
        // printArray(arr);
        // if(linearSearch(arr, 19)!= -1) {
        //     System.out.println("Traget at index " + linearSearch(arr, 19));
        // } else {
        //     System.out.println("Traget not found");
        // }
        System.out.println();
        // System.out.println(largestInArray(arr));
        // reverseArray(arr);
        // printArray(arr);

        // System.out.println("Target at index" + binarySearch(arr, 19));
        // pairs(arr);
        // subarray(arr);
        // System.out.println(" Max sum " + maxSubArray(arr));

        // System.out.println(" Max sum " + maxSubArraySumUsingPrefixArray(arr));
        // System.out.println(" Max sum " + maxSubArraySumUsingKadanesAlgo(arr));
        int newArr[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        // System.out.println("Trapped Water " + tarapingRainwater(newArr));

        int stocks[]={7,1,6,5,3,6,4};
        // System.out.println("Max Profit " + buyStocks(stocks));
        int nums[] = {1, 1, 3, 3, 4, 3, 2, 4, 2};
        // System.out.println("NUmber is twice in a array: " + leastTwiceNumber(nums));

        int acsArray[] = {4,  5, 6, 7, 0, 1, 2};
        // System.out.println("Target index: " + findTargetIndex(acsArray,8));

        int tripletArray[] = {-1, 0,  1, 2, -1, -4};
        System.out.println(triplets(tripletArray));
    }
}