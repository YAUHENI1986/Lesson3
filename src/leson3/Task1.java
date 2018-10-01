package leson3;

public class Task1 {
	static void print (int x) {
		System.out.println(x);		
	}
	static void print (double x) {
		System.out.println(x);		
	}
	
	static void summaID (int []x) {
		int n = 0;
		for (int i = 0; i<x.length; i++) {
			n++;
		}
		print(n);
	}
	static void summaID (double []x) {
		int n = 0;
		for (int i = 0; i<x.length; i++) {
			n++;
		}
		print(n);
	}
	static void delByMax (int []x) {
		for (int i = 0; i<x.length; i++) {
			x[i]/=maxArray(x);
		}
	}
	static int maxArray (int[]x) {
		int max = 0;
		for (int i = 0; i<x.length; i++) {
			if (x[i]>max) {
				max = x[i];
			}
		}
		return max;
	}
	static void delByMin (double []x) {
		for (int i = 0; i<x.length; i++) {
			x[i]/=minArray(x);
		}
	}
	static double minArray (double[]x) {
		double max = 0;
		for (int i = 0; i<x.length; i++) {
			if (x[i]>max) {
				max = x[i];
			}
		}
		return max;
	}
	static void changeMaxMin (int []x, double []y) {
		
	}

	public static void main(String[] args) {
		int [] a = new int[] {1,2,3,4,5};
		double [] b = new double[] {6,7,8,9,10,11};
		summaID(a);
		summaID(b);
	}

}
