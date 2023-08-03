package com.mystudy.ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterEaxm {

	public static void main(String[] args) {
		// 버퍼(buffer) 기능이 구현되어 있는 클래스
		// 버퍼 : 메모리상의 데이터를 저장하는 공간(메모리상에)
		// BufferedReader, BufferedWriter
		// File -> FileReader -> BufferedReader 파일리더를 버퍼리더에 주입?
		//----------------------------------
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			// 파일로 부터 읽기 위한 객체(인스턴스) 생성
			File inFile = new File("file/test_buf_rw_in.txt");
			fr = new FileReader(inFile);
			bufferedReader = new BufferedReader(fr); //버퍼기능 + 파일읽기 기능을 가지고 있다
			
			// 파일에 쓰기 위한 객체 생성
			File outFile = new File("file/test_buf_rw_out.txt");
			fw = new FileWriter(outFile);
			bufferedWriter = new BufferedWriter(fw); //버퍼기능 + 파일쓰기 기능
			
			// 파일에 먼저 쓰기
			bufferedWriter.write("안녕하세요. 자바 공부 중입니다. ㅋㅋ~~\n");
			bufferedWriter.write("Hello Java!!!");
			bufferedWriter.newLine(); //줄바꿈처리
			bufferedWriter.write("재미있나요?");
			bufferedWriter.newLine();
			bufferedWriter.write("-------------\n");
			
			bufferedWriter.flush();
			
			// 파일로부터 읽고 파일에 쓰기(버퍼기능 이용)
			// 파일에서 한번 읽기
			String str = bufferedReader.readLine(); //라인단위(한줄) 읽기
			System.out.println("readLine() 읽은 값 : " + str);
			
			// 파일에 쓰기(한 번 쓰기)
			bufferedWriter.write(str); //문자열 출력
			bufferedWriter.newLine(); //출력 후 줄바꿈처리
			
			// 남은데이터 모두 읽고 쓰기
			str = bufferedReader.readLine(); 
			//null if the end of the stream has been reached (EOF : null 리턴)
			while (str != null) {
				bufferedWriter.write(str);
				str = bufferedReader.readLine(); 
				if (str != null) {
					bufferedWriter.newLine(); 
					//null이면 마지막줄은 줄바꿈처리 하지 않는다
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//최종적으로 담긴 객체만 클로즈처리 해주면 됨
			try {
				if(bufferedWriter != null) bufferedWriter.close();
				if(bufferedReader != null) bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
		System.out.println("main() 끝");
	}

}
