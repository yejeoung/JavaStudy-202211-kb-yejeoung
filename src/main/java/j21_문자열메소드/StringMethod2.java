package j21_문자열메소드;

public class StringMethod2 {

	public static void main(String[] args) {

		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN";

		String[] roleArray = new String[3];

		String tempRoles = roles;
		//계속 잘라서 넣을 것이기 때문에 그것을 넣을 변수를 지정해줌
		
		roleArray[0] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2);
		//substring(0, tempRoles.indexOf(",")) => ,를 찾아서 그 전까지 잘라낸다.
		//tempRoles.indexOf(",") + 2 => ,앞부분을 잘라내버린다.
		//!= -1 => 인덱스오브를 했을때 -1을 출력한다.
		
		roleArray[1] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2);
		
		roleArray[2] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		
		//코드가 다 일정하기 때문에 반복을 해줄 수 있다.
		
		for(String role : roleArray) {
			System.out.println(role);
		}
		
		System.out.println();
		
		// ", " 이 문자를 기준으로 잘라서 배열을 만들어라
		// 이 하나의 문장으로 한꺼번에 해줄 수는 있지만, 쉼표 뒤에 띄어쓰기가 안 되어 있는 부분이 존재하게 되면
		// 그 부분은 떨어져서 출력되지 않고 붙어서 출력하게 된다.
		String[] roleArray2 = roles.split(", ");
		for(String role : roleArray2) {
			System.out.println(role);
		}
	}
}
