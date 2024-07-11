package ss3_method;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < length; i++) {
            System.out.println("Phần tử thứ" + (i + 1) + ":");
            array[i] = sc.nextInt();
        }

        int sum = 0;
        int count = 0;
        for (int i = 0; i < length; i += 2) {
            sum += array[i];
            count++;
        }
        if (count != 0){
            double average = (double) sum/count;
            System.out.println("Trung bình công các số nguyên ở vị trí lẻ" + average);
        }else {
            System.out.println("không có số nguyên trong mảng.");
        }
    }
}
