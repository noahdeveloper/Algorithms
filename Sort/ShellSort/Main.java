
public class Main {

	/*
	 * Noe Pineda 10/20/2018
	 * Explanation:
	 * Shell sort works by determining a 'gap' value,
	 * this gap value is the length of the list split in half.
	 * Starting at the gap and increasing the index location 
	 * by one after every iteration match the current index location
	 * with the index location where current - gap and if this second
	 * index location's value is larger than the current one, then 
	 * swap the two. The same process repeated until the gap becomes
	 * less than or equal to 0.
	 * 
	 * O(n^2)
	 */
	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

		for(int gap = intArray.length / 2; gap > 0; gap /= 2) {
			for(int i = gap; i < intArray.length; i++) {
				int newValue = intArray[i];
				int j = i;
				
				while(j >= gap && intArray[j - gap] > newValue) {
					intArray[j] = intArray[j - gap];
					j -= gap;
				}
				
				intArray[j] = newValue;
			}
		}
		
		for(int i : intArray) {
			System.out.print(i + ", ");
		}

	}
}
