package ss1_bai_tap;

import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên: ");
        int number = scanner.nextInt();

        int sum = sumOfDivisors(number);
        System.out.println("Tổng các ước số của " + number + " là: " + sum);


        scanner.close();
    }

    public static int sumOfDivisors(int num) {
        int sum = 0;


        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
