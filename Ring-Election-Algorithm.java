import java.util.*;
public class ring
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter no. of processes");
    int num_proc = sc.nextInt ();
    int[] flag = new int[num_proc];
    for (int i = 0; i < num_proc; i++)
      {
	flag[i] = 1;
      }
    System.out.println ("Enter no. of processes that fail");
    int fail_proc = sc.nextInt ();
    System.out.println ("Enter process no. that fails Start from 0 to n-1");
    for (int j = 0; j < fail_proc; j++)
      {
	int temp = sc.nextInt ();
	flag[temp] = 0;
      }
    System.out.println ("Enter initiator");
    int init = sc.nextInt ();
    int coord = -1;
    for (int i = init + 1; i <= num_proc + init; i++)
      {
	int i2 = i % num_proc;
	if (flag[i2] == 0)
	  continue;
	System.out.println ("E sent to processor no." + i2);
      }
    for (int i = init + 1; i < num_proc; i++)
      {
	if (flag[i] == 0)
	  continue;
	System.out.println ("C is sent to " + i);
	coord = i;
      }
    System.out.println ("Coordinator is " + coord);
  }
}