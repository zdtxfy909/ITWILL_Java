package com.mystudy.socket02_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEcho {

	public static void main(String[] args) {
		// (실습) 서버쪽 : 읽고, 쓰기
		// 클라이언트가 보내온 메세지를 1번 받고(읽기) - BufferedReader
		// 받은 메세지를 클라이언트에게 다시 보내기 - PrintWriter
		// BufferedReader <-- InputStreamReader <-- InputStream (소켓에 있는)
		// PrintWriter <-- OutputStream
		// ------------------------------
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
			//1. ServerSocket 객체생성 - 서비스할 포트번호(port) 지정
			System.out.println(">> 서버 시작~~ 접속 대기중");
			server = new ServerSocket(10000);
			System.out.println(">>IP주소:포트번호 - " 
					+ InetAddress.getLocalHost().getHostAddress() + ":"
					+ server.getLocalPort());
			
			//2. 서버소켓 대기중 접속한 Socket과 통신할 수 있는 Socket 객체를 생성한다.
			Socket socket = server.accept(); // 리턴받아 사용하지 않으면 의미가 없다.
			System.out.println(">> 클라이언트 접속됨");
			System.out.println(":: 접속정보 : " + socket.getInetAddress());
			
			//3. 데이터를 받고, 받은 데이터를 돌려주기 (읽고, 쓰기)
			
			//InputStream in = socket.getInputStream(); 
			//---> 소켓에서 InputStream을 가져옴
			//InputStreamReader isr = new InputStreamReader(in); 
			//--->BufferedReader은 Reader계열만 받을 수 있어서 필요함
			//BufferedReader br = new BufferedReader(isr);
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			System.out.println(":: 메세지 읽기~");
			
			while (true) {
				String msg = br.readLine();
				System.out.println("[서버-받은메세지]" + msg);
				// ----- 읽기 작업 끝 ------

				// 전달 받은 메세지를 클라이언트쪽으로 다시 보내기
				//			OutputStream out = socket.getOutputStream();
				//			PrintWriter pw = new PrintWriter(out); 
				//---> writer도 받을 수 있고 OutputStream도 가능
				pw = new PrintWriter(socket.getOutputStream());
				pw.println(msg);
				System.out.println("[서버-보낸메세지]" + msg);

				pw.flush(); // 버퍼에 있는 데이터를 출력(전송)
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close();
			System.out.println("close > PrintWriter");
			try {
				if (br != null) br.close();
				System.out.println("close > BufferedReader");
			} catch (IOException e) {}
			try {
				if (server != null) server.close();
				System.out.println("close > ServerSocket");
			} catch (IOException e) {}
		}
		
	}
}


