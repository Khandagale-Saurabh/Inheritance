import java.lang.*;
class sai74 extends Thread
{
  public void lo()
  {
   int i;

   try
   {

   for(i=0;i<=10;i++)
     {
		  Thread.sleep(200);

    System.out.println(" "+i);

     }

   }
   catch(Exception e)
   {
	    System.out.println("wwwww");
	   }

}
}
class mymain2
{
  public static void main(String args[])
  {
     sai74 d=new sai74();

      d.lo();

   try
   {

   for(i=0;i<=10;i++)
     {
		  Thread.sleep(200);

    System.out.println(" "+i);

     }

   }
   catch(Exception e)
   {
	    System.out.println("wwwww");
	   }
}


  }
}