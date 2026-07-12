import java.util.*;
import java.lang.*;
import java.io.*;

public class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = a+b;
		long d = a*b;
		long e = a-b;
		System.out.println(a+" + "+b+" = "+c);
		System.out.println(a+" * "+b+" = "+d);
		System.out.println(a+" - "+b+" = "+e);
		sc.close();

	}
}
