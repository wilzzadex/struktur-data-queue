import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah queue: ");
        int size = scanner.nextInt();
        Queue queue = new Queue(size);
        while (true) {
            System.out.println("1. Masukan queue");
            System.out.println("2. Keluarkan queue");
            System.out.println("3. Data paling depan");
            System.out.println("4. Jumlah data");
            System.out.println("5. Cek kosong ?");
            System.out.println("6. Cek penuh ?");
            System.out.println("7. Print Queue");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan data: ");
                    int data = scanner.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    System.out.println("Keluarkan queue " + queue.dequeue());
                    break;
                case 3:
                    System.out.println("Data paling depan " + queue.peek());
                    break;
                case 4:
                    System.out.println("Size Queue: " + queue.size());
                    break;
                case 5:
                    System.out.println("Apakah queue kosong? " + queue.isEmpty());
                    break;
                case 6:
                    System.out.println("Apakah queue penuh? " + queue.isFull());
                    break;
                case 7:
                    System.out.println("Print Queue: ");
                    queue.printQueue();
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada");

            }
        }

    }
}