public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits1 b = new ShowBits1(8);
        ShowBits1 i = new ShowBits1(32);
        ShowBits1 li = new ShowBits1(64);

        System.out.println("123 в двоичном представлении: ");
        b.show(123);

        System.out.println("\n87987 в двоичном представлении: ");
        i.show(87987);

        System.out.println("\n237658768 в двоичном представлении");
        li.show(237658768);

        // Можно также отобразить младшие разряды любого целого числа
        System.out.println("\nМладшие 8 битов числа 87987" +
                " в двочном представлении: ");
        b.show(87987);
    }
}