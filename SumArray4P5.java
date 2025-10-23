import java.util.Scanner;

public class SumArray4P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int tong = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
            tong += a[i];
        }

        System.out.println("Tổng của mảng là: " + tong);

        sc.close();
    }
}
