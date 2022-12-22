import java.util.Scanner;
import java.lang.Math;

public class Main {
//Количество элементов, равных максимуму
    public static int maxCount(int max, int count) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number == 0) return count;
        else if (number == max) return maxCount(max, ++count);
        else if (number > max) return maxCount(number,1);
        else return maxCount(max, count);
    }
//Треугольная последовательность
    public static String printTrSeq(int n) {
        if (n == 1) return "1";
        else {
            int summ = 0;
            int number = 0;
            for (int i = 1; summ < n; i++) {
                summ += i;
                number = i;
            }
            return printTrSeq(--n) + ", " + number;
        }
    }
//Максимум последовательности
    public static int maxNumber() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number == 0) return 0;
        else return Math.max(number, maxNumber());
    }

      public static void main(String[] args) {
        System.out.println(maxCount(0, 0));
        System.out.println(maxNumber());
        System.out.println(printTrSeq(28));
    }
}