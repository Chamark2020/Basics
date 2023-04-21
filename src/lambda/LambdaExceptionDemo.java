package lambda;

class LambdaExceptionDemo {
    public static void main(String[] args) {
        double[] values = {1.0,2.0,3.0,4.0};

        // Данное блочное лямбда-выражение может генерировать
        // исключение IOException. Следовательно, жто исключение
        // должно быть указано в операторе throws метода
        // ioAction() функцилнального интерфейса MyIOAction
        MyIOAction myIO = rdr -> {
            int ch = rdr.read(); // может генерировать
                                 // исключение IOException
            //...
            return true;
        };
    }
}
