package ru.shureck.java2020.Lab14;

import java.util.Random;

public class Lab14 {
    public static void main(String[] args) {
        int[] array = new int[10000];
        int[] array2 = new int[10000];
        int[] array3 = new int[10000];
        int[] array4 = new int[10000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        array2 = array;
        array3 = array;
        array4 = array;
        Sorts sorts = new Sorts();

        long start, end;

        start = System.nanoTime();
            sorts.sortArray(array);
        end = System.nanoTime();
        System.out.println("sortArray "+ (end - start));
        start = System.nanoTime();
            sorts.quickSort(array2,0,array2.length-1);
        end = System.nanoTime();
        System.out.println("quickSort "+ (end - start));
        start = System.nanoTime();
            sorts.linearSearch(array,45);
        end = System.nanoTime();
        System.out.println("linearSearch "+ (end - start));
        start = System.nanoTime();
            sorts.recursiveLinearSearch(array,45,0);
        end = System.nanoTime();
        System.out.println("recursiveLinearSearch "+ (end - start));
        start = System.nanoTime();
            sorts.binarySearch(array, 45);
        end = System.nanoTime();
        System.out.println("binarySearch "+ (end - start));
        start = System.nanoTime();
            sorts.recursiveBinarySearch(array, 0, array.length-1, 45);
        end = System.nanoTime();
        System.out.println("recursiveBinarySearch "+ (end - start));
        start = System.nanoTime();
    }
}
