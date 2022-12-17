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
            System.out.println("Queue sudah penuh");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = data;
            size++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
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
            System.out.println("Queue kosong");
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
        System.out.print("List Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }



}
