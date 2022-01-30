package LinkedList;

import java.util.Scanner;

public class LinkedListUse {

    //Take Input
    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = null;
        int data = sc.nextInt();
        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
            } else {
                Node<Integer> temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = sc.nextInt();
        }

        return head;

    }

    //Delete ith Node
    public static Node<Integer> deleteIthNode(Node<Integer> head, int n){

        int count = 1;
        Node<Integer> temp = head;
        if(count == n){
            temp = temp.next;
            return temp;
        }
        while(count != n-1){
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;

        return head;
    }

    
    //Print list
    public static void print(Node<Integer> head) {
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    //Delete ith from last
    public static Node<Integer> deleteFromLast(Node<Integer> head, int n) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        for (int i = 0; i < n+1; i++) {
            fast = fast.next;
        }
        while(fast!=null ){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }


    //midle point of linklist
    public static void findMiddle(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }


    //reverse a linkedlist
    public static Node<Integer> reverse(Node<Integer> head) {
        Node<Integer> prev = null;
        Node<Integer> curr = head;
        Node<Integer> next = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
        // head = deleteIthNode(head, 1);
        // print(head);
        // head = deleteFromLast(head, 4);
        // print(head);
        //findMiddle(head);
        head = reverse(head);
        print(head);
    }
}
