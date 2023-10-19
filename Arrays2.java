public class Arrays2 {
    
    public static int trappedRainwater(int height[]){
        //calculate left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0]=height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        //calculate right max boundary - array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //loop -
        // water level = min (leftMax Bound, rightMax Bound)
        //trapped water = water level - height[i] 
        int trappedWater = 0;
        for(int i=0; i<height.length;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    
    public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static boolean checkNumOccurence(int nums[]){
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(num == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int height[] = {4,2,0,6,3,2,5};
        // System.out.println("Trapped Water: " + trappedRainwater(height));

        // int prices[] = {7,1,5,3,6,4};
        // System.out.println("Max Profit : " + buyAndSellStock(prices));

        int nums[] = {1,3,4,4,5};
        System.out.println(checkNumOccurence(nums));
    }
}
