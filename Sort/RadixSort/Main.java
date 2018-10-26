
public class Main {

	/*
	 * Noe Pineda 10/25/2018
	 * Radix sort works by making assumptions about the 
	 * list elements which allow for a linear time complexity.
	 * The assumptions made about the list are a 'radix' value
	 * which represent the base of the elements being sorted. i.e.
	 * if all elements contain integers 0 through 9, then the radix
	 * is 10. The width of the largest element is also assumed. The 
	 * list is sorted at each digit's position starting from the 1's 
	 * position and sorting the next digit after each iteration on a single 
	 * digit. It is crucial for the sorting to be stable for radix
	 * sort to work.
	 * 
	 * O(n)
	 */
	public static void main(String[] args) {
		int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
		
		radixSort(radixArray, 10, 4);
		
		for(int i : radixArray) {
			System.out.print(i + ", ");
		}
	}
	
	public static void radixSort(int[] input, int radix, int width) {
		for(int i = 0; i < width; i++) {
			radixSingleSort(input, radix, i);
		}
	}

	//Sorts list on a based on the position provided.
	public static void radixSingleSort(int[] input, int radix, int position) {
		int numItems = input.length;
		
		int[] countArray = new int[radix];
		
		for(int item : input) {
			countArray[getDigit(position, item, radix)]++;
		}
		
		//add up array values 
		for(int j = 1; j < radix; j++) {
			countArray[j] += countArray[j - 1];
		}
		
		int[] temp = new int[numItems];
		for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
			int digit = getDigit(position, input[tempIndex], radix);
			
			int countArrayVal = --countArray[digit];
			
			temp[countArrayVal] = input[tempIndex];
		}
		
		for(int tempIndex = 0; tempIndex < numItems; tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
	}
	
	public static int getDigit(int position, int value, int radix) {
		int digit = (value / (int)Math.pow(radix, position)) % radix;
		return digit;
	}
}
