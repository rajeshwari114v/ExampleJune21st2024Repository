package com.sgtest.Constructor;

class Human
{
    Human(String firstname)
    {
        System.out.println("FirstName:"+firstname);
    }
    Human(int age)
    {
        System.out.println("Age:"+age);
    }
}

public class ConstructorOverloadingEx
{
    public static void main(String[] args)
    {

        Human o1=new Human("ishu");
        Human o2=new Human(22);
    }
}
