import java.util.*;
import java.lang.*;
import java.io.*;

public class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>=b){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
		sc.close();
	}
}
