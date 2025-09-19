import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ban kinh R: ");
        double r = scanner.nextDouble();

        double chuVi = 2 * Math.PI * r;
        double dienTich = Math.PI * r * r;

        System.out.println("Chu vi hinh tron: " + chuVi);
        System.out.println("Dien tich hinh tron: " + dienTich);
    }
}
