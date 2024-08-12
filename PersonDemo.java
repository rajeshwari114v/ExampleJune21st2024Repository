package com.sgtest.Constructor;
class Person
{
    String firstname;
    int age;
       Person(String fn, int age)
       {
          firstname = fn;
          age = age;
          System.out.println("FirstName:" + firstname);
          System.out.println("Age:" + age);
       }
}

public class PersonDemo
{
    public static void main(String[] args)
    {
        Person o1=new Person("abhi",22);
        Person o2=new Person("zoya",25);
        Person o3=new Person("priya",22);
        Person o4=new Person("tanya",30);

    }
}
