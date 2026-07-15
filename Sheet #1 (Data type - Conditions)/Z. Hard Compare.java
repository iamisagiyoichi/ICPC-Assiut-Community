import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double l = b*Math.log(a);
        double r = d* Math.log(c);
        if (l > r) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
