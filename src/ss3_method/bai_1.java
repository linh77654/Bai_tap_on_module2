package ss3_method;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 4, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên: ");
        int Number = scanner.nextInt();
        int lastIndex = -1;
        for (int i = 0; i < array.length; i++){
            if(array[i]== Number){
                lastIndex = i;
            }
        }
        if (lastIndex != -1) {
            System.out.println("Số " + Number + " xuất hiện cuối cùng ở vị trí: " + lastIndex);
        } else {
            System.out.println("Số " + Number + " không tồn tại trong mảng.");
        }
    }
}
