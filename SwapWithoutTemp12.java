import java.util.Scanner;

public class SwapWithoutTemp12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();

        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        // Hoán đổi không dùng biến phụ
        a = a + b;  // a = tổng của a và b
        b = a - b;  // b = giá trị ban đầu của a
        a = a - b;  // a = giá trị ban đầu của b

        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);

        sc.close();
    }
}
