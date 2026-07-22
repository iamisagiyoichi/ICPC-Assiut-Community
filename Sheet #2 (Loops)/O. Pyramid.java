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

    static void printRow(int a) {
        int b = 0;

        while (b < a) {
            out.print("*");
            b++;
        }

        out.println();
    }

    public static void solve() throws Exception {
        int a = sc.nextInt();
        int b = 1;

        while (b <= a) {
            printRow(b);
            b++;
        }
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
