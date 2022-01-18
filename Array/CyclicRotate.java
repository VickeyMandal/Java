package Array;
import java.util.*;

public class CyclicRotate {

    public static void rotate(int[] a, int n) {
        int temp = a[n-1];
        for (int i = n-2; i >= 0; i--) {
            a[i+1] = a[i];
        }
        a[0] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        rotate(a,n);
    }
}
