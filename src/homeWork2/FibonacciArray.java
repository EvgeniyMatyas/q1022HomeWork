package homeWork2;

import java.util.Arrays;

public class FibonacciArray {
    public  int[] fib(int arrLenght){
    int[] fibArray = new int[arrLenght];
    fibArray[1]=1;
    for(int i = 2;i<arrLenght;i++) {
        fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
    }
        System.out.println(Arrays.toString(fibArray));
    return fibArray;
    }
}
