import java.util.Scanner;
import java.util.InputMismatchException;

public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // input array queue


    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = data;
            size++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int data = queue[front];
            front = (front + 1) % capacity;
            size--;
            return data;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[front];
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    // print array queue
    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        Queue queue = new Queue(size);
        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Is empty?");
            System.out.println("6. Is full?");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the data: ");
                    int data = scanner.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    System.out.println("Dequeued data: " + queue.dequeue());
                    break;
                case 3:
                    System.out.println("Peeked data: " + queue.peek());
                    break;
                case 4:
                    System.out.println("Size of the queue: " + queue.size());
                    break;
                case 5:
                    System.out.println("Is the queue empty? " + queue.isEmpty());
                    break;
                case 6:
                    System.out.println("Is the queue full? " + queue.isFull());
                    break;
                case 7:
                    System.out.println("Print Queue: ");
                    queue.printQueue();
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");

            }
        }

    }

}
