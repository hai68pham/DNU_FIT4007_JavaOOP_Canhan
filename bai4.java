import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap canh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap canh c: ");
        double c = scanner.nextDouble();

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Chu vi: " + (a + b + c));
        System.out.println("Dien tich (Heron): " + s);
    }
}
