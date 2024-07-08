package ss1_bai_tap;


import java.util.Scanner;

public class SimpleCalculator {
    public static double calculate(double num1, double num2, int operation) {
        switch (operation) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 != 0) {
                    return num1 / num2;
                } else {

                    System.out.println("Không thể chia cho 0");
                    return Double.NaN;
                }
            default:
                System.out.println("Phép tính không hợp lệ");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();

        System.out.println("Chọn phép tính:");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");

        int operation = scanner.nextInt();

        double result = calculate(num1, num2, operation);
        System.out.println("Kết quả: " + result);

        scanner.close();
    }
}
