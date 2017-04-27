package test;

import java.util.Random;

import search.LinearSearch;

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
		
	}

}
