import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.IntStream.of;
import static java.util.Arrays.binarySearch;
import static java.util.stream.IntStream.range;


public class Main {

	//Noe Pineda 10/24/2018
	/*
	 * Explanation: 
	 * Quick sort works by partitioning a list in 
	 * smaller sub-lists, choosing a pivot value 
	 * inside a sub-list, and swapping all values
	 * smaller that the pivot to the left of the pivot
	 * and all elements larger than the pivot to the 
	 * right of the pivot. Each element in the list
	 * must be the pivot at one point of the iteration.
	 * 
	 * O(nlogn)
	 */
	
	public static void main(String[] args) {
		int[] a = {20, 35, -15, 7, 55, 1, -22};
		
		mergeSort(a, 0, a.length);
		
		for(int i : a) {
			System.out.print(i + ", ");
		}
	}
	
	public static void mergeSort(int[] a, int start, int end) {
		if(end - start < 2)
			return;
		
		int pivot = merge(a, start, end);
		mergeSort(a, start, pivot);
		mergeSort(a, pivot + 1, end);
	}
	
	public static int merge(int[] a, int start, int end) {
		int pivot = a[start];
		int i = start;
		int j = end;
		
		while(i < j) {
			while(i < j && a[--j] >= pivot);
				if(i < j)
					a[i] = a[j];
			
			while(i < j && a[++i] <= pivot);
				if(i < j)
					a[j] = a[i];
		}
		
		a[j] = pivot;
		return j;
	}
}


