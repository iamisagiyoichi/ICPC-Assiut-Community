import java.io.*;
import java.util.*;

public class Main {
    static class FastScanner {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        long l1 = fs.nextLong();
        long r1 = fs.nextLong();
        long l2 = fs.nextLong();
        long r2 = fs.nextLong();

        long left = Math.max(l1, l2);
        long right = Math.min(r1, r2);

        if (left <= right) {
            System.out.println(left + " " + right);
        } else {
            System.out.println(-1);
        }
    }
}

