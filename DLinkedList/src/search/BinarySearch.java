package search;

public class BinarySearch {
	
	public boolean binarySearch(int[] array, int key) {
		int first = 0;
		int last = array.length - 1;
		
		while (first <= last) {
			int middle = (first + last) / 2;
			if (array[middle] == key) {
				return true;
			}
			if (key < array[middle]) {
				last = middle - 1;
			} else {
				first = middle + 1;
			}
		}		
		return false;
	}

}
