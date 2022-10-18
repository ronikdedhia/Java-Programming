import java.net.*; import java.io.*;
public class GreetingClient {
public static void main(String[] args)
{
try {
String ps, gs, K2s;
String serverName = "192.168.43.141"; int port = 8088;
// Declare p, g, and Key of client
int p = 41; int g = 7; int y = 5;
double K2dash, serverK1;
// Established the connection
System.out.println("Connecting to " + serverName
+ " on port " + port); Socket client = new Socket(serverName, port);
System.out.println("Just connected to "
+ client.getRemoteSocketAddress());
// Sends the data to client
OutputStream outToServer = client.getOutputStream(); DataOutputStream out = new
DataOutputStream(outToServer);
ps = Integer.toString(p); out.writeUTF(ps); // Sending p
gs = Integer.toString(g); out.writeUTF(gs); // Sending g
double K2 = ((Math.pow(g, y)) % p); // calculation of K2
K2s = Double.toString(K2); out.writeUTF(K2s); // Sending K2
// Accepts the data
DataInputStream in = new DataInputStream(client.getInputStream());
serverK1 = Double.parseDouble(in.readUTF()); System.out.println("From Server : R2 = " +
serverK1);
K2dash = ((Math.pow(serverK1, y)) % p); // calculation of K2dash
System.out.println("K = "
+ K2dash);
client.close();
}
catch (Exception e) { e.printStackTrace();
}
}
}
