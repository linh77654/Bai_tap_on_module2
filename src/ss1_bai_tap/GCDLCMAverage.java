package ss1_bai_tap;

import java.util.Scanner;

public class GCDLCMAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên thứ nhất: ");
        int number1 = scanner.nextInt();
        System.out.print("Nhập vào số nguyên thứ hai: ");
        int number2 = scanner.nextInt();

        int gcd = gcd(number1, number2);
        int lcm = lcm(number1, number2);

        double average = (gcd + lcm) / 2.0;

        System.out.println("Ước chung lớn nhất của " + number1 + " và " + number2 + " là: " + gcd);
        System.out.println("Bội chung nhỏ nhất của " + number1 + " và " + number2 + " là: " + lcm);
        System.out.println("Trung bình cộng của ƯCLN và BCNN là: " + average);

        scanner.close();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
