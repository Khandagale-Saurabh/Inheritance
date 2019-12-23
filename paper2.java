import java .net.*;
class paper2
{
  public static void main(String aa[]) throws Exception
   {
        DatagramSocket ds =new DatagramSocket();
       byte b[] ="SaiCompyusys".getBytes();
       InetAddress ia = InetAddress.getByName("localhost");
       int port=2000;
       DatagramPacket dp =new DatagramPacket(b,b.length,ia,port);

       ds.send(dp);
   }
}