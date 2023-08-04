package com.mystudy.socket02_echo_while.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientEchoWhile {

	public static void main(String[] args) {
		// (실습) 클라이언트 : 쓰기, 읽기
		// 서버접속 후 메세지를 한번 보내고, - PrintWriter
		// 서버에서 보내온 메세지를 받기 - BufferedReader
		// PrintWriter <-- OutputStream
		// BufferedReader <-- InputStreamReader <-- InputStream (소켓에 있는)
		// --------------------------
		//(추가) 보내는 메세지를 Scanner를 사용, 화면에서 직접 입력하여 처리
		// --------------------------
		System.out.println(">>>> 클라이언트 시작~~~");
		Socket socket = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
			//1. 소켓(Socket) 생성 : 접속할 IP주소, 포트(post) 정보로 서버 접속
			socket = new Socket("localhost", 10000);
			System.out.println(">>> 서버 접속 성공!!!");
			
			//2. 서버쪽으로 쓰고, 읽기 위한 객체 만들기
			pw = new PrintWriter(socket.getOutputStream());
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			//Scanner 사용해서 보낼 메세지 화면에서 입력처리하기
			Scanner scan = new Scanner(System.in);
			
			while (true) {
				//3. 전송(Out)할 데이터가 있으면 쓰기(write)
				System.out.print("전송 메세지 입력 : ");
				String msg = scan.nextLine();
				pw.println(msg);
				pw.flush(); //버퍼에 있는 데이터 강제 출력
				
				if ("exit".equals(msg)) {
					System.out.println("::: 메세지 전송을 중단합니다.");
					break;
				}
				
				//4. 읽을 데이터가 있으면 읽기
				msg = br.readLine();
				System.out.println("[클라이언트-받은메세지]" + msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close();
			try {
				if (br != null) br.close();
			} catch (IOException e) {
			}
			try {
				if (socket != null) socket.close();
			} catch (IOException e) {
			}
		}
	}
}
