package com.util.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        //    addElements();
        //    removeElements();
        //    readElements1();
        //   readElements2();
        // readElementsByIterator();
        // queueDemo();
        withoutGeneric();
    }


    private static void addElements() {
        LinkedList<String> obj = new LinkedList<String>();
        System.out.println("Elements :" + obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add(1, "Watermelon");
        System.out.println("Elements :" + obj);
        LinkedList<String> obj1 = new LinkedList<String>();
        obj1.add("Green");
        obj1.add("Blue");
        obj1.add("White");
        obj.addAll(obj1);
        System.out.println("Elements :" + obj);
    }

    private static void removeElements() {
        LinkedList<String> obj = new LinkedList<String>();
        System.out.println("Elements :" + obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Watermelon");
        System.out.println("Elements :" + obj);
        obj.remove(1);
        System.out.println("Elements :" + obj);
        obj.remove("Banana");
        System.out.println("Elements :" + obj);
        obj.removeAll(obj);
        System.out.println("Elements :" + obj);
    }

    private static void readElements1() {
        LinkedList<String> obj = new LinkedList<String>();
        System.out.println("Elements :" + obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Watermelon");
        System.out.println("Elements :" + obj);
        for (String str : obj) {
            System.out.println(str);
        }
    }

    private static void readElements2() {
        LinkedList<String> obj = new LinkedList<String>();
        System.out.println("Elements :" + obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Watermelon");
        System.out.println("Elements :" + obj);
        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));
        }
    }

    private static void readElementsByIterator() {
        LinkedList<String> obj = new LinkedList<String>();
        System.out.println("Elements :" + obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Watermelon");
        System.out.println("Elements :" + obj);
        Iterator<String> ite =obj.iterator();
        while(ite.hasNext())
        {
            System.out.println(ite.next());
        }
    }

    private static void queueDemo()
    {
        Queue<Integer> obj = new LinkedList<Integer>();
        System.out.println("Elements :" + obj);
        obj.add(100);
        obj.add(200);
        obj.add(300);
        obj.add(400);
        obj.add(500);
        System.out.println("Elements :" + obj);
        obj.remove();
        System.out.println("Elements :" + obj);
    }

    private static void withoutGeneric()
    {
        LinkedList obj = new LinkedList();
        System.out.println("Elements :" + obj);
        obj.add(45);
        obj.add(true);
        obj.add("Mango");
        obj.add(10.175);
        obj.add('Y');
        obj.add("Bangalore");
        System.out.println("Elements :"+obj);
    }
}