abstract class abst
{
 int a,b,c;
       public void cal(int a1,int b1)
       {
       a=a1;
       b=b1;
         c=a+b;
         System.out.println("Summation ="+c);
       }
       abstract public void display()
       ;
}
class der extends abst
{

	 public void display()
	 {
		 System.out.println("inside abstsrct");
		 }
}
class mymain
{
  public static void main(String aa[])
  {
         der d=new der();
         d.display();
         d.cal(100,200);
  }
}
