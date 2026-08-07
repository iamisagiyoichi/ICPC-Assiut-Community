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

    static void sort(int[] a) {
        int n = a.length;

        int i = 0;
        while (i < n - 1) {
            int j = 0;
            while (j < n - i - 1) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
                j++;
            }
            i++;
        }
    }

    static void solve() throws Exception {
        int n = sc.nextInt();

        int[] a = new int[n];

        int i = 0;
        while (i < n) {
            a[i] = sc.nextInt();
            i++;
        }

        sort(a);

        i = 0;
        while (i < n) {
            out.print(a[i] + " ");
            i++;
        }

        out.println();
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
