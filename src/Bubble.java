
public class Bubble {
	
	public static void main(String[] args) {
		int nums[] = {99,-10,100123,18,-978,5623,463,-9};
		
		int a, b, t, size;
		
		size = 8; // количество сортируемых элементов
		System.out.print("исходный массив: ");
		//отобразить исходный массив
		for(int i = 0; i < size; i++){
			System.out.print(" " + nums[i]);
		}
		System.out.println();
		
		//реализовать механизм пузырьковой сортировки
		for(a = 1; a < size; a++){
			for(b = size - 1; b >= a; b--){
				if(nums[b-1] > nums[b]){//если порядок не соблюдается,
					                      //поменять элменты местами
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		}
			System.out.print("отсортированный массив: ");
			//отобразить отсортированный массив
			for(int i = 0; i < size; i++){
				System.out.print(" " + nums[i]);
			}
		}
	}
