import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	/*
	 * Noe Pineda 10/27/2018
	 * Bucket sort works by inserting elements of a list
	 * into buckets which are themselves lists. Both the list 
	 * of buckets and the values inside the buckets are sorted.
	 * Bucket sort is not in-place, but it is stable.
	 * 
	 * O(n)
	 */
	public static void main(String[] args) {
		int[] intArray = {54, 46, 83, 66, 95, 92, 43};
		
		bucketSort(intArray);
		
		for(int i : intArray) {
			System.out.print(i + ", ");
		}
	}

	public static void bucketSort(int[] a) {
		List<Integer>[] buckets = new List[10];
		
		for(int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < a.length; i++) {
			buckets[hash(a[i])].add(a[i]);
		}
		
		for(List bucket : buckets) {
			Collections.sort(bucket);
		}
		
		int j = 0;
		for(int i = 0; i < buckets.length; i++) {
			for(int value : buckets[i]) {
				a[j++] = value;
			}
		}
	}
	
	public static int hash(int value) {
		return value / 10;
	}
}
