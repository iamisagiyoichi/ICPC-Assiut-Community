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
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static int oddSum(int a, int b) {
        int c = Math.min(a, b) + 1;
        int d = Math.max(a, b);
        int e = 0;

        while (c < d) {
            if ((c & 1) == 1) {
                e += c;
            }
            c++;
        }

        return e;
    }

    static void solve() throws Exception {
        int a = sc.nextInt();
        int b = sc.nextInt();

        out.println(oddSum(a, b));
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}
