import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
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

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }

        int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            int b = 0;
            while (b < n) {
                a[b] = nextInt();
                b++;
            }
            return a;
        }

        long[] nextLongArray(int n) throws IOException {
            long[] a = new long[n];
            int b = 0;
            while (b < n) {
                a[b] = nextLong();
                b++;
            }
            return a;
        }
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void solve() throws Exception {
        int a = sc.nextInt();

        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        int f = 0;
        while (f < a) {
            int g = sc.nextInt();

            if ((g & 1) == 0) {
                b++;
            } else {
                c++;
            }

            if (g > 0) {
                d++;
            } else if (g < 0) {
                e++;
            }

            f++;
        }

        out.println("Even: " + b);
        out.println("Odd: " + c);
        out.println("Positive: " + d);
        out.println("Negative: " + e);
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
