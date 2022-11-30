package j16_컬렉션.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethod {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("username", "gildong");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("email", "abc123@gmail.com");
		map.put("age", 24);
		map.put("gender", true);
		
		Map<String, String> address = new HashMap<>();
		address.put("address1", "부산광역시");
		address.put("address2", "진구");
		address.put("address3", "중앙대로 668");
		
		map.put("address", address);
		
		//HashMap은 무작위 출력
		//TreeMap은 순서대로 정렬되어 출력
		Map<Integer, String> subject = new TreeMap<>();
		subject.put(100, "java");
		subject.put(200, "C#");
		subject.put(300, "python");
		subject.put(401, "python2");
		subject.put(403, "python3");
		subject.put(502, "python4");
		subject.put(604, "python5");
		
		map.put("subject", subject);
		
		System.out.println(map);

		System.out.println(((Map<Integer, String>)map.get("subject")).get(403));
		//map.get("subject") -> Object로업캐스팅 되어있다.
		//Map<Integer, String> 다운캐스팅
		//(Map<Integer, String>)map.get("subject")
		//이것을 하나로 묶어주어야만 하나의 Map으로 인식을 해준다.
		
		List<String> hobby = new ArrayList<>();
		
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");
		
		map.put("hobby", hobby);
		
		System.out.println(((List<String>)map.get("hobby")).get(2));
		//List<String> 다운캐스팅
		
		Set<Entry<String, Object>> userEntry = map.entrySet();
//		List<Map<String, Object>> listMap = new ArrayList<>();
		//이것과 같다.
		
		System.out.println(map);
		System.out.println(userEntry);
		
		Set<String> names = new HashSet<>();
		names.add("김준일");
		names.add("김준이");
		names.add("김준삼");
		names.add("김준사");
		names.add("김준오");
		
		System.out.println(names);
		
		for(String name : names) {
			System.out.println(name);
		}
		
		for(Entry<String, Object> entry : userEntry) {
			System.out.println(entry);
			//Entry
			//Key와 Value를 하나씩 묶어서 출력한다.
			System.out.println(entry.getKey() + " : " +entry.getValue());
		}
		
		System.out.println();
		
		//key값들만 set으로 변환할 수 있다.
		//Map에서의 key값은 set과 동일하다.
		Set<String> keys = map.keySet();
		//key값이 처음 선언부터 String으로 되어있기 때문에
		//빼낼 때도 String으로 해야한다.
		for(String key : keys) {
			System.out.println(key);
			System.out.println(map.get(key)); //각각의 key값들로 value를 빼올 수 있다.
		}
		System.out.println();
		
		System.out.println(map.values());
		
		for(Object obj : map.values()) {
			System.out.println(obj);
		}
	}
}
