// Демонстрация поразрядной операции НЕ
public class NotDemo {
    public static void main(String[] args) {
        byte b = -34;

        for (int i = 128; i > 0 ; i = i/2) {
            if ((b & i) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();

        // Обратить состояние всех битов
        b = (byte) ~b;

        for (int i = 128; i > 0; i = i/2) {
            if ((b & i) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
