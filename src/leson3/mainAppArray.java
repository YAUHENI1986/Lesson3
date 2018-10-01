package leson3;

public class mainAppArray {
	//
	static void printArray (int[]arr) {
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	static int[] incArrayByOne(int[]arr) {
		for (int i = 0; i<arr.length; i++) {
			arr[i] +=1;
		}
		return arr;
	}
	static int[] incArrayByTwo(int[]arr) {
		int arr2[] = new int [arr.length];
		for (int i = 0; i<arr.length; i++) {
			arr2[i] = arr[i]+2;;
		}
		return arr2;
	}
	
	

	public static void main(String[] args) {
		int[]x = new int[] {1,2,3,4,5};
		printArray(x);
		//incArrayByOne(x);
		//printArray(x);
		int[]arr2 = incArrayByTwo(x);
		printArray(arr2);

	}

}
