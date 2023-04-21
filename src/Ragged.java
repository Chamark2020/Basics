
public class Ragged {
	
	public static void main(String[] args) {
		int riders[][] = new int[7][];
		riders[0] = new int[10];
		riders[1] = new int[10];		
		riders[2] = new int[10];
		riders[3] = new int[10];
		riders[4] = new int[10];
		riders[5] = new int[2];
		riders[6] = new int[2];
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 10; j++){
				riders[i][j] = i+j+10;
			}
		}
		for(int i = 5; i < 7; i++){
			for(int j = 0; j < 2; j++){
				riders[i][j] = i+j+10;
			}
		}
		System.out.println("количество пассажиров, перевезенных каждым рейсом в будние дни");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 10; j++){
				System.out.print(" " + riders[i][j]);
		  }
   	}
		System.out.println();
		System.out.println("количество пассажиров, перевезенных каждым рейсом в выходные дни");
		for(int i = 5; i < 7; i++){
			for(int j = 0; j < 2; j++){
				System.out.print(" " + riders[i][j]);
		  }
   	}
	}
}
