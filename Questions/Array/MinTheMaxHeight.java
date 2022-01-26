package Questions.Array;

import java.util.*;
import java.util.Scanner;

public class MinTheMaxHeight {


    public static void solve(int[] arr, int k) {
        int ma = -1000000000 , mi = 999999999;
        Arrays.sort(arr);
        int size = arr.length;
        int ans = arr[size-1] - arr[0]; // 15-3    3+3
        int largest = arr[size-1]-k;
        int smallest = arr[0]+k;
        for (int i = 0; i < arr.length-1; i++) {
            mi = Math.min(smallest,arr[i+1]-k);
            ma = Math.max(largest,arr[i]+k);
            if(mi<0){
                continue;
            }
            ans = Math.min(ans,ma-mi);
        }
        System.out.println(ans);
        // if(initialdiff < k ){
        //     System.out.println(initialdiff);
        // } else if((arr[size-1]-k) > (arr[0]+k)){
        //     System.out.println((arr[size-1]-k)-(arr[0]+k));
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]>=k && arr[i+1]){
        //         arr[i] -= k;
        //     }else {
        //         arr[i] +=k;
        //     }
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        //     if(arr[i]<min){
        //         min = arr[i];
        //     }

        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+ " ");
        // }
        // System.out.println(max + " " + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        solve(arr,k);
    }
}
