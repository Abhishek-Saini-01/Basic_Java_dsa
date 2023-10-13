public class BasicSorting {

    public static void bubbleSort(int array[]){
        int temp, n=array.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }

    public static void insertionSort(int array[]){
        for(int i=0; i<array.length; i++) {
            int key=array[i];
            int j = i-1;
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }
    }

    public static void selectionSort(int array[]){
        int temp;
        for(int i=0; i<array.length; i++){
            int minIndex = i;
            for(int j=i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    //count frequency and sort array
    public static void countingSort(int array[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            largest = Math.max(largest, array[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0; i < array.length ; i++){
            count[array[i]]++;
        }

        //sorting
        int j=0;
        for(int i = 0; i < count.length;i++) {
            while(count[i] > 0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void printArray(int array[]){
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) {
        int array[] = { 1,5,4,2,7,9,0 };
        // bubbleSort(array);
        // System.out.println("Sorted array using bubble sort : ");
        
        // insertionSort(array);
        // System.out.println("Sorted array using insertion sort : ");

        // selectionSort(array);
        // System.out.println("Sorted array using selection sort : ");

        // Arrays.sort(array);// inbuilt class or function

        countingSort(array);

        printArray(array);
    }
}
