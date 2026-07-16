import java.io.*;
import java.util.*;

public class Main {
    static class FastScanner {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        double x = fs.nextDouble();

        if (x >= 0 && x <= 25) {
            System.out.println("Interval [0,25]");
        } else if (x > 25 && x <= 50) {
            System.out.println("Interval (25,50]");
        } else if (x > 50 && x <= 75) {
            System.out.println("Interval (50,75]");
        } else if (x > 75 && x <= 100) {
            System.out.println("Interval (75,100]");
        } else {
            System.out.println("Out of Intervals");
        }
    }
}

