package queue;
// динамическая очередь
class DynQueue implements ICharQ{
    private char q[];
    private int putloc, getloc;

    public DynQueue(int size){
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch){
        if (putloc == q.length - 1){
            //увеличить размер очереди
            char t[] = new char[q.length * 2];

            // скопировать все элементы в новую очередь
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
        }
        putloc++;
        q[putloc] = ch;
    }

    // извлечь символ из очереди
    public char get(){
        if (getloc == putloc){
            System.out.println(" - очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
