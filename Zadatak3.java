package introduction;

public class Zadatak3 {

	public static void main(String[] args) {
		//Ispisati FOR petljom neparne brojeve od 1 do 10
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
