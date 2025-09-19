import java.util.Scanner;

public class vd6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào một số nguyên N
        System.out.print("Nhập vào một số nguyên: ");
        int n = scanner.nextInt();

        // Lấy chữ số cuối cùng (trị tuyệt đối phòng khi n âm)
        int lastDigit = Math.abs(n % 10);

        // In ra chữ số cuối cùng
        System.out.println("Chữ số cuối cùng là: " + lastDigit);

        scanner.close();
    }
}
