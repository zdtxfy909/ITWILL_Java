package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPServerByte {

	public static void main(String[] args) {
		// 서버측 : ServerSocket 객체가 클라이언트 접속을 기다린다
		ServerSocket server = null;
		
		try {
			System.out.println("==== 서버 ====");
			// 서버에서 10000번 포트로 포트를 열고 
			server = new ServerSocket(10000);  //포트번호 10000번으로 서비스를 하겠다
			System.out.println("현재컴퓨터IP : " + InetAddress.getLocalHost());
			System.out.println("[서버] 시작 후 클라이언트의 접속 대기중~~");
			
			//서버에서 해당 포트로 접속한 클라이언트와 통신할 수 있는 소켓을 생성함
			Socket socket = server.accept(); //접속 대기상태가 됨. 소켓타입으로 리턴함
			System.out.println("[서버] 1개 클라이언트 접속 : " + socket);
			//접속을 해야 실행이 된다
			
			InputStream is = socket.getInputStream(); //읽어들일 수 있는 객체 생성
			OutputStream os = socket.getOutputStream(); //쓸 수 있는 객체 생성
			
			// 클라이언트에서 보낸 데이터를 읽고 화면에 표시
			//int readValue = is.read();
			//System.out.println("[서버] 클라이언트로 부터 받은 메세지 : " + (char)(readValue));
			
			byte[] buf = new byte[100];
			is.read(buf);
			System.out.println("buf : " + Arrays.toString(buf));
			System.out.println("[서버] 받은메세지 : " + new String(buf));
			
			os.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(">> 서버종료");

	}

}
