package Array;
import java.util.*;

public class MinAndMax {

    public static void findMinAndMax(int[] arr, int n) {
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min + " " +max);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i< n ; i++) {
            arr[i] = sc.nextInt();
        }
        // for (int i=0; i< n ; i++) {
        //     System.out.println(arr[i] + " ");
        // }
        findMinAndMax(arr,n);
    }
}
