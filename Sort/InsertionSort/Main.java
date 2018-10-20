
public class Main {

	/*
	 * Noe Pineda 10/18/2018
	 * Explanation: 
	 * Insertion sort works by partitioning the list 
	 * into two coexisting sections sorted and unsorted.
	 * The first element in the unsorted partition is 
	 * inserted in the sorted partition in its proper location
	 * since sorted partition must be in ascending order.
	 * O(n^2)
	 */
	public static void main(String[] args) {
		int[] a = {6, -7, 0, 2, 1, 5};
		
		for(int lastUnsorted = 1; lastUnsorted < a.length; lastUnsorted++) {
			int value = a[lastUnsorted];
			int j = lastUnsorted;
			
			while(j > 0 && a[j - 1] > lastUnsorted) {
				a[j] = a[j - 1];
				j--;
			}
			
			a[j] = value;
		}
		
		for(int i : a) {
			System.out.print(i + ", ");
		}
	}
}
