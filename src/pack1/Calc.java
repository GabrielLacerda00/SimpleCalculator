package pack1;

public class Calc extends MathOperationAbs{
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	@Override
	public int multiply(int a, int b) {
		return a * b;
	}
	
	
	public void printAdd(int a, int b) {
		System.out.println(sum(a,b));
	}
	public void printSubtract(int a, int b) {
		System.out.println(subtract(a,b));
	}
	
}
