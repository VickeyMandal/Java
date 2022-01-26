package DS.LinkedList;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(40);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        list.add(2, 30);
        System.out.println();
        //list.set(2,30);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
    }
}
