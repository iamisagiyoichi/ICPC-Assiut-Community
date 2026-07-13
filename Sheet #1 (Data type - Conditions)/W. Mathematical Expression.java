import java.util.*;
import java.lang.*;
import java.io.*;

public class main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        char op = sc.next().charAt(0);
        int B = sc.nextInt();
        sc.next();
        int C = sc.nextInt();
        int result = 0;
        if (op == '+') {
            result = A + B;
        } else if (op == '-') {
            result = A - B;
        } else {
            result = A * B;
        }
        if (result == C) {
            System.out.println("Yes");
        } else {
            System.out.println(result);
        }
    }
}
