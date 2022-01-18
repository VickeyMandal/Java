package Array;

import java.util.*;

public class MaxSumSubArray {


    public static void find(int[] arr, int n) {
        int currSum = -1000000000;
        int sum = -10000000;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if(currSum > sum){
                sum = currSum;
            }

            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        find(arr,n);
    }
    
}
