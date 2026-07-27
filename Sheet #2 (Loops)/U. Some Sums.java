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

    static int digitSum(int a) {
        int b = 0;

        while (a > 0) {
            b += a % 10;
            a /= 10;
        }

        return b;
    }

    static void solve() throws Exception {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = 1;
        int ans = 0;

        while (c <= n) {
            int d = digitSum(c);

            if (d >= a && d <= b) {
                ans += c;
            }

            c++;
        }

        out.println(ans);
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
