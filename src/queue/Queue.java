package queue;

public class Queue {
  private char q[];//массив для хранения элементов очереди
  private int putloc, getloc; //индексы для вставки и извлечения элементов очереди

	// Сконструировать пустую очередь заданного размера
	Queue(int size){
		q = new char [size + 1];//выделить память для очереди
		putloc = getloc = 0;
	}

	// Сконструировать очередь на основе имеющегося объекта Queue
	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];

		// Копировать элементы очереди
		for (int i = getloc + 1; i <= putloc; i++)
			q[i] = ob.q[i];
	}

	// Сконструировать очередь на основе массива исходных значений
	Queue(char a[]) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length+1];
		for(int i = 0; i < a.length; i++) put(a[i]);
	}

	//поместить символ в очередь
	void put(char ch){
		if(putloc == q.length - 1){
			System.out.println(" - очередь заполнена");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}

	//извлечь символ изочереди
	char get(){
		if(getloc == putloc){
			System.out.println(" - очередь пуста");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}
