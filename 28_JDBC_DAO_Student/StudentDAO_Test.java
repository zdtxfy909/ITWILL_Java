package com.mystudy.student.dao;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.mystudy.student.vo.StudentVO;

public class StudentDAO_Test {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO(); //static 초기화 구문 호출
		String id = "2023003";
		StudentVO stu1 = dao.selectOne(id);
		System.out.println("stu1 : " + stu1);
		
		System.out.println("---- selectOne(VO) ----");
		StudentVO stu2 = new StudentVO("2023003", "", 0, 0, 0);
		//id값만 넣음
		System.out.println("검색용 전달vo : " + stu2);
		
		StudentVO student = dao.selectOne(stu2);
		System.out.println("DB 검색된 student : " + student);
		//실제 DB에 저장된 데이터
		
		System.out.println("---- selectAll() -----");
		List<StudentVO> list = dao.selectAll();
		for (StudentVO vo : list) {
			System.out.println(vo);
		}
		System.out.println("----------");
		for(StudentVO vo : list) {
			System.out.println(vo.getId() + "," + vo.getName());
		}
		
		System.out.println("---- insert(vo) -----");
		student = new StudentVO("2023020", "홍경래", 90, 90, 80);
		System.out.println("입력할 학생 : " + student);
		
		int result = dao.insert(student);
		System.out.println("입력건수 : " + result);
		
		
		System.out.println("---- update(vo) -----");
		student = new StudentVO("2023020", "홍경래", 95, 90, 80);
		System.out.println("수정할 학생 : " + student);
		result = dao.update(student);
		System.out.println("수정건수 : " + result);
		
		System.out.println("수정결과 : " + dao.selectOne(student));
		
		System.out.println("---- delete(id) -----");
		System.out.println("삭제할 데이터 : " + dao.selectOne(student));
		result = dao.delete(student.getId());
		System.out.println("삭제건수 : " + result);
		
		System.out.println("삭제데이터 조회결과 : " + dao.selectOne(student));
		//null이 떠야됨
	}

}
