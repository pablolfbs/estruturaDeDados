package test;

import java.util.Random;

import sort.QuickSort;

public class SortTest {
	
	public static void main(String[] args) {
		
		int[] array = new int[50];
		Random rand = new Random();
		
		for(int i = 0; i < 50; i++) {
			array[i] = rand.nextInt(500);
		}		
		for (int i = 0; i < 50; i++) {
			System.out.print(array[i] + " ");
		}
		QuickSort sort = new QuickSort();
		sort.quickSort(array);
		
		System.out.println();
		
		for (int i = 0; i < 50; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
