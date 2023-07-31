package com.mystudy.ex01_random;

import java.util.Random;

public class Random_Exam02 {

	public static void main(String[] args) {
		//랜덤클래스는 객체 생성해야된다
		Random ran = new Random();
		
		System.out.println("------ nextInt() -------");
		for (int i = 0; i < 10; i++) {
			System.out.println(ran.nextInt() + " ");
		}
		System.out.println();
		
		System.out.println("------ nextInt(5) -------");
		for (int i = 0; i < 10; i++) {
			int ranInt = ran.nextInt(5); //0~4까지의 값
			System.out.print(ranInt + " "); 
		}
		System.out.println();
		
		System.out.println("=================");
		System.out.println(ran.nextDouble() + " - Random nextDouble()");
		System.out.println(Math.random() + " - Math.random()");
		
		
		
	}

}
