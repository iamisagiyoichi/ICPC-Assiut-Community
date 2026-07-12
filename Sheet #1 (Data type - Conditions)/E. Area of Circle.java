import java.util.*;
import java.lang.*;
import java.io.*;

public class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double pi = 3.141592653;
		double area = pi*r*r;
		System.out.printf("%.9f%n",area);
		sc.close();
	}
}
