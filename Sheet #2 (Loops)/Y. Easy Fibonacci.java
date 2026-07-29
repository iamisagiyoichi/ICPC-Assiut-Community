import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static long[] a(int b) {
        long[] c = new long[b];

        if (b >= 1) c[0] = 0;
        if (b >= 2) c[1] = 1;

        int d = 2;
        while (d < b) {
            c[d] = c[d - 1] + c[d - 2];
            d++;
        }

        return c;
    }

    static void b(long[] c) {
        int d = 0;
        while (d < c.length) {
            out.print(c[d] + " ");
            d++;
        }
        out.println();
    }

    static void c() throws Exception {
        int a = sc.nextInt();
        long[] b = a(a);
        b(b);
    }

    public static void main(String[] args) throws Exception {
        c();
        out.flush();
    }
}
