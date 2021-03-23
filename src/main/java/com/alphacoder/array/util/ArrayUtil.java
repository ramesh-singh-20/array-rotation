package com.alphacoder.array.util;

public class ArrayUtil {
    private ArrayUtil(){

    }

    public static int[] rotateArray(int[] arr,int d){
        for(int i=0; i<d; i++){
            rotateArrayLeftByOne(arr, arr.length);
        }
        displayArr(arr, arr.length);
        return arr;
    }

    private static int[] rotateArrayLeftByOne(int [] arr, int size){
        int i=0;
        int temp= arr[0];

        for(i=0; i<size-1; i++) {
            arr[i] = arr[i + 1];
        }
            arr[size-1]= temp;
       return arr;
    }

    private static void displayArr(int[] arr, int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
