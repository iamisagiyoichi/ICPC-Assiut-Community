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
		long b = sc.nextLong();
		char c = sc.next().charAt(0);
		float d = sc.nextFloat();
		double e = sc.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.printf("%.2f%n",d);
		System.out.printf("%.1f%n",e);
		
		sc.close();

	}
}
