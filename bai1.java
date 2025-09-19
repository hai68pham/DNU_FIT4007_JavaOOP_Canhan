import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so nguyen b: ");
        int b = scanner.nextInt();

        System.out.println("Tong: " + (a + b));
        System.out.println("Hieu: " + (a - b));
        System.out.println("Tich: " + (a * b));
        System.out.println("Thuong (kieu so thuc): " + ((double) a / b));
    }
}
