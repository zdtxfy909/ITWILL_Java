package com.mystudy.io1_file;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException {
		// 파일명 : temp.txt - 파일명.확장자(명)
		File file1 = new File ("temp.txt"); 
		// ./temp.txt = 현재위치를 말하는데 이게 생략된 거임
		// File 객체 생성은 파일의 존재여부와 관계없이 객체 생성 가능하다.
		System.out.println("file1 : " + file1); //파일의 이름을 리턴
		
		// 상대경로 방식(. : 현재위치. .. : 상위디렉토리(폴더))
		// 현재위치에 따라서 경로가 다르게 변한다.
		File file2 = new File("./file/temp.txt");
		//현재위치로부터 파일디렉토리 아래 temp가 있다
		System.out.println("file2 : " + file2);
		
		// 절대주소방식 : Root 디렉토리로부터 전체 경로를 표시한다 (위치 불변)
		File file3 = new File("c:\\temp\\aaa\\temp.txt");
		System.out.println("file3 : " + file3);
		
		System.out.println("---- getAbsolutePath() : 절대경로명 ----");
		System.out.println("절대경로 file1 : " + file1.getAbsolutePath()); 
		//C:\MyStudy\10_Java\20_InputStream_OutputStream\temp.txt
		//따로 위치 정하지 않고 파일명만 정해주면 temp.txt는 현재 위치에 저장됨.
		System.out.println("절대경로 file2 : " + file2.getAbsolutePath()); 
		//C:\MyStudy\10_Java\20_InputStream_OutputStream\.\file\temp.txt
		//전달받은 정보를 그대로 현재위치에 갖다붙임
		System.out.println("절대경로 file3 : " + file3.getAbsolutePath()); 
		
		System.out.println("---- getCanonicalPath() : 정식경로명 -----------");
		System.out.println("정식경로 file1 : " + file1.getCanonicalPath());
		System.out.println("정식경로 file2 : " + file2.getCanonicalPath());
		//C:\MyStudy\10_Java\20_InputStream_OutputStream\file\temp.txt
		// "../file/temp.txt"로 바꾸면 
		//C:\MyStudy\10_Java\file\temp.txt
		System.out.println("정식경로 file3 : " + file3.getCanonicalPath());
		
		System.out.println("---- exists() : 파일의 물리적 존재 여부 확인 ----");
		System.out.println("file1.exists() : " + file1.exists());
		//true
		System.out.println("file2.exists() : " + file2.exists());
		System.out.println("file3.exists() : " + file3.exists());
		
		System.out.println("---- File 속성정보 ----");
		System.out.println("file1.length() : " + file1.length());
		//12 (엔터값도 포함됨)
		System.out.println("file1.canRead() : " + file1.canRead());
		//읽을 수 있냐 = 파일 속성에서 숨김처리하면 못 읽음
		System.out.println("file1.canWrite() : " + file1.canWrite());
		//쓸 수 있냐 = 파일 속성에서 읽기전용처리하면 false 뜸
		System.out.println("file1.canExecute() : " + file1.canExecute());
		//실행가능한 파일이냐
		
		System.out.println("---- getName() : 파일명만 -----");
		System.out.println("file1.getName() : " + file1.getName());
		//경로를 제외하고 파일명만 가져와라.
		
		System.out.println("---- isDirectory(), isFile() -----");
		System.out.println(file1.isDirectory());
		//파일1이 디렉토리냐 false
		System.out.println(file1.isFile());
		//파일이냐 true
		
		System.out.println("===================");
		File file4 = new File("file/temp4.txt");
		System.out.println("file4.delete() : " + file4.delete());
		//물리적으로 존재하지 않으면 삭제 못함 false
		//물리적으로 존재하면 true. 새로고침하면 사라짐	
		
		file4.createNewFile(); //새로만들기. 존재하면 만들지 않는다. 없으면 만듬
		//파일은 만들어주지만 경로까지 만들어주진 않는다
		
		System.out.println("===================");
		File file5 = new File("temp1/temp2/temp3");
		System.out.println("file5.mkdirs() : " + file5.mkdirs());
		//디렉토리 여러개 만들기
	}

}
