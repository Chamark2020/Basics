package gen;

class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обобщения");

        // Отобразить типы
        tgObj.showTypes();

        // Получить и отобразить значения
        int v = tgObj.getob1();
        System.out.println("Значение: " + v);

        String str = tgObj.getob2();
        System.out.println("Значение: " + str);
    }
}
