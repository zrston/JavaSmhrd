package 쓰레드활용;

public class ThreadMain {

	public static void main(String[] args) {
		
		String[] key = {"Q", "W", "E"};
		
		System.out.println("===단일쓰레드===");
		for(int i=0; i<key.length; i++) {
			Blitz b = new Blitz(key[i]);
			b.run();
		}
		
		System.out.println("===멀티쓰레드=== : Thread 상속 ===");
		for(int i=0; i<key.length; i++) {
			Ahri a = new Ahri(key[i]);
			//run() : 실제 쓰레드가 동작할 코드 (한가지 작업)
			//start() : 쓰레드가 여러개 동시에 동작할 수 있도록 하는 메서드 (Thread)
			//start()는 절대로 오버라이딩 하면 안됨!
			a.start();
		}
		
		System.out.println("===멀티쓰레드 : Runnable 구현===");
		for(int i=0; i<key.length; i++) {
			Thread thread = new Thread(new Ahri2(key[i]));
			thread.start();
		}
	}

}
