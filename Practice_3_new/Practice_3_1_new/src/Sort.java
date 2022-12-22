import java.util.Random;

public class Sort {
    public static void main(String[] args)
    {
        System.out.println("1. Создать массив вещественных чисел случайным образом, вывести его\n" +
                "на экран, отсортировать его, и снова вывести на экран (использовать два подхода\n" +
                "к генерации случайных чисел – метод random() класса Math и класс Random) ");

        double[] a; // объявление массива
        a = new double[100];
        for (int i =0; i<100; i++)
        {
            Random rand = new Random();
            a[i] = rand.nextDouble(100);
        }

        quickSort(a, 0, 99);
        for (int i =0; i<100; i++)
        {
            double x = 11.635;
            System.out.printf("%.3f%n", a[i]);
        }

        for (int i =0; i<100; i++)
        {
            a[i] = Math.random() ;
        }

        System.out.println("способ 2 ");

        quickSort(a, 0, 99);
        for (int i =0; i<100; i++)
        {
            double x = Math.random();
            System.out.printf("%.3f%n", a[i]);
        }
    }
    public static int partition(double[] array, int begin, int end) {
        int pivot = end; // опорный элемент

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                double temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        double temp = array[pivot]; // меняем местами
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public static void quickSort(double[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end); // раскидывание меньшее влево, большее вправо
        quickSort(array, begin, pivot-1); // слева и справа рекурсивно
        quickSort(array, pivot+1, end);
    }



}



