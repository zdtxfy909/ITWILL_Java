package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_EX01 {

	public static void main(String[] args) {
		System.out.println("======== main() 시작 =========");
		File file = new File("temp.txt");
		
		FileInputStream fis = null;
		//파일로부터 읽기 위한 작업을 진행
		try {
			//1. 사용할 객체 생성
			fis = new FileInputStream(file);
			
			//2. 객체를 사용해서 작업 처리
			int readValue = fis.read();
			System.out.println("read() int값 : " + readValue);
			System.out.println("(char)read() : " + (char)readValue);
			
			System.out.println("--- 전체 데이터 읽어서 화면 출력 -----");
			while (true) {
				// EOF(end of the file)를 만나면(더이상 읽을 것이 없으면) -1을 리턴
				readValue = fis.read();
				if (readValue == -1) break; //파일의 끝(EOF)면 읽기종료한다
				System.out.println("read() int값 : " + readValue);
				System.out.println("(char)read() : " + (char)readValue);
			}
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("[예외발생] : " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체 사용 후 닫기(close)
			if (fis != null) {
				try {
					fis.close(); //null이 아니면 close해라
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("======== main() 끝 =========");
		
	}

}
