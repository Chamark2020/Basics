package queue;
// исключение указывающее на исчерпание очереди
public class QueueEmptyException extends Exception {
    public String toString(){
        return "\nОчередь пуста.";
    }
}
