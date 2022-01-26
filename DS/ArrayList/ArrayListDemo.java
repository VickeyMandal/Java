package DS.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ArrayListDemo
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        System.out.println(list1.size());
        // while(sc.hasNextInt()){
        //     int i = sc.nextInt();
        //     list1.add(i);
        // }
        for (Integer elem : list1) {
            System.out.print(elem + " ");
        }

        System.out.println(list1.contains(2));
        list1.removeIf(k -> ((k%2)==0));
        
        for (Integer elem : list1) {
            System.out.print(elem + " ");
        }
    }
    
}