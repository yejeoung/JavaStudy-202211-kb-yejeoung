package j18_예외;

import java.util.Map;
import java.util.Objects;

import java.util.Map.Entry;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	Map<String, String> errorMap;
	
	public CustomException() {
		super();
	}
	
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(Map<String, String> errorMap) {
		super();
		this.errorMap = errorMap;
	}
	
	public CustomException(String message, Map<String, String> errorMap) {
		super(message);
		this.errorMap = errorMap;
	}
	
	public void printErrorMap() {
		Objects.requireNonNull(errorMap);
		//만약에 errorMap이 null인 경우 예외를 처리해준다.
		
		for(Entry<String, String> entry : errorMap.entrySet()) {
			System.out.println(entry.getKey() + " >>> " + entry.getValue());
		}
		System.out.println();
	}
}
