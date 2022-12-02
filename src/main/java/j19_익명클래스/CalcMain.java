package j19_익명클래스;

/*
 * 익명 클래스
 * 이름이 없는 클래스
 */

public class CalcMain {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator() {
			//인터페이스는 생성할 수 없으나, 오버라이드를 사용하면 가능하다.
			
			//클래스가 없으므로 이 구간만 오버라이드를 임시로 만들어 사용
			@Override
			public int calc(int a, int b) {
				
				System.out.println("덧셈");
				return a + b;
			}
		};
		
		int r1 = c1.calc(10, 20);
		System.out.println(r1);
		
		
		//클래스를 만들어 사용
		Calculator c2 = new Addition();
		
		int r2 = c2.calc(20, 30);
		System.out.println(r2);
		
		
		CalculatorSub cs = (x) -> x * x;
		
		System.out.println(cs.calc(10));
		System.out.println(cs.a());
	}
}

/*
 * 클래스가 없는 것은 한 변수에 생성자를 넣어서 사용이 계속 가능하나
 * 한 클래스 내에서만 계속 호출이 가능한 것이지
 * 다른 클래스에서는 호출이 불가능하다
 * 다른 클래스에서 호출을 하고 싶을 경우 새로운 생성자를 오버라이드 하여 사용해야한다.
 * 
 * 클래스가 있는 것은 계속 불러들여서 그냥 사용이 가능하다.
 */