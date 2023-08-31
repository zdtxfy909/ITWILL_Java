package com.mystudy.bean_vo;

import java.util.Arrays;

public class StudentManager {

	public static void main(String[] args) {
		/* 3명의 성적 처리 StudentVO 사용
		"김유신", 100, 90, 81
		"이순신", 95, 88, 92
		"홍길동", 90, 87, 77
		====================
		김유신	100	90	81	271	90.33
		이순신	95	88	92	
		홍길동	90	87	77
		 ------------------*/
		StudentVO stu1 = new StudentVO("김유신", 100, 90, 81);
		System.out.println(stu1.toString());
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO stu3 = new StudentVO("홍길동", 90, 87, 77);
		
		//화면출력 -----------------
		
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");
		printData(stu1);
		printData(stu2);
		printData(stu3);
		
		System.out.println("=============== 배열 ===============");
		// 1
		StudentVO[] students = new StudentVO[3];
		students[0] = stu1;
		students[1] = stu2;
		students[2] = stu3;
		printData(students);
		System.out.println("----------------------");
		
		// 2
		students = new StudentVO[] {stu3, stu2, stu1};
		System.out.println(Arrays.toString(students));
		printData(students);
		System.out.println("-----------------------");
		
		// 3
		String[] names = {"김유신", "이순신", "홍길동"};
		int[][] sungjuk = {{100, 90, 81}, {95, 88, 92}, {90, 87, 77}};
		
		for (int i = 0; i < sungjuk.length; i++) {
			
			int kor = sungjuk[i][0];
			int eng = sungjuk[i][1];
			int math = sungjuk[i][2];

			int tot = kor + eng + math;
			double avg = tot * 100 / 3 / 100;
			
			System.out.print(names[i] + "\t");
			System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg);

		}
		
	}

	private static void printData(StudentVO stu1) {
		System.out.println(stu1.getName() + "\t" + stu1.getKor() + "\t" +
				stu1.getEng() + "\t" + stu1.getMath() + "\t" +
				stu1.getTot() + "\t" + stu1.getAvg());
		
	}	
	
	static void printData(StudentVO[] students) {
		for (int i = 0; i < students.length; i++) {
			printData(students[i]);
		}
	}
		
		
		
}
