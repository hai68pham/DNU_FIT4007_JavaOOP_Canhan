import java.util.Scanner;

public class ChuSoGanCuoi7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào một số nguyên có ít nhất 2 chữ số
        System.out.print("Nhập vào một số nguyên (ít nhất 2 chữ số): ");
        int n = scanner.nextInt();

        // Đảm bảo n có ít nhất 2 chữ số
        if (Math.abs(n) <= 9) {
            System.out.println("Vui lòng nhập số có ít nhất 2 chữ số!");
        } else {
            // Lấy chữ số gần cuối: loại bỏ chữ số cuối bằng cách chia cho 10, rồi lấy phần dư của 10
            int ganCuoi = Math.abs((n / 10) % 10);

            System.out.println("Chữ số gần cuối là: " + ganCuoi);
        }

        scanner.close();
    }
}
