package j19_익명클래스;

public class CalcMain2 {

	public static void main(String[] args) {
		
		
		//생성과 정의 존재
		Calculator c = new Calculator() {
			
			@Override
			public int calc(int a, int b) {
				System.out.println("덧셈");
				return a + b;
			}
			
			// 위에 것을 ↓ 밑에 것으로 축약하여 바꿀 수 있음 
			
		};
		
		//정의만 존재
		Calculator c1 = (int x, int y) -> {
			return x + y;
		};
		//람다는 항상 대입할 수 있는 대상이 있어야 생성이 가능하다.
		//대입과 동시에 생성이 가능하다.
		
		//메소드명과 자료형은 바꾸면 안 된다.
		//자료명만 변경 가능
		
		/*
		 * 람다 특징
		 * 
		 * Calculator에 자료형이 정해져있기 때문에
		 * int x, int y 이런식으로 자료형을 붙이지 않고 생략이 가능하다.
		 * 
		 * [중간에 다른 실행문이 없는 경우]
		 * 
		 * 1. return 생략이 가능하다.
		 * => 화살표 뒤에 있는 x + y가 return이다.
		 * 
		 * 2. 중괄호 생략이 가능하다.
		 * => 중괄호 안에 넣을 경우 return이 없기 때문에 꼭 입력해주어야한다.
		 * 
		 * 람다를 사용하기 위해서는
		 * 인터페이스 안에는 조건이 무조건 딱 하나만 있어야 한다.
		 * (람다는 무조건 항상 함수형 인터페이스여야 한다.)
		 */

		
		int r1 = c1.calc(10, 20);
		System.out.println(r1);
		
		Calculator c2 = new Addition();
		
		int r2 = c2.calc(20, 30);
		System.out.println(r2);
	}
}
