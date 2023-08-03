package com.mystudy.ex04_printwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriter_OutputStream_Exam {

	public static void main(String[] args) {
		// PrintWriter <-- FileOutputStream <-- File
		// 파일 객체를 만들어서 파일아웃풋스트림에 주입, 프린트라이터에 파일아웃풋스트림 주입
		
		FileOutputStream fos = null;
		PrintWriter pw = null;
		
		try {
			fos = new FileOutputStream(new File("file/pw_out.txt"));
			pw = new PrintWriter(fos);
			
			pw.write("안녕하세요");
			pw.write("점심시간 후 오후~~\n");
			
			pw.print("지금 자바 공부중~~");
			pw.print("아직은 안 졸리다.");
			pw.println();

			pw.println("조금 지나면 졸릴수도 있다~~");
			pw.println("끝나려면 4시간 남았다. ㅠㅠ");

			pw.printf("%10s %10s %10s %n", "이제", "20분", "남았다");
			pw.printf("%-50s\n", "18분정도 남았습니다.");
			pw.printf("%50s\n", "17분정도 남았습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			 if(pw != null) pw.close();
		}

	}

}
