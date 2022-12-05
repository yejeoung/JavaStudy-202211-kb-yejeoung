package j20_함수형인터페이스;

import java.util.Arrays;
import java.util.List;

public class StringMethod4 {

	public static void main(String[] args) {

		String roles = "ROLE_USER, ROLE_MANAGER,ROLE_ADMIN, GUEST";

		roles = roles.replaceAll(" ", "");
		// 모든 공백을 제외

		String[] roleArray = roles.split(",");
		// ,를 기준으로 나눈다
		List<String> roleList = Arrays.asList(roleArray);
		// 배열을 List로 변경

		System.out.println(roleList);

		roleList.forEach(role -> {
			// prefix(접두어) => startWith()
			// suffix(접미어) => endWith()
			if (role.startsWith("ROLE_") && role.equalsIgnoreCase("role_user")) { // 문자열이 "ROLE_"로 시작하는지
				// equalsIgnoreCase => 소대문자 구분없이 비교해준다.
				System.out.println("권한: " + role);
			}
		});
	}
}
