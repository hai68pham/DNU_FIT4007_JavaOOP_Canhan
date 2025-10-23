import java.util.Scanner;

public class SwapWithTemp11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        System.out.println("Trước hoán đổi: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sau hoán đổi: a = " + a + ", b = " + b);
        sc.close();
    }
}
