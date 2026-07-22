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

    static void printLine(String a, int b) {
        int c = 0;

        while (c < b) {
            out.print(a);
            c++;
        }

        out.println();
    }

    public static void solve() throws Exception {
        String a = sc.next();
        int b = sc.nextInt();

        int c = 0;

        while (c < b) {
            int d = sc.nextInt();
            printLine(a, d);
            c++;
        }
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
