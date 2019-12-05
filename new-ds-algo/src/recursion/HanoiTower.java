package recursion;

public class HanoiTower {

	public static void main(String[] args) {
		HanoiTower hanoiTower = new HanoiTower();
		hanoiTower.move(4, 'A', 'C', 'B');
	}
	public void move(int noofDisc, char from, char to, char help) {
		if(noofDisc!=0) {
			move(noofDisc-1, from, help, to);
			System.out.println("moving "+ noofDisc +" from: "+from +" to: "+to);
			move(noofDisc-1, help, to, from);
		}
	}
}
