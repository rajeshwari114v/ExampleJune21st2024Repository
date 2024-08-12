package com.sgtest.Constructor;
class Person1Err
{
    String firstname;
    String email;
    Person1Err(String firstname,String email)
    {
        System.out.println("In Constructor");
        firstname=firstname;
        email=email;
        System.out.println("FirstName:"+ firstname);
        System.out.println("Email Id:"+email);
    }
    void display()
    {
        System.out.println("In Method!!!");
        System.out.println("FirstName:"+ firstname);
        System.out.println("Email Id:"+email);
    }
}
public class Person1Error
{
    public static void main(String[] args)
    {
        //String email = "Abhi@gmail.com";
        Person1Err o1=new Person1Err("Abhi","Abhi@gmail.com");
         o1.display();
    }
}
