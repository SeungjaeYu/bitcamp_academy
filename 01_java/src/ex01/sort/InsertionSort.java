package ex01.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int [] arrays = {5,6,1,2,4,3};
		int tmp = 0;
		
		
		
		for(int i = 0 ; i<arrays.length ; i++) {
//			if(arrays.length -1 == )
			
			if(arrays[i] > arrays[i+1]) {
				tmp = arrays[i];
				arrays[i] = arrays[i+1];
				arrays[i+1] = tmp;
			}
			
			
			
		}
		
		

	}

}
