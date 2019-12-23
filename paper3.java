import java.net.*;

class paper3
{
    public static void main(String aa[]) throws Exception
    {
         DatagramSocket ds =new DatagramSocket(2000);
         byte b[] =new byte[2000];
         DatagramPacket dp =new DatagramPacket(b,b.length);
         ds.receive(dp);
       String  msg =new String(b);
       System.out.println("Message "+msg);
    }
}