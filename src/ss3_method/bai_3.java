package ss3_method;

public class bai_3 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double average = calculateAverageOfEvenNumbers(array);
        if (average != -1) {
            System.out.println("Trung bình cộng các số chẵn trong mảng là: " + average);
        } else {
            System.out.println("Không có số chẵn trong mảng.");
        }
    }

    public static double calculateAverageOfEvenNumbers(int[][] array) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    sum += array[i][j];
                    count++;
                }
            }
        }

        if (count == 0) {
            return -1;
        }

        return (double) sum / count;
    }
}
