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
		
		int[] arr = {a,b,c};
		Arrays.sort(arr);
		
		for(int num:arr){
		    System.out.println(num);
		}
		
		System.out.println();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();

	}
}
