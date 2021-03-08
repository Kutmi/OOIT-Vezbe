package introduction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		//Ne mozemo pristupiti x zato sto je privatna promenljiva
		//System.out.println(p.x);
		//Isto tako posto je metoda instance (nema static), mora biti pozvana nad objektom
		//Znaci ne mozemo napisati Point.getX();
		System.out.println(p.getX() + " " + p.getY() + " " + p.isSelected());
		
		p.setX(10);
		p.setY(10);
		p.setSelected(true);
		
		System.out.println(p.getX() + " " + p.getY() + " " + p.isSelected());
		
		System.out.println(p.distance(40, 50));
	}

}
