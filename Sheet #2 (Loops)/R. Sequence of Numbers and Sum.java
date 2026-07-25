import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                String s = br.readLine();
                if (s == null) {
                    return null;
                }
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static void printSequence(int a, int b) {
        int c = Math.min(a, b);
        int d = Math.max(a, b);
        int e = 0;

        while (c <= d) {
            out.print(c + " ");
            e += c;
            c++;
        }

        out.println("sum =" + e);
    }

    public static void solve() throws Exception {
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a <= 0 || b <= 0) {
                break;
            }

            printSequence(a, b);
        }
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
