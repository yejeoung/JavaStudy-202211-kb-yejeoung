package j20_함수형인터페이스;

public class Main1 {

	public static void main(String[] args) {

		int a = 10;

		Runnable appication1 = () -> {
			System.out.println("프로그램을 시작합니다.");
			System.out.println("a: " + a);
			// 매개변수를 쓰지도 않았는데 사용이 가능하다.
			// 매개변수 없을 때 생략 불가(딱 하나일 경우에만 생략 가능)
		};

		appication1.run();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				try {
					System.out.println("채팅기능");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i + " : " + (i + 1));
			}
		});
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				try {
					System.out.println("알림기능");
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i + " : " + (i + 1));
			}
		});


		//비동기처리
		//위에 있는 것들이 다 처리 되기를 기다리는 것이 아니라 바로 실행된다.
		t1.start();
		t2.start();
	}
}
