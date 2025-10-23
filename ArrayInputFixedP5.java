
import java.util.Scanner;

public class ArrayInputFixedP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("Mảng vừa nhập là:");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
