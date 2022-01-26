package DS.Queue;


public class QueueAgain {
    private int data[];
    private  int front;
    private int rear;
    private int size;

    QueueAgain(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public void add(int element){
        if(size == data.length){
            System.out.println("Overflow");
            return;
        }
        if(size == 0){
            front = 0;
        }
        rear++;
        size++;
        if(rear == data.length){
            rear = 0;
        }
        data[rear] = element; 
    }

    public int remove(){
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

    public void size(){
        System.out.println("Size : "+ size);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public static void main(String[] args) {
        QueueAgain q = new QueueAgain(3);
        q.add(1);
        q.size();
        q.add(2);
        q.size();
        q.add(3);
        q.size();
      //  q.add(4);
        q.remove();
        q.size();
        q.add(4);
        q.size();

        while(!q.isEmpty()){
           System.out.println(q.remove());
        }

    }
}
