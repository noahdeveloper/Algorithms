
public class Main {

	/*
	 * Noe Pineda 10/17/2018
	 * Explanation: 
	 * Selection sort works by selecting the largest element in 
	 * a list and swapping it with the last element in that list.
	 * The list is split into two partitions sorted and unsorted.
	 * These partitions coexist within the same list, the sorted 
	 * partition grows from end to front and the unsorted grows from
	 * front to end. After each list iteration and swapping of 
	 * elements both partitions grow in size. 
	 * 
	 * O(n^2)
	 */
	public static void main(String[] args) {
	  int[] a = {20, 35, -15, 7, 55, 1, -22};
	  
	  for(int lastUnsorted = a.length - 1; lastUnsorted > 0; lastUnsorted--) {
		  int largest = 0;
		  
		  for(int j = 1; j <= lastUnsorted; j++) {
			  if(a[j] > a[largest]) {
				  largest = j;
			  }
		  }
		  
		  swap(a, largest, lastUnsorted);
	  }
	  
	  for(int i : a) {
		  System.out.print(i + ", ");
	  }
	}
	
	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
