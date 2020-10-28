package ru.shureck.java2020.Lab16;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class Lab16 {

    public static void main(String[] args) {
        Queue first = new LinkedList();
        Queue second = new LinkedList();
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.nextLine();
        first.addAll(Arrays.asList(str.split(" ")));
        str = scanner.nextLine();
        second.addAll(Arrays.asList(str.split(" ")));

        while(first.size()>0 && second.size()>0 && counter<106){
            if(Integer.parseInt(first.peek().toString()) > Integer.parseInt(second.peek().toString())){
                if ((Integer.parseInt(first.peek().toString()) == 9) && (Integer.parseInt(second.peek().toString()) == 0)){
                    second.add(second.remove());
                    second.add(first.remove());
                }
                else {
                    first.add(first.remove());
                    first.add(second.remove());
                }
            }
            else if(Integer.parseInt(first.peek().toString()) < Integer.parseInt(second.peek().toString())){
                if ((Integer.parseInt(second.peek().toString()) == 9) && (Integer.parseInt(first.peek().toString()) == 0)){
                    first.add(first.remove());
                    first.add(second.remove());
                }
                else {
                    second.add(second.remove());
                    second.add(first.remove());
                }
            }
            counter++;
        }
        if(counter >= 106) {
            System.out.println("botva");
        }
        else if(first.size() == 0){
            System.out.println("second " + counter);
        }
        else if(second.size() == 0){
            System.out.println("first " + counter);
        }
    }
}
