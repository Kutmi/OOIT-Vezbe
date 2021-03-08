package introduction;

public class Point {
	
	private int x;
	private int y;
	private boolean selected;
	
	
	public double distance(int x2, int y2) {
		double dx = this.x - x2;
		double dy = this.y - y2;
		double dist = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		return dist;
	}
	public void setX(int x) {
		this.x = x; //ovaj (this) x gore , ce dobiti vrednost proslednjog x
	}
	public int getX() {
		return this.x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return this.y;
	}
	
	public void setSelected(boolean selected) { 
		this.selected = selected; 
	}
	public boolean isSelected() { //pisemo isSelected
		return this.selected;
	}
}
