package com.mystudy.thread03_error;

class ATM implements Runnable {
	int money;

	public ATM() {}
	public ATM(int money) {
		this.money = money;
	}
	
	// 입금처리
	// synchronized 처리로 사용중인 자원(필드값)에 대한 동기화 처리
	// 사용중에 다른 쓰레드에서 사용하려고 할 때 대기상태가 된다.
	synchronized void add(int money) {
		this.money += money;
		System.out.println(Thread.currentThread() + " - "
				+ "입금 : " + money + ", 잔액" + this.money);
	}
	
	// 출금처리
	synchronized void out(int money) {
		this.money -= money;
		System.out.println(Thread.currentThread() + " - "
				+ "출금 : " + money + ", 잔액" + this.money);
	}
	
	@Override
	public void run() {
		add(1000);
		bankSleep(1000); //1초동안 쉰다
		out(500);
		bankSleep(1000);
		out(300);
		bankSleep(1000);
		out(200);
		
	}
	
	void bankSleep(int millisecond) {
		try {
			Thread.currentThread().sleep(millisecond); 
			//현재 사용하고 있는 쓰레드에 쉬는 시간을 넣어준다
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}


public class ATM_Thread_Error_Sync {

	public static void main(String[] args) {
		System.out.println("---- main() 시작 -----");
		ATM bank = new ATM();
		System.out.println("은행잔고 : " + bank.money);
	
		Thread th1 = new Thread(bank); 
		Thread th2 = new Thread(bank);
		
		th1.start();
		th2.start();
		
		System.out.println("---- main() 끝 -----");

	}

}
