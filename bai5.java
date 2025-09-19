import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap tuoi tinh den nam 2023: ");
        int tuoi = scanner.nextInt();

        int namSinh = 2023 - tuoi;

        System.out.println("Nam sinh: " + namSinh);
    }
}
