
public class MinMax {
	
	public static void main(String[] args) {
		int min, max;
		
		int nums[] = {99,-10,100123,18,-978,5623,463,-9};
		
		/*int nums[] = new int[8];
		nums[0] = 99;
		nums[1] = -10;		
		nums[2] = 100123;		
		nums[3] = 18;
		nums[4] = -978;
		nums[5] = 5623;
		nums[6] = 463;
		nums[7] = -9;*/
		
		min = max = nums[0];
		/*for(int i = 1; i < 8; i++){
			if(nums[i] < min) min = nums[i];
			if(nums[i] > max) max = nums[i];
		}*/
		for (int x : nums){
			if (x < min) min = x;
			if (x > max) max = x;
		}

		System.out.println("min = " + min + "\nmax = " + max);
	}
	
}
