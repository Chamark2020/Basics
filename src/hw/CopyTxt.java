package hw;
/* Копирование текстового файла с заменой пробелов дефисами.
В этой версии программы используются байтовые потоки.
Для того чтобы воспользоваться этой программой, укажите
в командной строке имена исходного и целевого файлов. Например:
java CopyTxt source target
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// первая проба пера
public class CopyTxt {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2) {
            System.out.println("Использование: CopyTxt название1 название2");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                // Преобразовать пробел в дефис
                if ((char) i == ' ') i = '-';
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода вывода");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии входного файла");
            }

            try {
                if (fin != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Ошибка закрытия выходного файла");
            }
        }
    }


}
