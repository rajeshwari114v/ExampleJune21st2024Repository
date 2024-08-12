package com.sgtest.Constructor;

class NewsPaper
{
    String newspapername;
    String newspaperloc;
    NewsPaper(String newspapername,String newspaperloc)
    {
       this.newspapername=newspapername;
       this.newspaperloc=newspaperloc;
        System.out.println("Newspapername:"+newspapername);
        System.out.println("Newspaperloc:"+newspaperloc);
    }
    void display()
    {
        System.out.println("Newspapername:"+newspapername);
        System.out.println("newspaperloc:"+newspaperloc);
    }
}
class Magazine
{
    String  magazinename;
    int maxinprice;
    Magazine(String  magazinname,int magazinprice)
    {
        this.magazinename=magazinname;
        this.maxinprice=magazinprice;
        System.out.println("Magazinname:"+magazinname);
        System.out.println("Magazinprice:"+magazinprice);
    }
    void display()
    {
        System.out.println("Magazinname:"+magazinename);
        System.out.println("Maxinprice:"+maxinprice);
    }
}
class Comics
{
    String comicsname;
    int comicsprice;
    Comics(String comicsname,int comicsprice)
    {
        this.comicsname=comicsname;
        this.comicsprice=comicsprice;
        System.out.println("Comicsname:"+comicsname);
        System.out.println("Comicsprice:"+comicsprice);
    }
    void display()
    {
        System.out.println("Comicsname:"+comicsname);
        System.out.println("Comicsprice:"+comicsprice);
    }
}

public class NewsPaperEx
{
    public static void main(String[] args)
    {
        NewsPaper n1=new NewsPaper("DeccanHerald","Bangalore");
        Magazine m1=new Magazine("Sudha",25);
        Comics c1=new Comics("BatMan",950);
        n1.display();
        m1.display();
        c1.display();
    }
}
