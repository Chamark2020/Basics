package Enum;

class EnumDemo3 {
    public static void main(String[] args) {

        // Отобразить скорость самолета
        System.out.println("Типичная скорость самолета: " + Transport2.AIRPLANE.getSpeed()
                            + " миль в час\n");

        // Отобразить все виды транспорта и скорости их движения
        System.out.println("Типичные скорости движения транспортных средств");
        for (Transport2 t: Transport2.values()) {
            System.out.println(t + ": " + t.getSpeed() + " миль в час");
        }
    }
}
