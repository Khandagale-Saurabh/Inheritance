import java.util.*;
interface intt
{
  public int roll=2020;
   public String name="22";
   public   void fun1();
   public void dd();
}

class inter implements intt
{

	   public void dd()
	   {
		    System.out.println("wwwww");
	   }
     public void fun1()
     {


          System.out.println("Name= "+name+" Roll"+roll);
     }
   public static void main(String args[])
   {
            inter n=new inter();
            n.fun1();
            n.dd();
   }
}