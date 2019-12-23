import java.net.*;
import java.io.*;
class paper5
{
  public static void main(String z[]) throws Exception
  {
      Socket s= new Socket ("localhost",2000);
      System.out.println("Client is Ready");
      DataOutputStream dout =new DataOutputStream(s.getOutputStream());
      dout.writeUTF("Message from client	");
      BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
      while(true)
      {
		  String str = (String)br.readLine();
		  dout.writeUTF(str);
		  System.out.println("Client "+str);
		  }
  }
}