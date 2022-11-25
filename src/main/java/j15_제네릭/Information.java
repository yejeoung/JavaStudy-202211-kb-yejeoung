package j15_제네릭;

import lombok.Getter;

public class Information<T> { //제네릭일 경우 다운캐스팅을 하지않아도 된다.
    @Getter
    private T target;

    public Information(T target) { //이해를 돕기 위한 생성자 호출
        this.target = target;
    }

    public void printInfo() {
        System.out.println(target);
    }
}
