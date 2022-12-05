package j20_함수형인터페이스;

import java.util.function.Function;

public class StringMethod3 {

	public static void main(String[] args) {

		Function<String, String> replacePhoneToken = phoneNumber -> 
		phoneNumber.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
		//.만 치게 되면 참조변수로 인식하기 때문에 대괄호 안에 .을 넣어주어야 문자 .으로 인식을 해준다.

		
		String phone1 = "010-1234/5678";
		String phone2 = "010-1234/5678";
		String phone3 = "010-1234/5678";
		String phone4 = "010-1234 5678";
		
//		phone1.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
//		phone2.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
//		phone3.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
//		phone4.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
		//이렇게 하나하나 치는 것보다 하나의 변수 안에 묶어서 써주는 것이 효율적이
		
		//위에서 지정한 문자들을 전부 공백으로 바꾸어라
		System.out.println(replacePhoneToken.apply(phone1));
		System.out.println(replacePhoneToken.apply(phone2));
		System.out.println(replacePhoneToken.apply(phone3));
		System.out.println(replacePhoneToken.apply(phone4));

	}
}
