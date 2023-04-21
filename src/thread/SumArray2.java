package thread;
// Использование синхронизированного блока
// для управления доступом к методу sumArray()
class SumArray2 {
    private int sum;

    int sumArray(int nums[]) {
        sum = 0; // обнулить сумму

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Текущее значение суммы для " + Thread.currentThread().getName() +
                    ": " + sum);
            try {
                Thread.sleep(10);  // разрешить переключение задач
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
        return sum;
    }
}
