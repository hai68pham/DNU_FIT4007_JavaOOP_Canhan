import java.util.Scanner;

public class CheckDivisorMultiple20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập c: ");
        int c = sc.nextInt();

        if (a % b == 0 && b % c == 0) {
            System.out.println("b vừa là ước của a vừa là bội của c.");
        } else {
            System.out.println("b không đồng thời là ước của a và bội của c.");
        }

        sc.close();
    }
}
