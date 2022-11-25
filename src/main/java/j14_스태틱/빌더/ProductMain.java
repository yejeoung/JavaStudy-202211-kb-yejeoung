package j14_스태틱.빌더;

public class ProductMain {

    public static void main(String[] args) {

        Product product = Product.productBuilder()
                .productCode(20220001)
                .productName("홍길동")
                .price(1)
                .stock(2)
                .build();

        System.out.println(product);
    }
}
