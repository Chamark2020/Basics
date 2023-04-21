package finalize;

public class Finalize {

	public static void main(String[] args) {
		int count;

		FDemo ob = new FDemo(0);
	/*Генерируется большое количество объектов.
	  В какой то моент должна начаться сборка мусора.
	  Примечание: возможно, для того чтоьы активизировать
	  систему сорки мусора, количество генерируесых
	  объектов придется учеличить*/
        for (count = 0; count < 500000; count++) {
            ob.generator(count);
        }
	}
}
