package j19_익명클래스;

@FunctionalInterface

//람다를 사용할 경우 FunctionalInterface 어노테이션이 존재해야 한다.

public interface Calculator {

	public int calc(int a, int b); //추상메소드 / 오버라이드 해서 사용해야 한다.
	
	//여러개가 들어와야하는 경우
	//인터페이스를 따로 생성하거나,
	//int자료형이 아닌 여러개를 동시에 받을 수 있는 배열로 지정해야 한다.
	
	public default int a() {
		return 10;
	}
	//default는 오버라이드용이 아니기 때문에
	//사용이 가능하다.
}
