
public class Main {

	/*
	 * Noe Pineda 10/27/2018
	 * Counting sort works by assuming smallest and largest possible values 
	 * in the list. The elements in the list are inserted into a new
	 * array which represents how many of each of the elements exist
	 * in the original array. The index in which the original elements
	 * are inserted in the new array represent their original value.
	 * This is not a stable algorithm, and not in place.
	 * 
	 * 
	 * O(n)
	 */
	public static void main(String[] args) {
		int[] a = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

		countingSort(a, 1, 10);
		
		for(int i : a) {
			System.out.print(i + ", ");
		}
	}

	public static void countingSort(int[] a, int min, int max) {
		int[] countArray = new int[(max - min) + 1];
		
		for(int i = 0; i < a.length; i++) {
			countArray[a[i] - min]++;
		}
		
		int j = 0;
		for(int i = min; i <= max; i++) {
			while(countArray[i- min] > 0) {
				a[j++] = i;
				countArray[i - min]--;
			}
		}
	}
}
