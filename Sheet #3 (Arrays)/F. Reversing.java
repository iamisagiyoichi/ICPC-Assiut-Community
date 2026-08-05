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

    static void solve() throws Exception {
        int n = sc.nextInt();

        long[] a = new long[n];

        int i = 0;
        while (i < n) {
            a[i] = sc.nextLong();
            i++;
        }

        i = n - 1;
        while (i >= 0) {
            out.print(a[i] + " ");
            i--;
        }

        out.println();
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
