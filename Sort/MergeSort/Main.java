
public class Main {

	/*
	 * Noe Pineda 10/22/2018
	 * Explanation: 
	 * Merge sort works by splitting list into sub-sections,
	 * ordering them and then merging them together.
	 * 
	 * O(nlogn)
	 */
	public static void main(String[] args) {
		int[] a = {20, 35, -15, 7, 55, 1, -22};
		
		mergeSort(a, 0, a.length);

		for(int i : a) {
			System.out.println(i);
		}
	}
	
	public static void mergeSort(int[] a, int start, int end) {
		if(end - start < 2)
			return;
		
		int mid = (start + end) / 2;
		
		mergeSort(a, start, mid);
		mergeSort(a, mid, end);
		
		merge(a, start, mid, end);
	}
	
	public static void merge(int[] a, int start, int mid, int end) {
		if(a[mid - 1] <= a[mid])
			return;
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		int[] temp = new int[end - start];
		
		while(i < mid && j < end) {
			temp[tempIndex++] = a[i] <= a[j] ? a[i++] : a[j++]; 
		}
		
		System.arraycopy(a, i, a, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, a, start, tempIndex);
	}

}
