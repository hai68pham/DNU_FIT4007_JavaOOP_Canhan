import java.util.Scanner;

public class CheckSquare13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();

        if (a <= 0 || b <= 0) {
            System.out.println("Độ dài các cạnh phải lớn hơn 0!");
        } else if (a == b) {
            System.out.println("Đây là hình vuông.");
        } else {
            System.out.println("Đây là hình chữ nhật (không phải hình vuông).");
        }

        sc.close();
    }
}
