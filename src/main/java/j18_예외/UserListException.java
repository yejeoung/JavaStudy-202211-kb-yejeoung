package j18_예외;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

class User { // 서브 클래스
	// 접근지정자가 없으면 자동으로 default가 된다.
	private String username;
	private String password;
}

public class UserListException {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();

		userList.add(new User("aaa", "1111"));
		userList.add(new User("bbb", "2222"));
		userList.add(new User("ccc", "3333"));
		userList.add(new User("ddd", "4444"));
		userList.add(null);

		int length = userList.size();
		// length를 정상 사이즈, +1을 해주지 않는다면
		// 첫 for문부터 오류가 나므로 예외처리를 한 번더 catch로 잡아주어야한다.

		try {
			for (int i = 0; i < length; i++) {
				System.out.println(userList.get(i));
			}

			for (int i = 0; i < length; i++) {
				System.out.println("username: " + userList.get(i).getUsername());
				System.out.println("password: " + userList.get(i).getPassword());
			}

		} catch (IndexOutOfBoundsException indexOutOfBoundsException) {
			// List에서 예외가 일어나면
			// ArrayIndexOutOfBoundsException가 아닌
			// IndexOutOfBoundsException가 뜬다.
			length -= 1;
			// -1을 해주지 않으면 정상 작동이 되지않는다.
			System.out.println(indexOutOfBoundsException.getMessage());
			try {
				for (int i = 0; i < length; i++) {
					System.out.println("username: " + userList.get(i).getUsername());
					System.out.println("password: " + userList.get(i).getPassword());
				}
			} catch (NullPointerException nullPointerException) {
				System.out.println(nullPointerException.getMessage());
			}
		} catch (NullPointerException nullPointerException) {
			System.out.println(nullPointerException.getMessage());
			// 이 부분을 주석처리 했을 경우
			// 밑에 Exception으로 처리를 해주었기 때문에
			// 어디에서 몇 번째에 오류가 났는지 알 수 있다.

		} catch (Exception e) {
			// 모든 예외는 Exception를 상속 받았다.
			// 모든 예외들을 한꺼번에 처리해준다.

			// 마지막에 넣은 이유는 위에서 처리가 안 됐을 경우 전부 처리를 해준다.
			// 오류를 하나하나 다 고쳐줄 수 없기 때문에 마지막에 꼭 넣어주어야 한다.

			// 해당 파일을 통해 어디에서 어떤 오류가 났는지 알 수 있다.
			// 문제점들을 보고 개발자가 오류수정을 위해 고쳐줄 수 있다.
			e.printStackTrace();
			

		} finally {
			//무조건 마지막에 실행되는 부분
			//예외가 실행됐든 안 됐든 상관x
			System.out.println("무조건 실행");
			
			//예외가 있는 경우 예외를 처리하지 못한 경우에도 무조건 실행이 된다.
			//예외 처리가 되어도 실행한다.
			//자동저장이라고 생각하면 쉽다.
		}
		System.out.println("프로그램 정상 종료");
	}
}

//try 안에서 오류가 나면 그 안에 있는 오류난 것을 한 번 더 다시 빼와서 try 해주어야한다.
