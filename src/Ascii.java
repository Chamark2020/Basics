package com.company;
import java.io.IOException;

public class Ascii {
    public static void main(String[] args) throws IOException {
        char stroch, propis, enter;
        int count = 0;

        System.out.println("Введите символ. Выход из программы символ точки.");
        do {
            enter = (char) System.in.read();
            if (enter >= 'a' & enter <= 'z'){
                propis = (char) (enter - 32);
                System.out.print(propis);
                count++;
            } else if (enter >= 'A' & enter <= 'Z') {
                stroch = (char) (enter + 32);
                System.out.print(stroch);
                count++;
            } else{
                System.out.print(enter);
            }
        }while (enter != '.');
        System.out.println("\nКоличество измененных букв: " + count);
        System.out.println("Программа завершена");
    }
}
