package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class Main3 {

	public static void forEachTest(Consumer<String> consumer, List<String> list) {
		for (String s : list) {
			consumer.accept(s);
		}
	}

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("임지현");
		names.add("신경수");
		names.add("고희주");
		names.add("문승주");
		names.add("장건녕");

//		for(String n : names) {
//	 	System.out.println(n);
//		}
		names.forEach(n -> {
			System.out.println(n);
		});
		// forEach를 쓰기 위해 Consumer를 사용해준다.

		System.out.println();

		// 위 for문에서 하나씩 나오는 걸 여기에서 받아서
		// 하나씩 빠져나가면서 출력한다.
		forEachTest(n -> {
			System.out.println(n);
		}, names);
		
		System.out.println("=============");

		Map<String, String> subject = new HashMap<>();

		subject.put("java", "자바");
		subject.put("python", "파이썬");
		subject.put("javascript", "자바스크립트");
		subject.put("C", "씨언어");
		subject.put("Node.js", "노드제이에스");

		Set<String> keySet = subject.keySet(); // keySet => Setter

		keySet.forEach(key -> {
			System.out.println(subject.get(key));
		});
		
		Set<Entry<String, String>> entrySet = subject.entrySet();
		
		entrySet.forEach(entry -> {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		});
		
		//위에 entrySet을 풀어놓으면 이것과 같다.
		subject.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});

	}
}
