package com.mystudy.ex03_isr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_Exam {

	public static void main(String[] args) {
		// InputStream ---> Reader
		// byte 처리 계열 ---> 문자(Character) 처리 계열 전환
		// InputStreamReader : InputStream --> Reader 전환
		// OutputStreamWriter : OutputStream --> Writer 전환
		//---------------------------------
		File file = new File("file/test_isr.txt");
		
		FileInputStream fis = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream(file);
			
			//1. byte단위 처리방식
//			int readValue = fis.read(); // 1byte 읽기
//			System.out.println((char)readValue);
//			
//			readValue = fis.read(); // 1byte 읽기
//			System.out.println((char)readValue); 
			//한글은 이렇게 해도 원하는 글자 안 나옴
			
			//2. byte단위 처리방식에서 문자단위 처리방식으로 전환(변경)
			isr = new InputStreamReader(fis);
			int readValue = isr.read(); // 1문자 읽기
			System.out.println((char)readValue);
			
			readValue = isr.read(); // 1문자 읽기
			System.out.println((char)readValue);
			
			//--------------
			//(번외) 버퍼기능 사용해서 문자기준으로 라인단위 읽기 처리
			br = new BufferedReader(isr);
			String str = br.readLine();
			System.out.println("br.readLine() : " + str);
			
			while (true) {
				str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			} 
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
