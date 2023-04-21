package lambda;

class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);
        MyIntNum myNum3 = new MyIntNum(25);

        // Создать ссылку ip на метод isFactor объекта myNum
        IntPredicate ip = myNum::isFactor;

        // Использовать ссылку для вызова метода isFactor()
        // через метод test()
        result = ip.test(3);
        if (result) System.out.println("3 является делителем " + myNum.getNum());

        // Создать ссылку на метод isFactor для объекта myNum2
        // и использовать ее для вызова метода isFactor()
        // через метод test()
        ip = myNum2::isFactor;
        result = ip.test(3);
        if (!result) System.out.println("3 не является делителем " + myNum2.getNum());

        // Упражнение для самопроверки. Глава 14, № 16.
        ip = myNum3::hasCommonFactor;
        result = ip.test(5);
        if (result) System.out.println(myNum3.getNum() + " и 5 имеют хотя бы один" +
                " общий делитель");
        else System.out.println(myNum3.getNum() + " и 5 не имеют общих делителей");

        ip = myNum2::hasCommonFactor;
        result = ip.test(4);
        if (result) System.out.println(myNum2.getNum() + " и 4 имеют хотя бы один" +
                " общий делитель");
        else System.out.println(myNum2.getNum() + " и 4 не имеют общих делителей");
    }
}
