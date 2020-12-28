package com.company;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new List<Integer>();
        List<Integer> list2 = new List<Integer>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        System.out.println(list.isEmpty());
        list.add(2);
        System.out.println(list.isEmpty());
        list.add(3);
        list.add(4);
        list.print();
        System.out.println();
        list.remove(3);
        list.print();
        list.addAll(list2);
        list.print();
        list.removeAll();
        System.out.println();
        list.print();
    }
}
