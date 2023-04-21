package inOut;

import java.io.IOException;
import java.io.RandomAccessFile;

// Демонстрация произвольного доступа к файлам
class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = {19.4,10.1,123.54,33.0,87.9,74.25};
        double d;

        // Открыть и использовать файл с произвольным доступом
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            // Записать значения в файл
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }
            // Прочитать отдельные значения из файоа
            raf.seek(0); // найти первое значение типа double
            d = raf.readDouble();
            System.out.println("Первое значение: " + d);

            raf.seek(8); // найти второе значение типа double
            d = raf.readDouble();
            System.out.println("Второе значение: " + d);

            raf.seek(8 * 3); // найти четвертое значение типа double
            d = raf.readDouble();
            System.out.println("Четвертое значение: " + d);

            System.out.println();

            // Прочитать значения через одно
            System.out.println("Чтение значений с нечетными порядковыми номерами: ");
            for (int i = 0; i < data.length ; i+=2) {
                raf.seek(8 * i); // найти i-e значение типа double
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
