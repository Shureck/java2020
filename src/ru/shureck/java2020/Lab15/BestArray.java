package ru.shureck.java2020.Lab15;

import ru.shureck.java2020.Lab14.Sorts;

import java.util.Arrays;

public class BestArray{
    private int[] arr = new int[0];
    private Sorts sorts = new Sorts();

    public void add(int num){
        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        newArray[arr.length] = num;
        arr = newArray;
    }

    public void remove(int n){
        int ind = sorts.recursiveBinarySearch(arr,0,arr.length-1,n);
        int[] newArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArray, 0, ind);
        System.arraycopy(arr, ind+1, newArray, ind, arr.length-ind-1);
        arr = newArray;
    }

    public int find(int n){
        return sorts.recursiveBinarySearch(arr,0,arr.length-1,n);
    }

    public int get(int ind){
        return arr[ind];
    }

    public int getMax(){
        int[] testArr = arr;
        sorts.quickSort(testArr,0,testArr.length-1);
        return testArr[testArr.length-1];
    }
    public int getMin(){
        int[] testArr = arr;
        sorts.quickSort(testArr,0,testArr.length-1);
        return testArr[0];
    }
    public float getAverage(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return 1.0f * sum / arr.length;
    }

    @Override
    public String toString() {
        return "BestArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
