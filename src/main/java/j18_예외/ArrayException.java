package j18_예외;

public class ArrayException {
	public static void main(String[] args) {
		Integer[] numberArray = new Integer[] { 1, 2, 3, 4, 5 };

		try {
			// 예외가 예상되는 부분
			for (int i = 0; i < 6; i++) { // 배열 값 개수는 5개인데 6을 넣으면 에러가 발생
				System.out.println(numberArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			e.printStackTrace();
			// 예외가 가지고 있는 문제점과 위치를 알려준다.
			System.out.println(e.getMessage());
			// 예외 메세지만 가지고 올 수 있다.
			System.out.println("예외가 생성됨");
		}
		// 예외가 예상되는 부분을 try-catch 안에 넣어놓으면
		// try 안에서 예왜 객체가 발견되는 경우
		// catch한테 매개변수로 던져준다.

		// ArrayIndexOutOfBoundsException가 예외 처리문을 가지고 감

		// for문만 돌렸을 경우 에러가 뜨면서 강제 종료 되지만,
		// try-catch문을 돌리면 정상적으로 작동이 된다.

		System.out.println("프로그램 정상 종료");
	}
}
