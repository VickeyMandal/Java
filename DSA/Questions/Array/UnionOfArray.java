package Questions.Array;

import java.util.*;

public class UnionOfArray {

    public static int union(int[] a, int n, int[] b, int m) {
        int ans = 0;
        Set<Integer> sa = new HashSet<Integer>();
        Set<Integer> sb = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            sa.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            sb.add(b[i]);
        }
        sa.addAll(sb);
        ans = sa.size();
        return ans;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(union(a,n,b,m));
    }

}
