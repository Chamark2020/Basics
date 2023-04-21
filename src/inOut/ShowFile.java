package inOut;
/* Отображение текстового файла.
*
* При вызове этой программы следует указать имя файла,
* сожержимое которого требуется просмотреть.
* Например, для вывода на экран содержимого файла TEST.TXT
* необходимо ввести в командной строке следующую команду:
* java ShowFile TEST.TXT*/

import java.io.*;
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // Прежде всего необходимо убедиться в том, что программе
        // передается имя файла
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // открытие файла, чтение из него сиволов, пока
        // не встретится признак окнца файла EOF, и
        // последующее закрытие файла в блоке finally
        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        }catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        } finally {
            // файл закрывается в люблм случае
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}
