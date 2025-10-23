import java.util.Scanner;

public class CountEvenNumbers9P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int dem = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0)
                dem++;
        }

        System.out.println("Số lượng số chẵn trong mảng là: " + dem);

        sc.close();
    }
}
