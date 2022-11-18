package j09_접근지정자.test;

public class Access3 {
    private String address;

    private void printAddress() { //변수가 동일한 것이 없기 때문에 매개변수에 .this가 생략되어있다.
        System.out.println("address : " + this.address);
    }
}
