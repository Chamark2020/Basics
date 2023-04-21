// Упражнение 6.3. Простая версия класса Quicksort,
// реализующего быструю сортировку
class Quicksort {
    // Организовать вызов фактического метода быстрой сортировки
    static void qsort(char items[]){
        qs(items, 0, items.length - 1);
    }
    // Рекурсивная версия метода быстрой сортировки символов
    private static void qs(char items[], int left, int right){
        int i, j;
        char x, y;

        i = left;
        j = right;
        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        } while (i <= j);

        if (left < j) qs(items, left, j);
        if (i < right) qs(items, i, right);
    }
}
