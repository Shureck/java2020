package ru.shureck.java2020.Lab13;

import java.util.ArrayList;
import java.util.Comparator;

public class Students {
    ArrayList<Students> arrayList = new ArrayList<>();
    Comparator<Students> comparator = new Comparator<Students>() {
        @Override
        public int compare(Students o1, Students o2) {
            if(o1.getIdNum() > o2.getIdNum()) {
                return 1;
            }
            else{
                return -1;
            }
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }
    };
    private int idNum;
    private String name;

    public Students(int idNum, String name) {
        this.idNum = idNum;
        this.name = name;
    }

    public Students() {
    }

    public void sort(){
        arrayList.sort(comparator);
    }


    public ArrayList<Students> getArrayList() {
        return arrayList;
    }

    public void setArrayList() {
        arrayList.add(new Students(12, "1"));
        arrayList.add(new Students(23, "2"));
        arrayList.add(new Students(235, "3"));
        arrayList.add(new Students(52352, "4"));
        arrayList.add(new Students(123, "5"));
        arrayList.add(new Students(543, "6"));
        arrayList.add(new Students(6568, "7"));
        arrayList.add(new Students(13131, "8"));
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(arrayList);
    }

    @Override
    public String toString() {
        return "Students{" +
                "idNum=" + idNum +
                ", name='" + name + '\'' +
                '}';
    }
}
