import java.net.*; import java.io.*;
public class GreetingServer {
public static void main(String[] args) throws IOException
{
try {
int port = 8088;
// Server Key
int x = 9;
// Client p, g, and key
double clientP, clientG, clientK2, K1, K1dash; String K1s;
// Established the Connection
ServerSocket serverSocket = new ServerSocket(port); System.out.println("Waiting for client on
port " +
serverSocket.getLocalPort() + "...");
Socket server = serverSocket.accept(); System.out.println("Just connected to " +
server.getRemoteSocketAddress());
// Accepts the data from client
DataInputStream in = new DataInputStream(server.getInputStream()); clientP =
Integer.parseInt(in.readUTF()); // to accept p
clientG = Integer.parseInt(in.readUTF()); // to accept g clientK2 =
Double.parseDouble(in.readUTF()); // to accept K2 System.out.println("From Client : R1 = " +
clientK2);
K1 = ((Math.pow(clientG, x)) % clientP); // calculation of K1
K1s = Double.toString(K1);
// Sends data to client
// Value of K1
OutputStream outToclient = server.getOutputStream(); DataOutputStream out = new
DataOutputStream(outToclient); out.writeUTF(K1s); // Sending K1
K1dash = ((Math.pow(clientK2, x)) % clientP); // calculation of K1dash
System.out.println("K = "
+ K1dash);
server.close();
}
catch (SocketTimeoutException s) { System.out.println("Socket timed out!");
}
catch (IOException e) {
}
}
}