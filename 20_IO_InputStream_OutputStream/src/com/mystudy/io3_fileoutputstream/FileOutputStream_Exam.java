package com.mystudy.io3_fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStream_Exam {

	public static void main(String[] args) {
		// FileOutputStream : byte 단위로 파일에 저장(출력, 쓰기)
		File file = new File("file/test_out_01.txt");
		
		FileOutputStream fos = null;
		try {
			//1. 사용할 객체를 생성한다
			fos = new FileOutputStream(file);
			// = 새로 만든다 (파일 없으면 파일 생성. 이미 존재하면 내용 삭제 후 새로 씀)
			//fos = new FileOutputStream(file, true);
			// 내용추가모드, true일 때 실행횟수만큼 append 된다
			
			//2. 객체 사용해서 작업처리한다
			fos.write('H');
			fos.write('E');
			fos.write('L');
			fos.write('L');
			fos.write('O');
			
			byte[] bytes = "Hello Java!!!".getBytes();
			System.out.println("bytes : " + Arrays.toString(bytes));
			
			fos.write(bytes);
			fos.write('\n');
			
			//				시작위치, 사용할 갯수
			fos.write(bytes, 0, bytes.length); // Hello Java!!!
			fos.write('\n');
			fos.write(bytes, 6, 7); //6번인덱스에서 7개 // Java!!!
			fos.write('\n');
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용 후에는 사용 객체 닫기 close
				try {
					if (fos != null) 
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
		

	}

}
