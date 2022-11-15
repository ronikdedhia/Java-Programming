import java.io.;
import java.net.;
public class server
{ public static void main(String args[])throws IOException
{
ServerSocket ss=new ServerSocket(4999);
Socket s=ss.accept();
System.out.println("Client connected. ..");
InputStreamReader in=new InputStreamReader(s.getInputStream());
BufferedReader bf=new BufferedReader(in);
String str=bf.readLine();
System.out.println("Read the digital signature "+str);
double ds=Double.parseDouble(str);
int public_key1,private_key2;
SAP ID: 60003210028
public_key1=9;
private_key2=9;
int n=33;
System.out.println("Veryfing the signature....");
doubleciphertext;
ciphertext=(Math.pow(ds, public_key1))%n;
System.out.println("Ciphertext is "+ciphertext);
System.out.println("Verification Completed");
double plaintext;
plaintext=(Math.pow(ciphertext,private_key2)%n);
System.out.println("Plaintext is "+plaintext);
}
}
