
public class Main {

	/*
	 * Noe Pineda 10/28/2018
	 * Binary search works by splitting a list
	 * into smaller sub-sets of depending on the search 
	 * value and looking on the location in which the value 
	 * would most likely be stored. The list must be in
	 * sorted order for this algorithm to work.
	 * 
	 * O(nlogn)
	 */
	public static void main(String[] args) {
		int[] a = {-22, -15, 1, 7, 20, 35, 55};

		System.out.print(binarySearch(a, -15));
	}

	public static int binarySearch(int[] a, int value) {
		return binarySearch(a, 0, a.length, value);
	}
	
	public static int binarySearch(int[] a, int start, int end, int value) {
		if(start >= end) {
			return -1;
		}
		
		int mid = (start + end) / 2;
		System.out.println("mid = " + mid);
		
		if(a[mid] == value) {
			return mid;
		}
		else if(a[mid] < value) {
			return binarySearch(a, mid + 1, end, value);
		}
		else {
			return binarySearch(a, start, mid, value);
		}
		
	}
}
