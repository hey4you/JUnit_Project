package ch.bbw.Juinit_Project;

public class Calculator {
	
	public int summe(int summand1, int summand2){
		return summand1 + summand2;
	}
	protected int diff(int diff1, int diff2){
		return diff1 - diff2;
	}
	public int product(int product1, int product2){
		return product1 * product2;
	}
	int quets(int quets1, int quets2){
		return quets1 / quets2;
	}
	public void exceptionDivisonZero(){
		System.out.println("There is a Divison by Zero");
	}
}
