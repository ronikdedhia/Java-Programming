import java.net.;
import java.io.; i mport
java.util.*; public
class client
{ public static void main (String args[]) throws IOException
{
Sockets=new Socket("localhost",4999);
Scanner sc=new Scanner(System.in);
double plaintext,ciphertext;
int public_key2,private_key1;
SAP ID: 60003210028
System.out.println("Enter the plaintext");
plaintext=sc.nextInt();
System.out.println("Enter the value of n");
int n=sc.nextInt();
public_key2=7;
private_key1=7;
ciphertext=(Math.pow(plaintext, public_key2))%n;
System.out.println("Ciphertext is "+ciphertext);
double digital_signature;
digital_signature=(Math.pow(ciphertext, private_key1))%n;
PrintWriter pr=new PrintWriter(s.getOutputStream());
pr.println(digital_signature);
pr.flush();
}
}
