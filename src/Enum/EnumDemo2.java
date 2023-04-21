package Enum;

// Использование встроенных методов перечислений

public class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp;

        System.out.println("Константы Transport:");

        // применение метода values()
        Transport allTransports[] = Transport.values();
        for (Transport t: allTransports) System.out.println(t);

        System.out.println();

        // применение метода values() без доп. переменной allTransports[]
        for (Transport t: Transport.values()) System.out.println(t);

        System.out.println();

        // применение метода valueOf()
        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp содержит " + tp);
    }
}
