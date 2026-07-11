import java.util.*;
import java.lang.*;
import java.io.*;

public class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = Math.min(a,Math.min(b,c));
		int max = Math.max(a,Math.max(b,c));
		System.out.println(min+" "+max);
		sc.close();
	}
}
