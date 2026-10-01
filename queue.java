public class queue{
    static int queue[] = new int [5];
    static int front = -1;
    static int rear = -1;
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        dequeue();
        display();
        dequeue();
        display();
        size();
    }
    public static void enqueue(int val){
        if(rear == queue.length-1){
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        queue[rear] = val;
        System.out.println("Added : "+queue[rear]);
    }
    public static void dequeue(){
        if(front==rear){
            System.out.println("Queue is Empty");
            return;
        }
        front++;
        System.out.println("Removed : "+queue[front]);
    }
    public static void peek(){
        if(rear == front){
            System.out.println("queue is empty");
            return;
        }
        System.out.println(queue[front+1]);
    }
    public static boolean isEmpty(){
        if(rear == front){
            return true;
        } 
        return false;
    }
    public static void size(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
       
        System.out.println("The size is : "+(rear-front));
        
    }
    public static void display(){
        for(int i = front+1 ; i <= rear; i++){
            System.out.println(queue[i]);
        }
    }
}