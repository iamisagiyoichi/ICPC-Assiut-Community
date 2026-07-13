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
		int b = a/1000;
		if(b % 2 == 0){
		    System.out.println("EVEN");
		}
		else{
		    System.out.println("ODD");
		}
		sc.close();
	}
}
