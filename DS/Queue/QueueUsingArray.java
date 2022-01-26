package DS.Queue;

public class QueueUsingArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray() {
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public int front() {
        if (isEmpty()) {
            return -1;
        } else {
            return data[front];
        }
    }

    // public int rear(){
    // if(!isEmpty()){
    // return -1;
    // } else {
    // return data[front];
    // }
    // }

    public void enqueue(int element) {

        if(size == data.length){
            System.out.println("Overflow");
            return;
        }
        if (size == 0) {
            front = 0;
        }
        rear++;
        size++;
        //circular
        //rear = (rear+1)%data.length;
        if(rear == data.length){
            rear = 0;
        }
        data[rear] = element;
    }

    public int dequeue() {
        if(size == 0){
            System.out.println("Underflow");
            return -1;
        }
        int temp = data[front];
        front++;
        size--;
        if(front == data.length){
            front = 0;
        }
        
        if(size == 0){
            front = -1;
            rear = -1;
        }
        return temp;
    }

    public static void main(String[] args) {
            QueueUsingArray q = new QueueUsingArray(3);
            // for(int i = 1; i <= 5 ; i++){
            //     q.enqueue(i);
            // }
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.dequeue();
            //System.out.println(q.size());
            q.enqueue(4);
          // q.size();
            while(!q.isEmpty()){
                System.out.println(q.dequeue());
            }
    }

}
