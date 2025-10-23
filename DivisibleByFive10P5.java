import java.util.Scanner;

public class DivisibleByFive10P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        boolean tonTai = false;

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Các phần tử chia hết cho 5 là: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 5 == 0) {
                System.out.print(a[i] + " ");
                tonTai = true;
            }
        }

        if (!tonTai)
            System.out.println("Không tồn tại phần tử nào chia hết cho 5.");

        sc.close();
    }
}

