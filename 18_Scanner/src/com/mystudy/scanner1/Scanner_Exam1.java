package com.mystudy.scanner1;

import java.util.Scanner;

public class Scanner_Exam1 {

	public static void main(String[] args) {
		// Scanner 클래스 : 콘솔(화면)에서 데이터 읽어오기 
		Scanner scan = new Scanner(System.in);
		/**/	
		System.out.print("문자열 입력1 : ");
		String str1 = scan.nextLine(); //읽어들인 문자열을 사용하기 위해 str1에 담음
		System.out.println(">>> " + str1);
		//줄단위 데이터 읽어서 사용할 때 nextLine() 사용한다
		System.out.println("-----");
		
		System.out.print("문자열 입력2 : "); // 데이터를 받을게 2개다
		String str2 = scan.nextLine();
		System.out.println(">>> " + str2);
		
		System.out.println("=============");
		System.out.println("정수값 2개를 입력하면 더한 결과 출력하자");
		int sum = 0;
		
		System.out.print("숫자입력1 : ");
		int num1 = scan.nextInt(); //int값을 리턴해준다
		
		//(주의) nextXXX 메소드 사용 후 nextLine() 사용시 문제발생
		//문제원인 : nextLine() 메소드가 줄바꿈 문자(엔터)까지 읽어서 처리해서
		System.out.print("숫자입력2 : ");
		int num2 = scan.nextInt();
		//int num2 = Integer.parseInt(scan.nextLine()); 
		//---> 이렇게 해도 숫자입력1에 scan.nextLine(); 또 붙여줘야됨
		scan.nextLine(); 
		//줄바꿈(엔터)문자까지의 값을 읽어서 버리기.
		//---> 아무 문자도 읽지 않고 넘어감. 비효율적.
		
		sum = num1 + num2;
		System.out.println("합계 : " + sum);
		
		System.out.print("문자열(nextLine) : ");
		String temp = scan.nextLine(); //문제 발생. 
		System.out.println("입력문자열 출력 : " + temp);
/**/		
		System.out.println("================");
		System.out.print("문자열 1개와 정수 숫자 3개 연속 입력 : ");
		String strTemp = scan.next();
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		System.out.println("첫번째 문자열 : "+ strTemp);
		System.out.println(n1 + ", " + n2 + ", " + n3);
		
		
		
	}

}
