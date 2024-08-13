import java.util.*;
import java.io.*;

public class Main {

    static int arr[];
    static boolean bool[];
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        arr = new int[n2];
        bool = new boolean[n1];

        dps(n1, n2, 0);
    }

    public static void dps(int n1, int n2, int deep) {

        if(n2 == deep) {
            for(int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < n1; i++) {
            if(bool[i] == false) {
                bool[i] = true;
                arr[deep] = i + 1;
                dps(n1, n2, deep + 1);
                bool[i] = false;
            }
        }
    }

}
