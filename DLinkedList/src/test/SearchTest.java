package test;

import java.util.Random;
import search.BinarySearch;
import search.LinearSearch;
import sort.BubbleSort;

public class SearchTest {
	
	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		
		LinearSearch search = new LinearSearch();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println(search.linearSearch(array, 12));
		
		BubbleSort sort = new BubbleSort();
		array = sort.bubbleSort(array);
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		BinarySearch search1 = new BinarySearch();
		System.out.println(search1.binarySearch(array, 12));
		
	}

}
