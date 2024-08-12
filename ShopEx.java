package com.sgtest.Constructor;
class Shop
{
    String shopname;
    int shopno;
    Shop( String shopname,int shopno)
    {
        this.shopname=shopname;
        this.shopno=shopno;
        System.out.println("Shopname:"+shopname);
        System.out.println("Shopno:"+shopno);
    }
    void display()
    {
        System.out.println("Shopname:"+shopname);
        System.out.println("Shopno:"+shopno);
    }
}
class Purchase
{
    String productname;
    int productno;
    Purchase( String productname,int productno)
    {
        this.productname=productname;
        this.productno=productno;
        System.out.println("Productname:"+productname);
        System.out.println("Productno:"+productno);
    }
    void display()
    {
        System.out.println("Productname:"+productname);
        System.out.println("Productno:"+productno);
    }
}
class Distributer
{
    String distributername;
    int distributerRegno;
    Distributer( String distributername,int distributerRegno)
    {
        this.distributername=distributername;
        this.distributerRegno=distributerRegno;
        System.out.println("Distributername:"+distributername);
        System.out.println("DistributerRegno:"+distributerRegno);
    }
    void display()
    {
        System.out.println("Distributername:"+distributername);
        System.out.println("DistributerRegno:"+distributerRegno);
    }
}
public class ShopEx
{
    public static void main(String[] args)
    {
        Shop s1=new Shop("Croma",11);
        Purchase p1=new Purchase("LenovoLaptop",8);
        Distributer d1=new Distributer("intelcoreLenovo",101);
    }
}
