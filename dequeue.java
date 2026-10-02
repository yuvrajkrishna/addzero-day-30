import java.util.Arrays;

public class dequeue {

    static int dequeu[] = new int[5];
    static int front = -1;
    static int rear = 0;

    public static void main(String[] args) {

        insertatfront(10);
        insertatfront(20);
        insertatrear(30);
        insertatrear(40);
        insertatfront(50);

        System.out.println(Arrays.toString(dequeu));

        deleteatfront();
        System.out.println(Arrays.toString(dequeu));

        deleteatrear();
        System.out.println(Arrays.toString(dequeu));
    }

    public static void insertatfront(int val) {

        if (rear == dequeu.length) {
            System.out.println("Deque is full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        for (int i = rear; i > front; i--) {
            dequeu[i] = dequeu[i - 1];
        }

        dequeu[front] = val;
        rear++;
    }

    public static void insertatrear(int val) {

        if (rear == dequeu.length) {
            System.out.println("Deque is full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        dequeu[rear] = val;
        rear++;
    }

    public static void deleteatfront() {

        if (front == -1) {
            System.out.println("Deque is empty");
            return;
        }

        for (int i = 1; i < rear; i++) {
            dequeu[i - 1] = dequeu[i];
        }

        rear--;
        dequeu[rear] = 0;

        if (rear == 0) {
            front = -1;
        }
    }

    public static void deleteatrear() {

        if (front == -1) {
            System.out.println("Deque is empty");
            return;
        }

        rear--;
        dequeu[rear] = 0;

        if (rear == 0) {
            front = -1;
        }
    }
}
