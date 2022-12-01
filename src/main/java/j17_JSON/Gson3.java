package j17_JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Gson3 {

	public static void main(String[] args) {

		JsonObject jsonObject = new JsonObject();

		jsonObject.addProperty("username", "gildong");
		jsonObject.addProperty("password", "1234");

		// 이 자체만으로도 json형태로 들어가기 때문에 tojson을 해 줄 필요가 없다.

		System.out.println(jsonObject);

		JsonArray jsonArray = new JsonArray();
		// JsonElement는 추상클래스로 이루어져있어서 생성이 불가능하다.
		jsonArray.add("java");
		jsonArray.add("python");
		jsonArray.add("javascript");
		jsonArray.add("c#");

		System.out.println(jsonArray);

		jsonObject.add("subject", jsonArray);

		System.out.println(jsonObject);
	}
}
