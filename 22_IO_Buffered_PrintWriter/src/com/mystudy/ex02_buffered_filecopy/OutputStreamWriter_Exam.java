package com.mystudy.ex02_buffered_filecopy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class OutputStreamWriter_Exam {

	public static void main(String[] args) {
		File file = new File("file/test_osw.txt");
		FileOutputStream fos = null;
		
		// OutputStreamWriter 객체 생성해서 텍스트 출력하기
		// Hello Java~~ 안녕!!!
		OutputStreamWriter osw = null;
		
		try {
			
			fos = new FileOutputStream(file);
			osw = new OutputStreamWriter(fos);
			
			osw.write("Hello Java! 안녕");
			osw.flush(); //OutputStreamWriter 버퍼기능 있어서 해줘야됨

			byte[] bytes = "Hello Java! 안녕".getBytes();
			fos.write('\n');
			fos.write(bytes);
			fos.write('a');
			//fos.write('대'); ---> ' '빈칸 하나 출력됨(비정상처리)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (osw != null) osw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
