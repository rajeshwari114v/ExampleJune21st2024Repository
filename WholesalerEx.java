package com.sgtest.Constructor;

class Wholesale
{
    String wholesaleshopname;
    String wholesaleshopLoc;
    Wholesale( String wholesaleshopname,String wholesaleshopLoc)
    {
       this.wholesaleshopname=wholesaleshopname;
       this.wholesaleshopLoc=wholesaleshopLoc;
        System.out.println("Wholesaleshopname:"+wholesaleshopname);
        System.out.println("WholesaleshopLoc:"+wholesaleshopLoc);
    }
    void display()
    {
        System.out.println("Wholesaleshopname:"+wholesaleshopname);
        System.out.println("WholesaleshopLoc:"+wholesaleshopLoc);
    }
}
class Retailer
{
    String retailername;
    long retailerno;
    Retailer(String retailername,long retailerno)
    {
        this.retailername=retailername;
        this.retailerno=retailerno;
        System.out.println("Retailername:"+retailername);
        System.out.println("Retailerno:"+retailerno);
    }
    void display()
    {
        System.out.println("Retailername:"+retailername);
        System.out.println("Retailerno:"+retailerno);
    }
}
class Purchaser
{
    String purchasername;
    int purchaserno;
    Purchaser(String purchasername,int purchaserno)
    {
        this.purchasername=purchasername;
        this.purchaserno=purchaserno;
        System.out.println("purchasername:"+purchasername);
        System.out.println("purchaserno:"+purchaserno);
    }
    void display()
    {
        System.out.println("purchasername:"+purchasername);
        System.out.println("purchaserno:"+purchaserno);
    }
}

public class WholesalerEx
{
    public static void main(String[] args)
    {
        Wholesale w1=new Wholesale("SparHyperMarket","Jaynagr");
        Retailer r1=new Retailer("more",9123456780l);
        Purchaser p1=new Purchaser("Veer",1000);

    }
}
