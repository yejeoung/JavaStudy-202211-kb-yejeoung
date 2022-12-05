package j21_문자열메소드;

public class StringMethod {

	public static void main(String[] args) {

		String name = "김준일김수현";

		System.out.println(name.length());

		// 문자의 위치 찾기
		System.out.println(name.indexOf("김"));
		System.out.println(name.indexOf("준"));

		// 문자의 위치 뒤에서부터 찾기
		System.out.println(name.lastIndexOf("김"));

		// 리턴 자료형 char
		char name1 = name.charAt(0);
		// 해당 위치에 있는 문자를 뽑아준다.
		System.out.println(name1);

		char name2 = name.charAt(name.indexOf("준"));
		// 없는 문자를 입력하면 에러가 뜨면서 출력된다.
		System.out.println(name2);

		String subName1 = name.substring(0, 2);
		// 0번 인덱스부터 2번 전 인덱스까지 잘라내서 출력
		// 프로그램에서는 0번부터 2번까지 3개를 출력하는 것이 아닌
		// 2번 전까지로 인식한다.

		// 어디서부터 시작하는지 지정을 해주지 않으면,
		// 지정한 값부터 뒤까지 전부 출력해준다.
		System.out.println(subName1);

		String nameJunil = "김수현";
		System.out.println(name.substring(name.indexOf(nameJunil), name.indexOf(nameJunil) + nameJunil.length()));
		// 원하는 글자 길이만큼 잘라줄 수 있다.

		String file = "C:/String.java";
		String fileName = null;
		String extension = null;

		// 파일명
		fileName = file.substring("C:/".length(), file.lastIndexOf("."));
		// 드라이브 뒤에 전체를 찾고, .전에 있는 문자를 출력
		System.out.println(fileName);

		// 확장자
		extension = file.substring(file.lastIndexOf("."));
		// 뒤에서 부터 찾되 .이 들어간 곳부터 출력
		System.out.println(extension);

	}
}
