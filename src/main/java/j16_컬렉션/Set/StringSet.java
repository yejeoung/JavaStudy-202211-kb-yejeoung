package j16_컬렉션.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {
	
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();
		
		nameSet.add("김준일");
		nameSet.add("김수현");
		nameSet.add("문경원");
		nameSet.add("권용범");
		nameSet.add("이영인");
		
		System.out.println(nameSet);
		
		for(String s : nameSet) {
			if(s.equals("김준일")) {
				System.out.println(s);
				break;
			}
		}
		List<String> nameList = Arrays.asList(new String[] {"김준일", "권용범"});
		
		System.out.println(nameList);
		
		Set<String> listToSet = new HashSet<String>();
		listToSet.addAll(nameList);
		//list를 set으로 옮기고 싶을때 addAll을 사용하면 된다.
		//addAll은 매개변수로 Collection을 상속 받는다.
		//Map에서는 Collection 인터페이스를 상속받지 않기 때문에 addAll을 사용할 수 없다.
		
		System.out.println(listToSet);
		
		nameSet.remove("김준일");
		//remove를 사용해 내가 원하는 값을 삭제할 수 있다.
		//index가 없기 때문에 내가 원하는 값을 직접 지정 해주어야 한다.
		
		System.out.println(nameSet);
		
		/*
		 * 업데이트(Update)
		 * 기존에 있는 값을 바꾸는 것
		 */
		//수정의 개념이 없고 지우고 값을 넣어야한다.(삭제 + 추가가 동시에 일어난다.)
	}
}
