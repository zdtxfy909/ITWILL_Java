package com.mystudy.thread04_error2.copy;

class Bank {
	int money = 0;
}

class ATM_Error extends Thread {
	Bank bank;
	//int money;

	public ATM_Error() {}
	public ATM_Error(Bank bank) {
		this.bank = bank;
	}
	
	// 입금처리
	synchronized void add(int money) {
		bank.money += money;
		System.out.println(Thread.currentThread() + " - "
				+ "입금 : " + money + ", 잔액" + bank.money);
	}
	
	// 출금처리
	synchronized void out(int money) {
		bank.money -= money;
		System.out.println(Thread.currentThread() + " - "
				+ "출금 : " + money + ", 잔액" + bank.money);
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
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}


public class ATM_Thread_Error {

	public static void main(String[] args) {
		System.out.println("---- main() 시작 -----");
		Bank bank = new Bank();
		
		ATM_Error atm1 = new ATM_Error(bank);
		atm1.start();
		
		ATM_Error atm2 = new ATM_Error(bank);
		atm2.start();
		
		
		System.out.println("---- main() 끝 -----");

	}

}
