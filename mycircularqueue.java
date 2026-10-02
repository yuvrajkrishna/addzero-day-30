import java.util.Arrays;

public class mycircularqueue {

    static int queue[] = new int[5];
    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        System.out.println(Arrays.toString(queue));

        dequeue();
        dequeue();

        enqueue(60);
        enqueue(70);

        System.out.println(Arrays.toString(queue));

        display();
    }

    public static void enqueue(int num) {

        // Queue full
        if ((rear + 1) % queue.length == front) {

            System.out.println("Queue is full");
            return;
        }

        // First element
        if (front == -1) {

            front = 0;
            rear = 0;
            queue[rear] = num;
            return;
        }

        // Move rear circularly
        rear = (rear + 1) % queue.length;

        queue[rear] = num;
    }

    public static void dequeue() {

        // Queue empty
        if (front == -1) {

            System.out.println("Queue is empty");
            return;
        }

        // Only one element
        if (front == rear) {

            front = -1;
            rear = -1;
            return;
        }

        // Move front circularly
        front = (front + 1) % queue.length;
    }

    public static void display() {

        if (front == -1) {

            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (i != rear) {

            System.out.print(queue[i] + " ");

            i = (i + 1) % queue.length;
        }

        System.out.println(queue[i]);
    }
}