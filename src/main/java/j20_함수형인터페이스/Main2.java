package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main2 {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("임지현");
		names.add("신경수");
		names.add("고희주");
		names.add("문승주");
		
		//람다식 Getter
		Supplier<String> FirstName = () -> names.get(0);
		//Supplier를 통해 어디에서 무엇을 들고올 것인지 알 수 있다.
		System.out.println(FirstName.get());
	}
}
