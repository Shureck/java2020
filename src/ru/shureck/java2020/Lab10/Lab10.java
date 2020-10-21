package ru.shureck.java2020.Lab10;

import java.util.ArrayList;

public class Lab10 {

    public static void main(String[] args) {
        ex1(2,15);
        System.out.println(ex2(2,5));
        ex3(568793);
    }


    static void ex1(int k, int s){
        ArrayList<Integer> arr = new ArrayList<>();
        int counter = 0;
        arr.add(0);
        for(int i=0; i<k-1; i++){
            arr.add(0);
        }
        while(arrSum(arr) != 9*k) {
            arr.set(0, (arr.get(0) + 1) % 10);
            for(int w=1; w<k-1; w++){
                arr.set(w,0);
            }
            for (int i = k-1; i > 0; i--) {
                for (int j = 0; j < 10; j++) {
                    if(arrSum(arr) == 9*k){
                        //System.out.println(arr +" " +(arrSum(arr)));
                        counter++;
                        break;
                    }
                    //System.out.println(arr +" " +(arrSum(arr)));
                    if ((arrSum(arr) == s) && (arr.get(0) != 0)) {
                        counter++;
                    }
                    arr.set(i, (arr.get(i) + 1) % 10);
                }
            }
        }
        System.out.println(counter);
    }

    static int arrSum(ArrayList<Integer> arrayList){
        int sum=0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        return sum;
    }

    static int ex2(int a, int b){
        if (a >= b+2) {
            return 0;
        }

        if (a == 0 || b == 0) {
            return 1;
        }

        return ex2(a, b-1) + ex2(a-1, b-1);
    }

    static void ex3(int n){
        if(n/10>0) {
            ex3(n/10);
            System.out.print(" "+n % 10);
        }
        else{
            System.out.print(n);
        }
    }
}
