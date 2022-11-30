package j16_컬렉션.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManagement {
	
	public static void main(String[] args) {
		
		List<Map<String, Object>> userList = new ArrayList<>();
		
		UserRepository userRepository = new UserRepository(userList);
		//종속성 주입
		//만들어 놓은 것을 이 클래스에 연결하겠다.
		
		Map<String, Object> user1 = new HashMap<>();
		user1.put("username", "a1");
		user1.put("password", "1111");
		
		Map<String, Object> user2 = new HashMap<>();
		user2.put("username", "b1");
		user2.put("password", "2222");
		
		Map<String, Object> user3 = new HashMap<>();
		user3.put("username", "c1");
		user3.put("password", "3333");
		
		Map<String, Object> user4 = new HashMap<>();
		user4.put("username", "d1");
		user4.put("password", "4444");
		
		userRepository.register(user1);
		userRepository.register(user2);
		userRepository.register(user3);
		userRepository.register(user4);
		
		System.out.println(userRepository.getUserList());
		
		System.out.println(userRepository.findUserByUsername("b1"));
		//b1의 정보를 가지고 올 수 있다.
		
		System.out.println(userRepository.findUserByUsername("f1"));
		//입력되지 않은 정보이기 때문에 null
		
		userRepository.modifyPasswordByUsername("b1", "1234");
		System.out.println(userRepository.findUserByUsername("b1"));
		
		userRepository.deleteUserByUsername("b1");
		System.out.println(userRepository.getUserList());
	}
}
