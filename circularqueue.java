public class circularqueue {

    static int queue[] = new int[5];

    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        display();
        System.out.println();

        System.out.println("Size: " + size());

        peek();

        System.out.println("\nDequeue:");
        dequeue();

        display();
        System.out.println();

        System.out.println("Size: " + size());

        peek();

        System.out.println("\nEnqueue 60:");
        enqueue(60);

        display();
        System.out.println();

        System.out.println("Size: " + size());

        peek();

        System.out.println("\nIs Empty: " + isEmpty());
    }


    // ENQUEUE
    public static void enqueue(int val) {

        // First element
        if (front == -1) {

            front = rear = 0;
            queue[rear] = val;

        }

        // Queue is full
        else if ((rear + 1) % queue.length == front) {

            System.out.println("Queue is full");
            return;

        }

        // Normal / circular insertion
        else {

            rear = (rear + 1) % queue.length;
            queue[rear] = val;

        }
    }


    // DEQUEUE
    public static void dequeue() {

        // Queue is empty
        if (front == -1) {

            System.out.println("Queue is empty");
            return;

        }

        // Only one element
        else if (front == rear) {

            front = rear = -1;

        }

        // Move front circularly
        else {

            System.out.println("Removed: " + queue[front]);

            front = (front + 1) % queue.length;

        }
    }


    // PEEK
    public static void peek() {

        if (isEmpty()) {

            System.out.println("Queue is empty");
            return;

        }

        System.out.println("Front element: " + queue[front]);
    }


    // IS EMPTY
    public static boolean isEmpty() {

        return front == -1;
    }


    // SIZE
    public static int size() {

        if (isEmpty()) {
            return 0;
        }

        if (front <= rear) {

            return rear - front + 1;

        }

        else {

            return queue.length - front + rear + 1;

        }
    }


    // DISPLAY
    public static void display() {

        if (isEmpty()) {

            System.out.println("Queue is empty");
            return;

        }

        int i = front;

        while (i != rear) {

            System.out.print(queue[i] + " ");

            i = (i + 1) % queue.length;
        }

        System.out.print(queue[i]);
    }
}