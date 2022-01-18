package Array;

import java.util.*;

/**
 * SortColors
 */
public class SortColors {

    public static void solution(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            } else if(nums[i]==1){
                count1++;
            } else {
                count2++;
            }
        }
        
        int n = nums.length;
        int arr[] = new int[n];
        int k = 0;
        while(count0!=0){
            arr[k] = 0;
            k++;
            count0--;
        }
        while(count1!=0){
            arr[k] = 1;
            k++;
            count1--;
        }
        while(count2!=0){
            arr[k] = 2;
            k++;
            count2--;
        }
        System.out.print("[");
        int i;
        for(i=0;i<n-1;i++){
            System.out.print(arr[i]+ ",");
           
        }
         System.out.print(arr[i]+"]");
        //System.out.print(arr);
    }


        
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }
}