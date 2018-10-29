
public class Main {

	/*
	 * Noe Pineda 10/27/2018
	 * Linear search works by iterating a list 
	 * and comparing all values until the value being
	 * looked for is found.
	 * 
	 * O(n)
	 */
	public static void main(String[] args) {
		int[] a = {20, 35, -15, 7, 7, 55, 1, -22};
		
		System.out.print(linearSearch(a, 55));
	}

	public static int linearSearch(int[] a, int value) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == value)
				return i;
		}
		
		return -1;
	}
}
