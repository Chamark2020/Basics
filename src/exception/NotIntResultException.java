package exception;
// Использование специально созданного исключения

// Создать исключение
class NotIntResultException extends Exception {
    int n, d;

    NotIntResultException(int i, int j){
        n = i;
        d = j;
    }

    public String toString(){
        return "Результат операции " + n + " / " + d + " не является целым числом";
    }
}
