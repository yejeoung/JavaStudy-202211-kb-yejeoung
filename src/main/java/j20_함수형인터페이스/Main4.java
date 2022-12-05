package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main4 {

	public static void main(String[] args) {

		Function<Integer, String> fx1 = age -> age + "살";

		System.out.println(fx1.apply(20));
		// fx1에 20이라는 값을 넣어준다.

		// Function 안에 Function이 한 번 더 들어갈 수 있다. (람다 안에 람다)
		// 리턴 자체를 람다로 사용이 가능하다.
		// 매개변수로 함수형 인터페이스가 또 들어올 수 있다.
		Function<Function<Integer, String>, String> fx2 = fx -> fx.apply(20) + "입니다.";
		// <매개변수, 리턴타입>
		// Function : 함수

		System.out.println(fx2.apply(age -> age + "살"));

		BiFunction<Integer, String, Map<Integer, String>> createMap = (number, name) -> {
			// 매개변수 Map<Integer, String> 으로 리턴
			Map<Integer, String> map = new HashMap<>();
			map.put(number, name);
			return map;
		};

		List<Map<Integer, String>> list = new ArrayList<>();

		list.add(createMap.apply(100, "김준일"));
		list.add(createMap.apply(200, "유열림"));
		list.add(createMap.apply(300, "이승아"));
		list.add(createMap.apply(400, "이영인"));
		list.add(createMap.apply(500, "임지현"));

		System.out.println(list);
	}
}
