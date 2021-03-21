package SortingAlgorithms;

public class ArrayBubbleSort {
    public static void main(String[] args){
        int[] array = new int[] { 5, 6, 9, 3, 18, 7};
        //bubble sort ascending
        for(int i = 0;i < array.length;i++){
            for(int j = 0;j < array.length -i - 1;j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        //print sorted array ascending
        for (int j : array) {
            System.out.print(j + " ");
        }
        //bubble sort descending
        System.out.println();
        for(int i = 0;i < array.length;i++){
            for(int j = 0;j < array.length -i -1;j++){
                if(array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        //print sorted array descending
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}

