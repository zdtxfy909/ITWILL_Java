package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Ex02 {

	public static void main(String[] args) {
		File file = new File("file/test01.txt");
		//물리적으로 존재하지 않음 ---> new > File해서 txt 만들어주기
		
		FileInputStream fis = null; //디폴트로 null값 넣어줌
		
		try {
			//1. 사용할 객체를 생성한다 > 오류발생 try catch
			//fis = new FileInputStream(file); //File 객체 주입(전달받아) 사용
			fis = new FileInputStream("file/test01.txt"); 
			
			//2. 객체 사용
			/*
			// fis.read(); //오류발생 > 두번째껄로 오류잡기
			int readValue = fis.read();
			while (readValue != -1) { 
				//-1이 아니면 출력해라 > 무한루프, 처음 읽은 readValue가 계속 반복됨
				System.out.println("read() int값 : " + readValue);
				System.out.println(">> char : " + (char)readValue);
				readValue = fis.read();
				//추가해줘야 무한루프 벗어날 수 있음
			}
			*/
			int readValue;
			while ((readValue = fis.read()) != -1) { //-1값이 아니면 실행한다
				System.out.println("read() int값 : " + readValue);
				System.out.println(">> char : " + (char)readValue);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //반드시 처리
			//3. 객체 닫기(close)
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
				}
			}
		}
		System.out.println("--- main() 끝 ----");

	}

}
