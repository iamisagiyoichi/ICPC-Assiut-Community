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
		double result = (double)a/b;
		System.out.println("floor "+a+" / "+b+" = "+(long)Math.floor(result));
		System.out.println("ceil "+a+" / "+b+" = "+(long)Math.ceil(result));
		System.out.println("round "+a+" / "+b+" = "+(long)Math.round(result));
		sc.close();

	}
}
