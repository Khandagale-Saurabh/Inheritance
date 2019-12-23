import java.net.*;
class paper1
{
   public static void main(String aa[]) throws Exception
   {
        URL u =new URL("https://www.sai.com:80/main.jsp");
        System.out.println(""+u.getPort());
          System.out.println(""+u.getProtocol());
            System.out.println(""+u.getFile());
              System.out.println(""+u.getHost());

              System.out.println(""+InetAddress.getLocalHost());
              System.out.println(""+InetAddress.getByName("www.google.com"));
              System.out.println(""+u.getHost());


			 InetAddress aaa[]=InetAddress.getAllByName("www.Facebook.com");
             for(int i=0;i<=aaa.length-1;i++)
         {
             System.out.println("Gpn"+aaa[i]);
			 }

   }

}