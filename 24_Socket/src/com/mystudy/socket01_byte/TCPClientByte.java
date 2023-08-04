package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientByte {

	public static void main(String[] args) {
		// 클라이언트 : Socket 이용해서 서버에 접속한다(서버IP주소와 포트번호 필요하다)
		Socket socket = null;
		try {
			System.out.println("==== 클라이언트 ====");
			// 				        	IP주소, 포트번호  ---> 정보를 가지고 찾아감
			//socket = new Socket("127.0.0.1", 10000);
			socket = new Socket("localhost", 10000); //localhost : 현재컴퓨터
			System.out.println(">> 서버연결 성공 socket : " + socket);
			
			InputStream is = socket.getInputStream(); //읽어들일 수 있는 객체 생성
			OutputStream os = socket.getOutputStream(); //쓸 수 있는 객체 생성
			
			// OutputStream 이용해서 서버쪽으로 쓰기(출력)
			//System.out.println(">> 서버쪽으로 문자 'A' 보내기");
			//os.write('A');
			
			String msg = "안녕하세요~ 반갑습니다.";
			System.out.println("서버로 보낸 메세지 : " + msg);
			byte[] buf = msg.getBytes(); //버퍼역할을 하는 바이트배열
			os.write(buf);
			
			os.close();
			is.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(">> 클라이언트 종료");
	}

}
