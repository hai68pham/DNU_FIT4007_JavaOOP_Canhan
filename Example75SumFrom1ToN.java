package part7.methods;

import java.util.Scanner;

public class Example75SumFrom1ToN {

    // Phương thức tính tổng từ 1 đến N
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Hàm main để nhập và gọi phương thức
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int n = sc.nextInt();
        System.out.println("Tổng từ 1 đến " + n + " là: " + sumToN(n));
    }
}