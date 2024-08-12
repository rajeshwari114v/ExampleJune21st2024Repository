package com.sgtest.Constructor;
class Array1D
{
    Array1D(int arr[])
    {
     for(int i=arr.length-1;i>=arr.length/2;i--)
     {
         System.out.println(arr[i]);
     }
    }
}

public class Constructor1DArrayEx
{
    public static void main(String[] args)
    {
        int b[]={10,20,30,40,50,60};
        Array1D a1=new Array1D(b);//this is also k or we can write( Array1D a2=new Array1D(new int[]{2,4,6,8,10,12}); both are correct)
        System.out.println("--------------------");
        Array1D a2=new Array1D(new int[]{2,4,6,8,10,12});
    }
}
