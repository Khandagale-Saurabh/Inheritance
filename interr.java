import java.util.*;
interface intt
{
   int roll=1011;
   public String name="Saurabh";
   public   void fun1();
}

class inter implements intt
{
     public void fun1()
     {

          System.out.println("Name= "+name+" Roll"+roll);
     }
   public static void main(String args[])
   {
            inter n=new inter();
            n.fun1();
   }
}