import java.util.*;
import java.lang.*;
import java.io.*;

public class main
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int a = (int) n;
        double b = n - a;
        if (b == 0) {
            System.out.println("int " + a);
        } else {
            System.out.printf("float %d %.3f",a,b);
        }
    }
}
