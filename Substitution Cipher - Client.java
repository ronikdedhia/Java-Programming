// A Java program for a Client
import java.net.*;
import java.io.*;

public class Client
{
public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	// initialize socket and input output streams
	private Socket socket		 = null;
	private DataInputStream input = null;
	private DataOutputStream out	 = null;

	// constructor to put ip address and port
	public Client(String address, int port)
	{
		// establish a connection
		try
		{
			socket = new Socket(address, port);
			System.out.println("Connected");

			// takes input from terminal
			input = new DataInputStream(System.in);

			// sends output to the socket
			out = new DataOutputStream(socket.getOutputStream());
		}
		catch(UnknownHostException u)
		{
			System.out.println(u);
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
		String line = "";
        int s = 4;

		// string to read message from input
        
		// keep reading until "Over" is input
		while (!line.equals("Over"))
		{
			try
			{
				line = input.readLine();
				String p = encrypt(line, s);
				out.writeUTF(p);
			}
			catch(IOException i)
			{
				System.out.println(i);
			}
		}
        //System.out.println("Text  : " + line);
        //System.out.println("Shift : " + s);
        //System.out.println("Cipher: " + encrypt(line, s));

		// close the connection
		try
		{
			input.close();
			out.close();
			socket.close();
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}


  public static String encrypt(String plainText, int shiftKey)
    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
  
	
	public static void main(String args[])
	{
		Client client = new Client("10.120.53.113", 5000);
		
	}
}
