package com.mystudy.io1_file;

import java.io.File;

public class FileExam1 {

	public static void main(String[] args) {
		// File 클래스
		String seperator = File.separator; //파일경로 구분자를 의미함 \
		// C:\MyStudy\10_Java
		System.out.println("File.separator : " + seperator);
		//코드가 실행되는 곳 os가 뭐냐에 따라 구분자가 다르게 리턴됨
		//윈도우 : 역슬래시, 애플 : 슬래시
	
		char seperatorChar = File.separatorChar;
		System.out.println("File.separator : " + seperator);
		//String "\"와 char '\'
		
		String pathSeperator = File.pathSeparator;
		System.out.println("File.pathSeparator" + pathSeperator);
		System.out.println("---------------");
		
		File[] listRoots = File.listRoots();
		for (File file : listRoots) {
			System.out.println(file);
		}
		
		
	}

}
