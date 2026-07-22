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
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static boolean lucky(int a) {
        while (a > 0) {
            int b = a % 10;

            if (b != 4 && b != 7) {
                return false;
            }

            a /= 10;
        }

        return true;
    }

    public static void solve() throws Exception {
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean c = false;

        while (a <= b) {
            if (lucky(a)) {
                out.print(a + " ");
                c = true;
            }
            a++;
        }

        if (!c) {
            out.print(-1);
        }
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
