import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập b (khác 0): ");
        int b = scanner.nextInt();

        if (b != 0) {
            double result = (double) a / b;
            System.out.printf("%d / %d = %.7f\n", a, b, result);
        } else {
            System.out.println("Lỗi: b phải khác 0.");
        }

        scanner.close();
    }
}
