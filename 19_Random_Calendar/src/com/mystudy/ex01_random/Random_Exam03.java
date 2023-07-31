package com.mystudy.ex01_random;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Random_Exam03 {

	public static void main(String[] args) {
		// (실습)오늘 당신의 행운지수 알아보기(0~100)
		// Math.random(), Random 사용해서 행운지수 값 만들기
		// 실행결과 출력
		// 예) 2023년 7월 31일 당신의 행운지수(0~100)는 77입니다.
		// -------------------------------------------
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR); //상수화된 변수
		int month = calendar.get(Calendar.MONTH) + 1; 
		//0~11까지의 숫자를 사용한다. +1 해줘야함.
		int date = calendar.get(Calendar.DATE);
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("date : " + date);
		System.out.println(year + "년 " + month + "월 " + date + "일");
		String yyyymmdd = year + "년" + month +"월 " + date + "일 ";
		
		
		//방법1 : Random nextInt(숫자)
		Random ran = new Random();
		
		int ranInt = ran.nextInt(101); //0~100까지
		
		System.out.print("이름을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.print(yyyymmdd);
		System.out.println(name + "님의 행운지수(0~100)는 " + ranInt + "입니다.");
		
		//방법2 : Math.random()
		int result = (int) (Math.random() * 101); //0~100까지
		
		System.out.println("2023년 7월 31일 당신의 행운지수(0~100)는 " 
				+ result + "입니다.");
		
	}

}
