package ss3_method;

import java.util.Scanner;

//  Method nhận vào 1 chuỗi ( String ) và 1 ký tự (character) bất kỳ . Method trả về số lần xuất hiện của
public class main {
    public static int countCharacter(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.println("Nhập vaào ký tự: ");
        char c = scanner.next().charAt(0);
        System.out.println(c);
        System.out.println("Số lần xuất hiện: "+countCharacter(str, c));
    }
}
