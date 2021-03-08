package introduction;

public class Variables {

	public static void main(String[] args) {
		double firstNumber;
		firstNumber = 1;
		double secondNumber = 5;

		double doubleResult = firstNumber / secondNumber;
		System.out.println(doubleResult);

		int intResult = (int) (firstNumber / secondNumber); // nema implicitne konverzije, moramo eksplicitnu
		System.out.println(intResult);

		boolean alwaysTrue = true;
		boolean secondBoolean = false;
		System.out.println(alwaysTrue && secondBoolean);// logicko i
		System.out.println(alwaysTrue || secondBoolean);// logicko ili
		System.out.println(!alwaysTrue); // negacija

		String name = "Petar";
		String lastName = "Petrovic";
		System.out.println(name + " " + lastName + " Njegos");

		if (firstNumber > 0) {
			System.out.println("Number is positive.");
		} else if (firstNumber < 0) {
			System.out.println("Number is negative.");
		} else {
			System.out.println("Number is equal to zero.");
		}
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
			
		
	}
}
