package ru.shureck.java2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        a1();
        a2(args);
        a3();
        a4();
        a5(5);

    }

    static void a1(){
        int[] arr = {1,2,5,4,5,6,7};
        int sum=0, j=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("first "+sum);
        sum = 0;
        while(j<arr.length){
            sum += arr[j];
            j++;
        }
        System.out.println("second "+sum);
        sum = 0;
        j=0;
        do{
            sum += arr[j];
            j++;
        }while(j<arr.length);
        System.out.println("third "+sum);
    }

    static void a2(String[] arg){
        for(int i=0;i<arg.length;i++){
            System.out.println(arg[i]);
        }
    }

    static void a3(){
        for(int i=1;i<=10;i++){
            System.out.print(String.format("%.2f",1.0/i)+" ");
        }
        System.out.println();
    }

    static void a4(){
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            arr.add((int)(Math.random()*100));
        }
        for(int i=10;i<20;i++){
            arr.add(random.nextInt(100));
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }

    static void a5(int num){
        int a = 1;
        for(int i=num;i>0;i--){
            a *= i;
        }
        System.out.println(a);
    }
}
