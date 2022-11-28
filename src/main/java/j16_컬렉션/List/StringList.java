package j16_컬렉션.List;

import java.util.ArrayList;

public class StringList {

    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "JSP";
        strArray[2] = "Servlet";


        // 일반 반복
        System.out.println("<<<<< 일반 반복 >>>>>");
        for(int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        System.out.println();

        //foreach
        System.out.println("<<<<< foreach >>>>>");
        for(String str : strArray) {

            System.out.println(str);
        }

        //list foreach
        ArrayList<String> strList = new ArrayList<String>();

        //값 추가(Create) -> add(값), add(index, 값)
        strList.add("Java");
        strList.add("JSP");
        strList.add("Servlet");
        strList.add(1, "C++");
        //1번 자리에 들어가라고 지정해주었기 때문에 나머지 값들은 뒤로 밀려나게 된다.
        strList.add(0, "HTML");

        System.out.println("<<<<< list foreach >>>>>");
        for(String str : strList) {
            System.out.println(str);
        }

        //값 조회(Read) -> get(index)
        System.out.println("<<<<< List 일반 반복 >>>>>");
        for(int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
            //list에서 i번째에 있는 메소드를 가지고 와라
            //set에는 없다.?????
            //컬렉션에는 get 메소드가 없다. (Map에만 있음)
            //키 값이 없는 경우에만 get이 있다.
        }

        //값 수정(Update) -> set(index, 값)
        strList.set(0, "HTML5");

        System.out.println(strList);

        //값 삭제(Delete) -> remove(index);
        String removeData = strList.remove(2);
        System.out.println(removeData);
        System.out.println(strList);
    }
}
