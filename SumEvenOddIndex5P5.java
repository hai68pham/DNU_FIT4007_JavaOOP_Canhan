import java.util.Scanner;

public class SumEvenOddIndex5P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int tong = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && i % 2 != 0) {
                tong += a[i];
            }
        }

        System.out.println("Tổng các phần tử chẵn có chỉ số lẻ là: " + tong);

        sc.close();
    }
}
