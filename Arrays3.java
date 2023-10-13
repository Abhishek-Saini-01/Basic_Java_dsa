public class Arrays3{
    public static boolean twiceNumber(int number[]){
        for(int i = 0; i < number.length; i++){
            for(int j = i+1; j < number.length; j++){
                if(number[i]==number[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Question 1:Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
        int numbers[] = {1,1,1,2,2,4,4,4,4};
        System.out.println(twiceNumber(numbers));

    }
}