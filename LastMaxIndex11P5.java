import java.util.Scanner;

public class LastMaxIndex11P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }

        int viTri = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == max)
                viTri = i;
        }

        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Chỉ số cuối cùng của phần tử lớn nhất là: " + viTri);

        sc.close();
    }
}
