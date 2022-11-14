import java.io.*;
import java.util.*;
import java.net.*;
public class ChallengeResponseServer
{
 public static void main(String[] args)
 {
int otp = (int)(Math.random()*(9000)+1000);
 try{
 ServerSocket ss = new ServerSocket(6666);
 Socket ch = ss.accept();
 String otp_sent = Integer.toString(otp);
 OutputStream out = ch.getOutputStream();
 PrintStream pout = new PrintStream(out);
 pout.println(otp_sent);
System.out.println("Otp sent: " + otp_sent);
 InputStream in = ch.getInputStream();
 DataInputStream din = new DataInputStream(in);
 String otp_received = din.readLine();
//otp_received = otp_received.substring(0,otp_sent.length());
System.out.println("OTP received: "+otp_received):
 if(otp_received.equals(otp_sent))
System.out.println("OTP entered succesfully");
else
System.out.println("Invalid OTP");
 pout.close();
 din.close();
 ch.close();
 ss.close();
 }
 catch(Exception e)
 {
 System.out.println("error");
 }
}
}   