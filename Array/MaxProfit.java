package Array;

import java.util.Scanner;

public class MaxProfit {

    public static void calculate(int[] arr) {
        int minimal = 99999999;
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minimal){
                minimal = arr[i];
            } else if(arr[i] - minimal > profit){
                profit = arr[i] - minimal;
            }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        calculate(arr);
    }
}
