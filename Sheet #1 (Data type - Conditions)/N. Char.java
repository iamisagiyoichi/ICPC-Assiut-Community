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
		
		if(ch >= 'a'){
		    System.out.println((char)(ch-32));
		}
		else{
		    System.out.println((char)(ch+32));
		}

	}
}
