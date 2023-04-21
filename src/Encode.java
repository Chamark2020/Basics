import org.w3c.dom.ls.LSOutput;

// Использование поразрядной операции исключающего ИЛИ
// для шифрования и дешифрования сообщений
public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        /*int key = 88;*/
        String key = "abcdefgi";
        int j = 0;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        // Зашифровать сообщение
        for (int i = 0; i < msg.length(); i++) {
            // Построение зашифрованной строки сообщения
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }
        // Зашифрованное сообщение
        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        // Дешифровать сообщение
        for (int i = 0; i < msg.length(); i++) {
            // Построение дешифрованной строки сообщения
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }
        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}
