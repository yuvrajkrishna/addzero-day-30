import java.util.Arrays;

public class repracticecircularqeue{
    static int circularqueue [] = new int [5];
    static int front = -1;
    static int rear = -1;
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        enqueue(60);
        dequeue();
        enqueue(60);
        System.out.println(Arrays.toString(circularqueue));
    }
    public static void enqueue(int num){
        if((rear+1)%circularqueue.length == front){
            System.out.println("Circular Queue is Full");
            return ;
        }
        else if(rear == -1){
            front = rear = 0;
            circularqueue[rear] = num;
        }
        else{
            rear = (rear+1)%circularqueue.length;
            circularqueue[rear] = num;
        }
    }
    public static void dequeue(){
        if(front == -1){
            System.out.println("Circular queue is already empty");
            return;
        }
        else if(front == rear){
            front = rear = -1;
        }
        else {
            front = (front+1)%circularqueue.length;
        }
    }
}