import java.util.Scanner;

public class Main {
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
                    System.out.println("Size of the queue: ");
                    break;
                case 5:
                    System.out.println("Is the queue empty? " + queue.isEmpty());
                    break;
                case 6:
                    System.out.println("Print queue \n");
                    queue.printQueue();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");

            }
        }

    }
}