package j14_스태틱;

import lombok.Data;

/*
    static
    공유영역
 */

@Data
public class Product { //클래스를 정의할 때 이미 static 메소드라는 것을 정의하고있다.

    private static int autoIncrement = 20220000; //static변수
    //하지만, 생성을 하지 않아도 static 메소드는 언제든지 접근이 가능하다. (2)

    //여기에서 private을 사용해버리면 다른 곳에서 쓸 수 없기 때문에 getter, setter을 해주어야한다. (1)
    //메모리가 할당 되어야만 사용할 수 있으나
    private int serialNumber;
    private String name;

    public Product(String name) {
        this.serialNumber = ++autoIncrement; //static 변수를 가지고 와서 1씩 증가하게 함
        this.name = name; //생성할때 받아온 것
    }

    public static void print() {
        System.out.println(autoIncrement);
        Product product = new Product("모니터");
        System.out.println(product.getSerialNumber());
        //static 영역에서는 복제가 되지 않는다.
        //메모리에 할당이 되어있어야만 사용이 가능하다.
    }

    //static이 아닌 일반 메소드이기 때문에 호출이 불가능하다.
    //일반 메소드를 사용하기 위해서는 메모리를 할당하거나, static을 사용해주어야한다.
    public int add(int a, int b) {
        return a + b;
    }

//    public static String name;
//
//    public static String getName() {
//        return name;
//    }
//
//    public static void setName(String name) {
//        Product.name = name; //this를 사용할 수 없다.
}
