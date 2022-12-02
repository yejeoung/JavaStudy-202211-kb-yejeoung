package j19_익명클래스;

@FunctionalInterface

public interface CalculatorSub {
	
	public int calc(int a);
	
	public default int a() {
		return 10;
	}
}
