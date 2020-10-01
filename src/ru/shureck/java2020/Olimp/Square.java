package ru.shureck.java2020.Olimp;

import java.util.Vector;

public class Square {

    public static  int[][] mass = { {0,-3,84,5,-2},
                                    {13,-40,51,13,-12},
                                    {-25,16,-17,0,-8},
                                    {31,10,9,10,-20},
                                    {6,4,16,-17,0}};
    public static int[] cords = {0,0};

    public static void main(String[] args) {
//        for (int i = 0; i < mass[0].length; i++) {
//            System.out.println(maxElemHor(mass, i)[0] + " x-" + maxElemHor(mass, i)[1] + " y-" + i);
//        }
//        System.out.println("");
//        for (int i = 0; i < mass[0].length; i++) {
//            System.out.println(maxElemWert(mass, i)[0] + " x-" + i + " y-" + maxElemWert(mass, i)[1]);
//        }
        System.out.println("");
        System.out.println(findWay(mass,new int[]{0,0},new int[]{1,1}));
    }

    public static void move(int[][] arr, int[] cords){
        for (int i = 0; i < mass[0].length; i++) {
            System.out.println(maxElemHor(mass, i)[0] + " x-" + maxElemHor(mass, i)[1] + " y-" + i);
        }
        System.out.println("");
        for (int i = 0; i < mass[0].length; i++) {
            System.out.println(maxElemWert(mass, i)[0] + " x-" + i + " y-" + maxElemWert(mass, i)[1]);
        }

    }

    public static int findWay(int[][] arr, int[] cords, int[] cordMax){
        int sum = 0, sum2 = 0;
        int[] saveCords = cords;
        for (int i = cords[0]; i < cordMax[0]-cords[0]+1; i++) {
            for (int j = cords[1]; j < cordMax[1]-cords[1]+1; j++) {
                cords = new int[] {i,j};
                sum += arr[i][j];
            }
        }
        cords = saveCords;
        for (int j = cords[0]; j < cordMax[0]-cords[0]+1; j++) {
            for (int i = cords[1]; i < cordMax[1]-cords[1]+1; i++) {
                cords = new int[] {i,j};
                sum2 += arr[i][j];
            }
        }
        sum2 += arr[cordMax[0]][cordMax[1]];
        sum += arr[cordMax[0]][cordMax[1]];
        return Math.max(sum,sum2);
    }

    public static int[] maxElemHor(int[][] arr, int j){

        int max=Integer.MIN_VALUE, ind=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[j][i]>max){
                max = arr[j][i];
                ind = i;
            }
        }

        return new int[] {max,ind};
    }
    public static int[] maxElemWert(int[][] arr, int j){

        int max=Integer.MIN_VALUE, ind=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][j]>max){
                max = arr[i][j];
                ind = i;
            }
        }

        return new int[] {max,ind};
    }
}
