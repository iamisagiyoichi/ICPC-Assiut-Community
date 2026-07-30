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

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static void solve() throws Exception {
        long n = sc.nextLong();

        int c = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                c++;
            }
            n >>= 1;
        }

        long ans = (1L << c) - 1;

        out.println(ans);
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}
