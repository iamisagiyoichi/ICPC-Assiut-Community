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
		System.out.println(a%10 + b%10);
		sc.close();
	}
}
