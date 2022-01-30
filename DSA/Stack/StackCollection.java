package Stack;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<5 ; i++){
            st.push(i);
        }
        // while(!st.empty()){
        //     System.out.println(st.pop());
        // }
        System.out.println(st.peek());
    }
}
