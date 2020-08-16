import java.io.*;
import java.util.*;
import java.math.*;
  
class Product
{
    int total_stock=0, colgate=100;
}
class Beauty extends Product
{
    int cream=100;
}
class Grocery extends Beauty
{
    int salt=500,tea=200;

public static void  main(String args[])
{
 Grocery g=new Grocery();
 g.total_stock=g.colgate+g.salt+g.tea+g.cream;
    System.out.println("Total avaible stock in shop:"+g.total_stock);
}
}