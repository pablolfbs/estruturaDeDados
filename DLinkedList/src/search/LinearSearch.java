package search;

public class LinearSearch {
	
	public boolean linearSearch(int content, int key) {
		for (int i = 0; i < content; i++) {
			if (content == key) {
				return true;
			} 
		}
		return false;
	}
}
