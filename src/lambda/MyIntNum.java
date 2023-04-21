package lambda;

// Данный класс хранит значение типа int и определяет метод
// isFactor(), который возвращает значение true, если его аргумент
// явояется делителем числа, хранящегося в классе
class MyIntNum {
    private int v;

    MyIntNum(int x) {v = x;}
    int getNum() {return v;}

    // Возвращаеть true, если n - делитель v
    boolean isFactor(int n) {
        return (v % n) == 0;
    }

    // № 16
    boolean hasCommonFactor(int n) {
        for (int i = 2; i < n; i++) {
            if ((v % i == 0) &&(n % i == 0)) return true;
        }
        return false;
    }
}
