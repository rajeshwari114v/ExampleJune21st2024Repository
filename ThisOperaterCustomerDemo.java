package com.sgtest.Constructor;
class Customer
{
    String firstname;
    String email;
    Customer(String firstname,String email)
    {
        System.out.println("In Constructor");
        this.firstname=firstname;
        this.email=email;
        System.out.println("FirstName:"+firstname);
        System.out.println("EmailId:"+email);
    }
    void display()
    {
        System.out.println("In Method!!!");
        System.out.println("FirstName:"+firstname);
        System.out.println("EmailId:"+email);
    }
}

public class ThisOperaterCustomerDemo
{
    public static void main(String[] args)
    {
        Customer c1=new Customer("priya", "priya@pp.com");
        Customer c2=new Customer("jaya","jaya@jj.com" );
        Customer c3=new Customer("daya","daya@dd.com");
        c1.display();
        c2.display();
        c3.display();
    }
}