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
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long e = 1;
        e = (e * (a % 100)) % 100;
        e = (e * (b % 100)) % 100;
        e = (e * (c % 100)) % 100;
        e = (e * (d % 100)) % 100;

        out.printf("%02d\n", e);
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
