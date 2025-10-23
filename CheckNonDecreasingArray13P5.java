import java.util.Scanner;

public class CheckNonDecreasingArray13P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        boolean khongGiam = true;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                khongGiam = false;
                break;
            }
        }

        if (khongGiam)
            System.out.println("Mảng là mảng không giảm.");
        else
            System.out.println("Mảng không phải là mảng không giảm.");

        sc.close();
    }
}
