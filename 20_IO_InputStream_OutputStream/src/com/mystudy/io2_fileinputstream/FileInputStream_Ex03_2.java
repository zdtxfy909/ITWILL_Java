package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex03_2 {

	public static void main(String[] args) {
		//(실습) Ex03_1 파일을 반복문으로 변경
		
		//0. 사용할 파일객체 생성
		File file = new File("file/test01.txt");
		
		//1. 파일을 읽어서 작업할 객체 생성(FileInputStream)
		FileInputStream fis = null;
		
		try {
			//2. 객체를 사용해서 파일데이터 읽어서 화면에 출력(byte[] 사용, 반복문으로 반복처리)
			fis = new FileInputStream(file);

			byte[] bytes = new byte[10];
			//System.out.println(Arrays.toString(bytes));

			while (true) {
				int readCnt = fis.read(bytes);
				if (readCnt == -1) break;
				System.out.println("읽은갯수 : " + readCnt);
				System.out.println("bytes : " + Arrays.toString(bytes));
				for (int i = 0; i < readCnt; i++) {
					System.out.print((char)(bytes[i]));
				}
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("[예외발생] : " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체를 close(닫기)
			try {
				if (fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
