package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {

		User user = User.builder().username("gildong").password("1234").name("홍길동")
//				.email("abc123@gmail.com")
				.build();

		System.out.println(user);

		Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls() // null인 것을 날려버리지않고 출력 해준다.
				.excludeFieldsWithoutExposeAnnotation()
				// Expose어노테이션 사용할때 입력해주어야한다.
				.create();

		String userJson = gson.toJson(user);
		System.out.println(userJson);

		User userObj = null;
		// Json을 user객체로 바꾸어서 대입

		userObj = gson.fromJson(userJson, User.class);
		// 문자열로 바꾼 것을 담고 있는 userJson을 다시 User 객체로 변경
		System.out.println(userObj);
	}
}