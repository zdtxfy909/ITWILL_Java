package com.mystudy.reader_writer_filecopy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterExam {

	public static void main(String[] args) {
		// FileReader, FileWriter 사용해서 파일 복사
		// 원본파일 : file/test_char.txt
		// 대상파일 : file/test_char_copy.txt
		// 처리 : 원본파일에서 읽고, 대상파일에 쓰기/저장 (문자단위 처리)
		// ---------------------------------------------
		
		//0. 사용할 파일(File) 객체 생성
		File fileIn = new File("file/test_char.txt");
		File fileOut = new File("file/test_char_copy.txt");
		
		//1. FileReader, FileWriter 객체를 생성한다
		FileReader fr = null;
		FileWriter fw = null;
		
		int readValue = 0;
		try {
			//fr = new FileReader("file/test_char.txt");
			fr = new FileReader(fileIn);
			fw = new FileWriter(fileOut);
			
			//2. (반복)원본파일에서 읽고 대상파일에 쓰기 작업		
			while (true) {
				readValue = fr.read();
				if (readValue == -1) break;
				//System.out.print((char)(readValue));
				fw.write((char)(readValue));
			}
			fw.flush(); // flush 안 쓰면 버퍼에만 담겨서 파일에는 전달이 안됨
			// 버퍼에 있는 데이터를 강제 출력처리
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용객체 닫기(close)
			try {
				if(fw != null) fw.close();
			} catch (IOException e) {}
			try {
				if(fr != null) fr.close();
			} catch (IOException e) {}
		}

	}
}




