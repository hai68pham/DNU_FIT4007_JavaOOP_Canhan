import java.util.Scanner;

public class ReverseArray3P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Mảng theo thứ tự ngược là:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
