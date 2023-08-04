package com.mystudy.thread01;

// 쓰레드로 동작하는 클래스 만들기
// Thread 클래스를 상속확장(extends)해서 만들기
class MyThread extends Thread {
	int count = 10;
	
	public MyThread() {}
	
	public MyThread(int count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		// Thread 클래스의 run() 메소드를 오버라이딩(overriding) 해서 
		// 쓰레드로 하려는 작업을 작성
		System.out.println(this.getId() + ":" + this.getName() + " - run() 시작 ~~");
		
		for (int i = 0; i < count; i++) {
			System.out.println("> " + this.getName() + " : " + i);
			try {
				Thread.sleep(500); //0.5초 동안 멈추기
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		System.out.println(this.getId() + ":" + this.getName() + " - run() 끝 ~~");
	}
}


public class ThreadExtendsExam {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("---- main() 시작 ----");
		Thread mainThread = Thread.currentThread(); 
		//현재 동작하고 있는 쓰레드를 리턴받을 수 있음
		System.out.println("main 쓰레드 : " + mainThread);
		// Thread[main,5,main]
		
		MyThread th1 = new MyThread();
		th1.setName("MyThread-1");
		th1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("th1 : " + th1);
		
		//th1.run(); //단순 메소드 호출 - 쓰레드로 동작하지 않음
		
		th1.start(); //쓰레드로 동작시키려면 start() 메소드 호출해서 실행해야한다
		//-----------------
		
		//쓰레드 1개 더 만들어서 쓰레드로 동작시키기
		MyThread th2 = new MyThread(20); // 내가 준 숫자만큼 반복
		th2.setName("MyThread-999");
		th2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("th2 : " + th2);
		
		th2.start();
		
		//th1.join(); //예외발생 > 던지기, th1 종료 후 main 쓰레드 종료
		
		System.out.println("---- main() 끝 ----");

	}

}
