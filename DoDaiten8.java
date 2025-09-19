import java.util.Scanner;

public class DoDaiten8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên từ người dùng
        System.out.print("Nhập vào tên của bạn: ");
        String ten = scanner.nextLine();

        // Tính độ dài tên
        int doDai = ten.length();

        // In ra độ dài
        System.out.println("Độ dài tên của bạn là: " + doDai);

        scanner.close();
    }
}
