package com.mystudy.ex01_random;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class LocalDateTime_Exam {

	public static void main(String[] args) {
		// Calendar : 값이 변경됨(mutable)
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " + cal); //현재 시간 주소값? 저장되어있음
		System.out.println("cal date : " + cal.get(Calendar.DATE));
		cal.add(Calendar.DATE, 3); //3일 후
		System.out.println("cal 3일 후 : " + cal);
		//Day_Of_Month값이 변경됨
		System.out.println("cal date 3일 후 : " + cal.get(Calendar.DATE));
		
		cal.add(Calendar.DATE, -3); //3일 전
		System.out.println("cal 3일 전 : " + cal);
		//Day_Of_Month값이 변경됨
		System.out.println("cal date 3일 전 : " + cal.get(Calendar.DATE));
		
		System.out.println("===========================");
		// LocalDate, LocalTime, LocalDateTime : 데이터 불변(immutable)
		System.out.println("======== LocalDate ========");
		LocalDate nowDate = LocalDate.now();
		System.out.println("LocalDate.now() : " + nowDate.toString());
		System.out.println("년 : " + nowDate.getYear());
		System.out.println("월 : " + nowDate.getMonthValue()); //1~12
		System.out.println("일 : " + nowDate.getDayOfMonth());
		
		LocalDate newLocalDate = nowDate.plusYears(2).plusMonths(2).plusDays(1);
		System.out.println("nowDate : " + nowDate); 
		System.out.println("newLocalDate : " + newLocalDate);
		
		System.out.println("======= LocalTime ======");
		
		LocalTime nowtime = LocalTime.now();
		System.out.println("LocalTime.now() : " + nowtime);
		// 16:52:29.142 (.142 => 1/1000초 값까지 나옴)
		System.out.println("LocalTime.now() : " + nowtime.toString());
		System.out.println("시 : " + nowtime.getHour());
		System.out.println("분 : " + nowtime.getMinute());
		System.out.println("초 : " + nowtime.getSecond());
		
		System.out.println("====== LocalDateTime =========");
		LocalDateTime nowDT = LocalDateTime.now();
		System.out.println("LocalDateTime.now() : " + nowDT);
		System.out.println("년 : " + nowDT.getYear());
		System.out.println("월 : " + nowDT.getMonthValue());
		System.out.println("일 : " + nowDT.getDayOfMonth());
		System.out.println("시 : " + nowDT.getHour());
		System.out.println("분 : " + nowDT.getMinute());
		System.out.println("초 : " + nowDT.getSecond());
		
		
		
	}

}
