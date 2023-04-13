package homeWork3;

import java.util.Arrays;

public class ArraysMethod {
    private int[] sortArray(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
public void printSortArray(int[]arr) {
    System.out.println(Arrays.toString(sortArray(arr)));
}
    private int findMaxValue(int[] arr){
    printSortArray(arr);
    return arr[arr.length-1];
    }
public void printMaxValue(int[]arr){
        System.out.println(findMaxValue(arr));
    }
    private int findElementByIndex(int[]arr,int index){
        int element = 0;
        for(int i = 0;i<index+1;i++){
            element = arr[index];
        }return element;
    }

public void printElement(int[]arr,int index){
    try {
        System.out.println(findElementByIndex(arr,index));
    }catch (ArrayIndexOutOfBoundsException exception){
        System.out.println("В массиве нет элемента с таким индексом");
    }
}
}
