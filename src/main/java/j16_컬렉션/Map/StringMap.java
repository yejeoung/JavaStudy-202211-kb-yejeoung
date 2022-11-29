package j16_컬렉션.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringMap {
	
	public static void main(String[] args) {
		Map<String, String> language = new HashMap<String, String>();
		
		//Map은 add가 없는 대신 put을 사용한다.
		//Key와 Value로만 형성되어있다.
		//Value 값은 중복으로 들어갈 수 있지만, Key 값은 중복으로 들어갈 수 없다. 
		language.put("java", "자바");
		language.put("html", "에이치티엠엘");
		language.put("css", "씨에스에스");
		language.put("js", "자바스크립트");
		language.put("python", "파이썬");
		language.put("python2", "파이썬?");
		//동일 키 값이 되면 뒤에 입력된 키 값을 덮어써서 출력하게 된다.
		
		System.out.println(language);
		
		//생성
		String s = language.get("java");
		System.out.println(s);
		
		//업데이트
		//set을 사용할 수 없으므로 replace를 사용한다.
		language.replace("java", "자바", "자바3");
		//Key값과 OldValue값이 같아야만 변경이 가능하다.
		System.out.println(language.get("java"));
		
		
		//삭제
		language.remove("python2");
		System.out.println(language);
		
		language.forEach((k, v) -> {
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
		
//		for(Entry<String, String> entry : language.entrySet()) {
//			System.out.println("key: " + entry.getKey());
//			System.out.println("value: " + entry.getValue());
//		}
//		System.out.println();
//		
//		Iterator<String> ir = language.keySet().iterator();
//		
//		while(ir.hasNext()) {
//			String key = ir.next();
//			System.out.println("key: " + key);
//			System.out.println("value: " + language.get(key));
//		}
	}
}
