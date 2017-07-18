package hanoi;

public class test {
	
	public static void main(String[] args) {
		
//		RecursiveHanoiTower hanoi = new RecursiveHanoiTower();
//		hanoi.executeHanoi(3, 1, 3, 2);
		
		new InterativeHanoiTower().executeHanoi(5, 1, 3, 2);
		
	}

}
