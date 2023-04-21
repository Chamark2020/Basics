package inOut;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Копирование текстового файла с заменой пробелов дефисами.
        В этой версии программы используются символьные потоки.
        Для того чтобы воспользоваться этой программой, укажите
        в командной строке имена исходного и целевого файлов. Например:
        java CopyTxt1 source target
        Для компиляции этого кода требуется JDK 7
        или более поздняя версия данного комплекта.*/
public class CopyTxt1 {
    public static void main(String[] args) {
        int i;

        // Сначала проверим наличие двух передаваемых аргументов
        if (args.length != 2) {
            System.out.println("Использование: CopyTxt1 source target");
            return;
        }
        try (FileReader fin = new FileReader(args[0]);
             FileWriter fout = new FileWriter(args[1])) {
            do {
                i = fin.read();

                if ((char) i == ' ') i = '-';
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода вывода: " + exc);
        }
    }
}
