
import java.io.IOException;

public class DotMeet {
    public static void main(String[] args) throws IOException {
        char enter, symbols;
        int spaceCounter = 0;

        System.out.println("Вводите символы. Введите символ \".\" , чтобы выйти из программы");

        for (;;){
            enter = (char) System.in.read();
            if (enter == '.') break;
            if (enter == ' ') spaceCounter++;

        }
        System.out.println("Количество пробелов = " + spaceCounter);

    }
}
