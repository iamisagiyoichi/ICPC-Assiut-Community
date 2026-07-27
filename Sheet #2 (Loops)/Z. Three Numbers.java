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

    static void solve() throws Exception {
        int k = sc.nextInt();
        int s = sc.nextInt();

        int ans = 0;

        int x = 0;
        while (x <= k) {
            int y = 0;

            while (y <= k) {
                int z = s - x - y;

                if (z >= 0 && z <= k) {
                    ans++;
                }

                y++;
            }

            x++;
        }

        out.println(ans);
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
