package com.neha.programs;

//final:-class=>no one can inheirit these class.
//function=>can't create function with same name,we cant override
class Square
{
    public void calcSquare(int n)
    {
        int sq;
        sq=n*n;
        System.out.println("Square is "+sq);
    }
    public final void show()
    {
         System.out.println("welcome to final");
    }
}

final class Addition extends Square
{
    public void add(int a,int b)
    {
        int res;
        res=a+b;
        System.out.println("Sum is "+res);
    }

  // public void show() // we can't override
  //{
   //    System.out.println("cant run");
//   }
    
}


class TestFinal
{
    public static void main(String[] args)
    {
        Addition x=new Addition();
        x.calcSquare(89);
        x.add(12,56);
        x.show();
    }
}