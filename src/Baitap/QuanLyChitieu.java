import java.text.DecimalFormat;
import java.util.Scanner;

public class QuanLyChitieu {

    private static final DecimalFormat df = new DecimalFormat("#,###,##0.00 VNĐ");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tính tiền điện cuối tháng");
            System.out.println("2. Tính tiền taxi cuối tháng");
            System.out.println("3. Tính tiền lương cuối tháng");
            System.out.println("4. Tính tổng thu nhập sau khi chi tiêu cuối tháng");
            System.out.println("5. Thoát chương trình");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Mời Nhập số điện thoạt");
                    String elecSDT = scanner.next();
                    System.out.print("Nhập số điện đã sử dụng (kWh): ");
                    double electricityUsage = scanner.nextDouble();
                    double electricityBill = calculateElectricityBill(electricityUsage);
                    System.out.println("Tiền điện cuối tháng: " + df.format(electricityBill));
                    break;

                case 2:
                    System.out.print("Nhập số km đã đi: ");
                    double kilometers = scanner.nextDouble();
                    double taxiBill = calculateTaxiBill(kilometers);
                    System.out.println("Tiền taxi cuối tháng: " + df.format(taxiBill));
                    break;

                case 3:
                    System.out.print("Nhập tiền lương hằng tháng: ");
                    double grossSalary = scanner.nextDouble();
                    double netSalary = calculateNetSalary(grossSalary);
                    System.out.println("Tiền lương thực nhận sau khi đóng thuế: " + df.format(netSalary));
                    break;

                case 4:

                    System.out.print("Nhập tiền điện cuối tháng: ");
                    double electricityFee = scanner.nextDouble();
                    System.out.print("Nhập tiền taxi cuối tháng: ");
                    double taxiFee = scanner.nextDouble();
                    System.out.print("Nhập tiền lương thực nhận sau khi đóng thuế: ");
                    double netSalaryFee = scanner.nextDouble();

                    double totalIncomeAfterExpenses = calculateTotalIncomeAfterExpenses(netSalaryFee, electricityFee, taxiFee);
                    System.out.println("Tổng thu nhập sau khi chi tiêu cuối tháng: " + df.format(totalIncomeAfterExpenses));
                    break;
                case 5:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("mời bạn nhập lại");
                    break;
            }

        } while (choice >= 1 && choice <= 4);

        scanner.close();
    }

    private static double calculateElectricityBill(double usage) {

        double pricePerKWh = 2500;
        return usage * pricePerKWh;
    }

    private static double calculateTaxiBill(double kilometers) {

        double pricePerKm = 10000;
        return kilometers * pricePerKm;
    }

    private static double calculateNetSalary(double grossSalary) {

        double taxRate = 0.15;
        return grossSalary * (1 - taxRate);
    }

    private static double calculateTotalIncomeAfterExpenses(double netSalary, double electricityFee, double taxiFee) {
        return netSalary - electricityFee - taxiFee;
    }
}
