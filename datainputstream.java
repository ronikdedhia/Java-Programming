import java.io.*;
import java.util.*;

class datainputstream {
public static void main(String[] args)throws IOException
{
int i,n,valid=0,invalid=0;
String str;
DataInputStream dis = new DataInputStream(System.in);
System.out.println("enter the value of n");
n=Integer.parseInt(dis.readLine());
int x[]=new int[n];
System.out.println("Enter Array:");
for(i=0;i<n;i++)
{
str=dis.readLine();
try
{
x[i]=Integer.parseInt(str);
valid++;
}
catch(NumberFormatException nfe)
{
invalid++;
}
}
System.out.println("Valid numbers :"+valid+"\nInvalid numbers:"+invalid);
}
}