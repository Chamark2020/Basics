package queue;
// кольцевая очередь
public class CircularQueue implements ICharQ{
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size){
        q = new char[size+1];
        putloc = getloc = 0;
    }

    public void put(char ch){
        /* Очередь считается полной, если индекс putloc на единицу
        * меньше индекса getloc или если индекс putloc указывает
        * на конец массива, а индекс getloc - на его начало*/
        if (putloc + 1 == getloc |
                ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - очередь заполнена");
            return;
        }
        putloc++;
        if (putloc == q.length) putloc = 0; // перейти в начало массива
        q[putloc] = ch;
    }

    // извлечь символ из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - очередь пуста");
            return (char) 0;
        }
        getloc++;
        if (getloc == q.length) getloc = 0; // вернуться в начало очереди
        return q[getloc];
    }
}
