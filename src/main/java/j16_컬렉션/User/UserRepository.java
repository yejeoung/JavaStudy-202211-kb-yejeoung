package j16_컬렉션.User;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor

public class UserRepository {

	@Getter
	private List<Map<String, Object>> userList;
	//user 정보들을 담을 수 있는 List
	//생성할때 값을 넣어주기 위해 Getter를 해줌

	//Create
	public void register(Map<String, Object> userMap) {
		System.out.println("[사용자 등록]");
		userList.add(userMap);
	}
	
	//Read
	public Map<String, Object> findUserByUsername(String username) {
		//user의 id를 가지고 그 user를 찾아라.
		Map<String, Object> userMap = null;
		
		for(Map<String, Object> user : userList) {
			//List에서 하나씩 꺼낼 때 마다 Map
			//위에서 List<Map<String, Object>> 라고 선언
			
			String _username = (String)user.get("username");
			//username이 Object로 되어있기 때문에 String으로 다운캐스팅 해주어야 사용이 가능하다.
			
			//변수명 앞에 _(언더바)를 붙일 경우 임시로 쓰겠다라는 의미를 가진다.
			if(_username.equals(username)) {
				userMap = user;
				break; //내가 원하는 user를 찾으면 break
			}
		}
		
		return userMap; //찾지 못하면 null
	}
	
	//패스워드를 찾는 로직
	public void modifyPasswordByUsername(String username, String newPassword) {
		
		Map<String, Object> userMap = findUserByUsername(username);
		//username으로 위에서 찾은 userMap을 가지고 오는 것 
		
		
		if(userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return; //메소드 강제 퇴출
		}
		
		userMap.replace("password", newPassword);
		//기존에 있던 password를 새로운 password로 변경
	}
	
	public void deleteUserByUsername(String username) {
		Map<String, Object> userMap = findUserByUsername(username);
		
		if(userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return; //메소드 강제 퇴출
		}
		
		int userIndex = userList.indexOf(userMap);
		userList.remove(userIndex);
		//해당 유저(주소값)가 위치하고 있는 index
	}
	
}
