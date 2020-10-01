package ru.shureck.java2020.Olimp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        boolean[][] arr = new boolean[4][5];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[1].length; j++)
            {
                arr[i][j] = random.nextBoolean();
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[1].length; j++)
            {
                System.out.println((arr[i][j]));
            }
            System.out.println();
        }

        System.out.println("Комбинации");
        for (ArrayList<Integer> lst: Logic(arr))
        {
            if (lst != null)
            {
                for(int number: lst){
                    System.out.println(number + 1 + " ");
                }
                System.out.println();
            }
        }
    }

    static ArrayList<ArrayList<Integer>> Logic(boolean[][] arr)
    {
        ArrayList<ArrayList<Integer>> listing = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < arr[1].length; i++)
        {
            Foo(arr, new ArrayList<Integer>(), 0, i, listing);
        }

        return listing;
    }

    static void Foo(boolean[][] arr,ArrayList<Integer> lst, int row, int col, ArrayList<ArrayList<Integer>> listing)
    {
        if (!arr[row][col] || lst.contains(col))
        return;
        lst.add(col);
        if (row + 1 == arr.length)
        {
            listing.add(lst);
            return;
        }
        for (int i = 0; i < arr[1].length; i++)
            Foo(arr, new ArrayList<Integer>(lst), row + 1, i, listing);
    }

}
