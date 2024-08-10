package com.sgtesting.programs;

public class TestingEx1
{
    public static void main(String[] args) {
        int count= 5;
        for (int i = 1; i <= count; i++) {
            count = count + i;

            System.out.println("the given count of no:" + count);
        }
    }
}
