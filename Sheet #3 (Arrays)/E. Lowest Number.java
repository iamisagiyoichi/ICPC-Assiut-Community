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
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static void solve() throws Exception {
        int n = sc.nextInt();

        int mn = Integer.MAX_VALUE;
        int pos = -1;

        int i = 1;

        while (i <= n) {
            int a = sc.nextInt();

            if (a < mn) {
                mn = a;
                pos = i;
            }

            i++;
        }

        out.println(mn + " " + pos);
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
