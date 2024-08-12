package com.sgtest.Constructor;

class Maths1
{
    Maths1(int num)
    {
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("");
    }

    public class FactorialEx {
        public static void main(String[] args)
        {
            Maths1 m1 = new Maths1(4);
        }
    }
}
