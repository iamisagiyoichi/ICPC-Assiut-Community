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

    static void printRow(int s, int st) {
        int i = 0;

        while (i < s) {
            out.print(" ");
            i++;
        }

        i = 0;
        while (i < st) {
            out.print("*");
            i++;
        }

        out.println();
    }

    public static void solve() throws Exception {
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            printRow(n - i, 2 * i - 1);
            i++;
        }

        i = n;
        while (i >= 1) {
            printRow(n - i, 2 * i - 1);
            i--;
        }
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
