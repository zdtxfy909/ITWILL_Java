package com.mystudy.reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Exam2 {

	public static void main(String[] args) {
		// (실습) FileReader_Exam1 내용을 반복문으로 변경처리
		File file = new File("file/test_char.txt");
		
		FileReader fr =  null;
				
		int readChar = 0;
		try {
			//1. 객체(인스턴스) 생성
			fr = new FileReader(file);
			
			while (true) {
				readChar = fr.read();
				if (readChar == -1) break;
				System.out.print(readChar + ":" + (char)readChar + " ");
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(">> [예외] 파일 없음");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(">> [예외] 파일을 읽지 못함");
		} finally {
			try {
				if (fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
