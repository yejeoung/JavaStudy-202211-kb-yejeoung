package j13_Object;

public class EntityMain {

    public static void main(String[] args) {
        Entity entity = new Entity("홍길동", 24, "부산 진구 부전동");
        Entity entity2 = new Entity("홍길동", 24, "부산 진구 부전동");

        System.out.println(entity);

        System.out.println(entity.equals(entity2));
        System.out.println(entity.hashCode());
        System.out.println(entity2.hashCode());

        System.out.println(entity.getAddress());

        System.out.println(Entity.class);
        Class c = Entity.class;

        Object obj  = new Student(20220001, "홍길동");

        System.out.println(Entity.class == entity.getClass());
        System.out.println(Entity.class.equals(obj.getClass())); //Student는 Entity로 만들어진 것이 아니다.
        System.out.println(obj instanceof Entity);
    }
}
