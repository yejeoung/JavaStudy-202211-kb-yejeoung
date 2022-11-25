package j14_스태틱;

import j07_메소드.Method1;

public class ProductMain {

    public static void show() { //static을 제외하고 입력을 하게 되면 호출할 것을 따로 생성해주어야 동작이 된다.
        //그렇지 않으면 사용이 불가능하다.
        System.out.println("메인메소드에서 호출");
    }

    public static void main(String[] args) {

        Product product1 = new Product("아이폰14");
        Product product2 = new Product("아이폰14_Mini");
        //메모리 할당을 해서 생성을 하게 되면 생성자 안에서만 동작한다.

        System.out.println(product1);
        System.out.println(product2);

        product1.print();
        product2.print();
        Product.print(); //메모리 할당 필요없이 접근이 가능하다.

        show();

        Method1.main(new String[] {});
        //static을 사용한 것은 어디에서든 접근이 가능하다.

//        Product.name = "name"; //변수를 생성하지 않고 사용 가능
//
//        System.out.println(Product.name);
//
//        Product.setName("홍길동");
//
//        System.out.println(Product.getName());

        // 생성을 하지않아도 변수에 메모리 할당을 하고 있다.
        // 클래스를 static로 정의 할 때부터
        // 클래스의 존재 자체가 메모리 할당
    }
}
