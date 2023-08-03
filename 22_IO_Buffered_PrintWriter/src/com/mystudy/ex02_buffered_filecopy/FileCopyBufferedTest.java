package com.mystudy.ex02_buffered_filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBufferedTest {

	public static void main(String[] args) {
		// 버퍼는 속도를 개선하기 위해서 사용한다
		// BufferedInputStream, BufferedOutputStream 적용
		// 파일을 복사(binary) : img102.jpg -> img102_copy.jpg
		// File --> FileInputStream --> BufferedInputStream
		// 최종 사용은 BufferedInputStream으로 읽어들일 것임
		//-------------------------------------------
		
		File inputFile = new File("file/img102.jpg"); //읽어들일 곳
		File outputFile = new File("file/img102_copy.jpg"); //출력할 곳
		
		//파일로부터 읽고, 쓰기 위한 객체(인스턴스)를 저장하기 위한 변수
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//버퍼(buffer) 사용을 위한 변수 선언
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			// 파일을 읽고 쓰기 위한 객체 생성
			fis = new FileInputStream(inputFile);
			fos = new FileOutputStream(outputFile);
			
			System.out.println(">> 파일 복사 시작(버퍼없이) --------");
			long startTime = System.currentTimeMillis(); 
			// 1/1000초 단위로, 코드가 실행되는 시점의 연월일초
			
			// 파일복사(버퍼없이) : 바이트(byte) 단위 읽고, 쓰기
			int readValue = fis.read(); //읽고
			while (readValue != -1) {
				fos.write(readValue); //쓰고
				readValue = fis.read(); //읽고
			}
			long endTime = System.currentTimeMillis(); 
			System.out.println(">> 파일 복사 끝(버퍼없이) ---------");
			System.out.println("startTime : " + startTime);
			System.out.println("endTime : " + endTime);
			System.out.println("byte 복사시간 : " + (endTime - startTime) + " (ms)");
			
			
			fis.close();
			fos.close(); //스트링은 재사용 못한다
			
			System.out.println("================");
			// 버퍼 기능이 있는 클래스로 구현
			bis = new BufferedInputStream(new FileInputStream(inputFile), 10);
			
			bos = new BufferedOutputStream(
					new FileOutputStream("file/img102_copy.jpg"), 10);
			
			System.out.println(">> 파일 복사 시작(버퍼사용) --------");			
			startTime = System.currentTimeMillis();  
			//버퍼 기능 사용 파일 복사
			readValue = bis.read();
			while (readValue != -1) {
				bos.write(readValue);
				readValue = bis.read();
			}
			endTime = System.currentTimeMillis(); 
			System.out.println(">> 파일 복사 끝(버퍼사용) ---------");
			System.out.println("buffer 복사시간 : " + (endTime - startTime) + " (ms)");

			bos.close();
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
	}

}
