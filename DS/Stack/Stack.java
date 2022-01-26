package DS.Stack;

public class Stack{
    private int data[];
    private int top;
    public Stack(){
        data = new int[10];
        top = 0;
    }
    public Stack(int size){
        data = new int[size];
        top = 0;
    }
    ///////////////////Empty///////////////////
    
    public boolean isEmpty() {
        if(top == 0){
            return true;
        } else {
            return false;
        }
    }

    //////////////////PUSH////////////////////

    public void push(int element) {
        if(top == data.length){
            System.out.println("Stack is Full");
        } else {
            data[top] = element;
            top++;
        }
    }

    //////////////////POP////////////////////

    public void pop() {
        if(top == 0){
            System.out.println("Stack is empty");
        } else {
            peek();
            top--;
        }
    }

    /////////////////PEEK////////////////////

    public void peek(){
        if(top == 0){
            System.out.println("Stack is empty");
        } else {
           System.out.println("Top : " + data[top-1]);
        //    int d = data[top];
        //    return d;
        }
    }

    public void size(){
        System.out.println("Size is : " + top);
    }


}
