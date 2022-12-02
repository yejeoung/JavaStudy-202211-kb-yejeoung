package j18_예외;

public class ThrowsException {

	public static void printArray(int[] numbers) throws Exception {
		//throws Exception
		//메소드에서 예외가 일어날 수 있기 때문에 호출하려면 try catch 해야한다.(강제화)
		for (int i = 0; i < 6; i++) {
			System.out.println(numbers[i]);
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5 };

		try {
			printArray(nums);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}
/*
 * 메소드에 throws Exception을 붙였을 경우
 * printArray(nums); 가 에러가 날 것이다.
 * try-catch로 수정해주거나,
 * main 메소드에 throws Exception을 해주어야 한다.
 * 
 * 에러가 여러개일때
 * NullPointException | ArrayIndexOutOfBoundsException
 * 이런식으로 두 개를 비교해서 맞는 걸로 사용한다.
 */

