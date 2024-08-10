package com.sgtesting.programs;

public class Testing1 {
    public static void main(String[] args) {
        int num = 8;
        int k = 1;
        for (int i = 1; i <= num; i++) {
            k = k * i;
        }
        System.out.println("the given factorial of no:" + k);
    }
}
