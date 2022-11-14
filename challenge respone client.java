import java.io.*;
import java.util.*;
import java.net.*;
public class ChallengeResponseClient
{
 public static void main(String[] args)
 {
 try
 {
 Socket s = new Socket ("localhost", 6666);
 InputStream in = s.getInputStream();
 DataInputStream din = new DataInputStream(in);
 String otp = din.readLine();
 OutputStream out = s.getOutputStream();
 PrintStream pout = new PrintStream(out);
System.out.println("OTP Received: "+otp);
 pout.println(otp);
 pout.close();
 s.close();
 }
 catch(Exception e)
 {
 System.out.println("error");
 }
}
}