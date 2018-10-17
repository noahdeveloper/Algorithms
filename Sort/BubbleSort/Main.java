package BubbleSort;

public class Main {

	/*
	 * Noe Pineda 10/17/2018
	 * Explanation: 
	 * Bubble sort is the simplest sorting algorithm which 
	 * sorts elements in a list by iterating through the list
	 * and swapping each element with the one next it.
	 * O(n^2)
	 */
	public static void main(String[] args) {
		int[] a = {9, -8, 71, -1, 4, 0};
		
		for(int i = a.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
		
		for(int i : a) {
			System.out.print(i + ", ");
		}
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
