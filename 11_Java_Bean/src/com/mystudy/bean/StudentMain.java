package com.mystudy.bean;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student(); //기본생성자
		System.out.println("stu : " + stu.toString()); //com.mystudy.bean.Student@15db9742
		
		//System.out.println("stu.name : " + stu.name); // not visible
		stu.setName("홍길동");
		String name = stu.getName();
		System.out.println("name : " + name); //name : 홍길동
		System.out.println("name : " + stu.getName()); //name : 홍길동
		
		// stu.kor = 999; //못씀
		System.out.println("입력 전 kor : " + stu.getKor());
		stu.setKor(999);
		System.out.println("입력 후 kor : " + stu.getKor());
		stu.setKor(100);
		System.out.println("kor : " + stu.getKor());
		stu.setEng(90);
		System.out.println("eng : " + stu.getEng());
		
		stu.setMath(80);
		System.out.println("math : " + stu.getMath());
		
		System.out.println("-------");
		stu.setKor(50);
		stu.setEng(5);
		stu.setMath(15);
		
		int tot = stu.getKor() + stu.getEng() + stu.getMath();
		System.out.println("tot : " + tot);
		
		stu.setTot(tot); //계산된 합계 데이터를 Student 타입의 객체의 필드에 저장	
		
		double avg = tot * 100 / 90 / 100.0;
		stu.setAvg(avg);
		
		stu.printData();
		
		System.out.println("=== 생성자 사용 데이터 입력 =====");
		Student stu2 = new Student("김유신", 10, 50, 30);
		
		stu2.printData();
	}

	

}
