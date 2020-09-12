package ru.shureck.java2020.Kvort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int proc,num=0;
        int counter=0, proc_count=0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        proc = num;
        if(num == 1){
            System.out.println(1);
        }
        else {
            if(num % 5 == 2) proc_count -= 1;
            while (true) {
                if (proc - 5 >= 0) {
                    proc_count += 3;
                    proc -= 5;
                }
                else {
                    if (proc - 3 >= 0) {
                        proc_count += 2;
                        proc -= 3;
                    }
                    else {
                        if (proc - 1 >= 0) {
                            proc_count += 1;
                            proc -= 1;
                        }
                        else {
                            break;
                        }
                    }
                }
            }
            System.out.println(proc_count);
        }
    }
}
