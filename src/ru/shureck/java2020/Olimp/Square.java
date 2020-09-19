package ru.shureck.java2020.Olimp;

public class Square {

    public static  int[][] mass = { {0,-3,84,5,-2},
            {13,-40,51,13,-12},
            {-25,16,-17,0,-8},
            {31,10,9,10,-20},
            {6,4,16,-17,0}};

    public static void main(String[] args) {
        for (int i = 0; i < mass[0].length; i++) {
            System.out.println(maxElem(mass, i)[0] + " " + maxElem(mass, i)[1]);
        }
    }

    public static int[] maxElem(int[][] arr, int j){

        int max=Integer.MIN_VALUE, ind=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[j][i]>max){
                max = arr[j][i];
                ind = i;
            }
        }

        return new int[] {max,ind};
    }
}
