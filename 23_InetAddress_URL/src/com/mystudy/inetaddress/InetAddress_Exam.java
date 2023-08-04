package com.mystudy.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_Exam {

	public static void main(String[] args) throws UnknownHostException {
		// InetAddress : IP주소 관련 클래스
		InetAddress iaddr = InetAddress.getLocalHost(); //예외발생 > 던지기
		System.out.println("iaddr : " + iaddr);
		// WIN-6T3GDAVTFEC/192.168.18.8
		//	 컴퓨터명,서버명	  / 	IP주소
		System.out.println("호스트명 : " + iaddr.getHostName());
		System.out.println("호스트 IP주소 : " + iaddr.getHostAddress());
		
		System.out.println("---- 네이버 주소 검색 ----");
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println("naver : " + naver);
		// www.naver.com/223.130.200.104
		// 223.130.200.104로 검색해도 네이버로 간다
		System.out.println("호스트명 : " + naver.getHostName());
		System.out.println("호스트 IP주소 : " + naver.getHostAddress());
		
		System.out.println("--- 네이버 IP 주소들 검색 ----");
		InetAddress[] iaArray = InetAddress.getAllByName("www.naver.com");
		
		for (InetAddress ia : iaArray) {
			System.out.println("호스트명 : " + ia.getHostName());
			System.out.println("호스트 IP주소 : " + ia.getHostAddress());
		}
		// 두개가 출력되는데 둘다 사용가능하다
		
		
	}

}
