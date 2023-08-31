package com.mytest.test2;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		String id;
		String name;
		String pw;
		String email;
		String phone;
		Scanner scan = new Scanner(System.in);
		
		//<1>
		System.out.println("<회원가입 정보 입력>");
		System.out.print("아이디 : ");
		id = scan.nextLine();
		System.out.print("성명 : ");
		name = scan.nextLine();
		System.out.print("암호 : ");
		pw = scan.nextLine();
		System.out.print("이메일 : ");
		email = scan.nextLine();
		System.out.print("전화번호 : ");
		phone = scan.nextLine();
		
		//<2>
		System.out.println("<로그인>");
		System.out.print("아이디 : ");
		id = scan.nextLine();
		System.out.print("암호 : ");
		pw = scan.nextLine();
		
		//<3>
		int selectUpd;
		System.out.println("<회원정보 수정>");
		System.out.println("1.성명 2.암호 3.이메일 4.전화번호");
		System.out.print("수정 항목 선택(1~4)> ");
		selectUpd = Integer.parseInt(scan.nextLine());
		
		//<4>
		int select;
		System.out.println("<회원정보 검색>");
		System.out.println("1.아이디 2.이름 3.이메일 4.전화번호");
		System.out.print("검색항목선택(1~4)> ");
		select = Integer.parseInt(scan.nextLine());

		
		
		
	}

}
