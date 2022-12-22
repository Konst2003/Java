import java.util.Scanner;

public class RazmMas {
    public RazmMas() {
    }

    public static void main(String[] args) {
        System.out.print("ведите размер массива меньше или равный 10 ");
        Scanner console = new Scanner(System.in);

        int n;
        for(n = console.nextInt(); n > 10; n = console.nextInt()) {
            System.out.print("Неверное число ");
        }

        int[] a = new int[n];
        int count = 0;

        for(int i = 0; i < n; ++i) {
            a[i] = (int)(Math.random() * (double)(n + 1));
            System.out.println(" " + a[i]);
            if (a[i] % 2 == 0) {
                ++count;
            }
        }

        int[] b = new int[count];
        count = -1;

        int i;
        for(i = 0; i < n; ++i) {
            if (a[i] % 2 == 0) {
                ++count;
                b[count] = a[i];
            }
        }

        for(i = 0; i < b.length; ++i) {
            System.out.print(b[i] + " ");
        }

    }
}