package com.mystudy.net_multi2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

// 내부클래스를 사용한 읽기, 쓰기 쓰레드를 생성해서 사용
// 쓰기쓰레드 : 메세지 작성 및 전송을 독립적으로 처리(언제든지 메세지 보내기 - 쓰기전용)
// 읽기쓰레드 : 서버쪽에서 보내온 메세지를 받아서 화면 표시(언제든지 메세지 읽기 - 읽기전용)

public class TCPClientMultiChat {

	public void start() {

		System.out.println(">>> 클라이언트 시작 ~~~ ");
		Socket socket = null;
		
		PrintWriter pw = null;
		try {
			socket = new Socket("192.168.18.31", 10000);
			System.out.println(">> 서버 접속 완료");
			
			//메세지 보내기 쓰레드 생성(쓰기전용)
			ClientSender clientsender = new ClientSender(socket);
			clientsender.start();
			
			//메세지 받기 쓰레드 생성(읽기전용)
			ClientReceiver clientreceiver = new ClientReceiver(socket);
			clientreceiver.start();
			
		}

		 catch (IOException e) {
			//e.printStackTrace();
			System.out.println("[예외발생] " + e.getMessage());
		} 
		
		System.out.println(">> 클라이언트 종료");
	
		
	}
	//외부말고 내부에 클래스 만들기
	private class ClientSender extends Thread {
		Socket socket;
		DataOutputStream out;
		
		//소켓을 전달받는 생성자
		public ClientSender(Socket socket) {
			this.socket = socket;
			
			try {
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("[예외발생] ClientSender 생성자"
						+ "out 객체 생성 실패!!!");
			}
		}
		
		@Override
		public void run() {
			// 메세지 작성해서 서버로 전송
			if (out == null) {
				System.out.println(":: 출력객체가 없어서 작업 종료.");
				return;
			}
			
			//Scanner 사용해서 보낼 메세지 화면에서 입력처리하기
			Scanner scan = new Scanner(System.in);

			try {
				while (true) {
					//쓰기 -----------
					System.out.print("전송 메세지 입력 : ");
					String msg = scan.nextLine();

					out.writeUTF(msg); //서버쪽으로 메세지 보내기
					//여기서 예외가 발생하면 catch절로 간다
					//break 사용 대신 try문의 위치를 바꿈 (다른방식으로 while문 빠져나가기)
				} 
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 서버에서 보내온 메세지 읽기 전용 쓰레드
	private class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		
		public ClientReceiver(Socket socket) {
			this.socket = socket;
			
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			// 메세지를 받아서 화면에 출력한다
			while (true) {
				try {
					System.out.println(in.readUTF());
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("[예외발생] " + e.getMessage());
					break; // 더이상 읽을 수 없으면 반복을 중단한다.
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new TCPClientMultiChat().start(); 
	}

}
