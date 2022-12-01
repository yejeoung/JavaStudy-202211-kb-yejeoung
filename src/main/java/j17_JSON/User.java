package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

/*
 * serialize (Object -> Json) deserialize (Json -> Object)
 */

public class User {
	@Expose(serialize = false, deserialize = true)
	private String username;
	@Expose(serialize = false, deserialize = false) // serialize객체가 gson 문자열로 변환될때
	private String password;
	@Expose(serialize = true, deserialize = false) // deserialize객체가 Object로 변환될때
	private String name;
	@Expose(serialize = true, deserialize = true)
	private String email;

	// Expose를 사용하고 싶을 때 모든 필드에 적용을 시켜주어야 한다.
	// 기본값이 true로 자동 생성 되지 않는다.
}
