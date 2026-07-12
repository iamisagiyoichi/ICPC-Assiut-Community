import java.util.*;
import java.lang.*;
import java.io.*;

public class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch >= '0' && ch <= '9'){
		    System.out.println("IS DIGIT");
		}
		else{
		    System.out.println("ALPHA");
		    if(ch >= 'A' && ch <= 'Z'){
		        System.out.println("IS CAPITAL");
		    }
		    else{
		        System.out.println("IS SMALL");
		    }
		}
		sc.close();
	}
}
