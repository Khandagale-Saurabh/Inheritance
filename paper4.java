import java.net.*;
import java.io.*;
class paper4
{
  public static void main(String z[]) throws Exception
  {
         ServerSocket ss =new ServerSocket(2000);
         System.out.println("Waiting....Server Side");

         Socket s =ss.accept();
         System.out.println("Connected from Server Side");
         DataInputStream dis =new DataInputStream(s.getInputStream());
         BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
         while(true)
         {

               String str= (String)dis.readUTF();
               System.out.println("Message "+str);

	     }
  }
}