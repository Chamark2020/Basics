package finalize;

class FDemo {
	int x;
	FDemo (int i){
		x = i;
	}
	
	//вызывается при удалении объекта
	protected void finalize (){
		System.out.println("финализация " + x);
	}
	
	//гнерирует обьект, который тотчас же уничтожается
	void generator(int i){
		FDemo o = new FDemo(i);
	}
}
