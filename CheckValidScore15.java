import java.util.Scanner;

public class CheckValidScore15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm: ");
        double diem = sc.nextDouble();

        if (diem >= 0 && diem <= 10) {
            System.out.println("Điểm hợp lý.");
        } else {
            System.out.println("Điểm không hợp lý.");
        }

        sc.close();
    }
}
