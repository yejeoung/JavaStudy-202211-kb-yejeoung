package j15_제네릭;

import lombok.Getter;

public class Information2 {
    @Getter
    private Object target;

    public Information2(Object target) { //생성자의 매개변수가 Object 타입이다.
        this.target = target;
    }

    public void printInfo() {
        System.out.println(target);
    }
}
