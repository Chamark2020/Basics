package Enum;

enum Transport2 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed; // типичная скорость транспортного средства

    // конструктор
    Transport2 (int s) {speed = s;}

    // метод
    int getSpeed() {return speed;}
}
