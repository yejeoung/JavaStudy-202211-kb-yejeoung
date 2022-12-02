package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main3 {
	
	public static void forEachTest(Consumer<String> consumer, List<String> list) {
		for(String s : list) {
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
		//forEach를 쓰기 위해 Consumer를 사용해준다.
		
		System.out.println();
		
		//위 for문에서 하나씩 나오는 걸 여기에서 받아서
		//하나씩 빠져나가면서 출력한다.
		forEachTest(n -> {System.out.println(n);}, names);
		//n -> {System.out.println(n);} = accept
		//{System.out.println(n);} 오버라이드 하는 곳에서 바로 출력
		//구현과 생성이 이루어진 람다
		
		//forEach는 메소드다.
		//메소드 안에는 값이 들어갈 수 있다.
		// 값 = Consumer 인터페이스로 구현된 객체
		//Consumer로 구현한 객체는 업캐스팅 되어 들어가게된다.
	}
}
