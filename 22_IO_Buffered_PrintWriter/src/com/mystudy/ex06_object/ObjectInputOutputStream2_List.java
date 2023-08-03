package com.mystudy.ex06_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectInputOutputStream2_List {

	public static void main(String[] args) {
		// StudentVO 객체들을 ArrayList에 담아서 파일에 저장하고
		// 파일에서 읽어들인 ArrayList 객체에 담긴 VO 데이터를 화면출력
		// 사용할 파일명 : file/object_io_list.data
		// ----------------------------------------
		// VO 데이터 생성 ---> List에 저장 ---> 파일에 출력
		// 파일에서 List 읽기 ---> List에 있는 VO 데이터 가져다 화면출력
		
		StudentVO stu1 = new StudentVO("김유신", 100, 80, 50);
		StudentVO stu2 = new StudentVO("홍길동", 80, 90, 100);
		
		ArrayList<StudentVO> list = new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		// 파일에 List를 쓰고, 파일에서 List를 읽어와서 담긴 데이터 화면을 출력
		System.out.println("=== List 파일에 출력(Output) ====");
		File file = new File("file/object_io_list.data"); //확장자는 뭘로 하든 상관 없다
/*
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos); //OutputStream 객체를 전달받는다
			
			oos.writeObject(list);
			
			System.out.println(">>> 파일에 쓰기 완료 -------");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
*/		
		System.out.println("=== 파일에서 List 읽기(Input) ====");
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			//파일에서 읽기
			
			ArrayList<StudentVO> readList = (ArrayList<StudentVO>)(ois.readObject());
			System.out.println("--- 개선된 for문으로 작성 ----");
			for (StudentVO vo : readList) {
				System.out.println(vo.getName() + "\t");
				System.out.println(vo.getTot() + "\t");
				System.out.println(vo.getAvg() + "\t");
			}
			System.out.println("-------------");
			
			for (int i = 0; i < readList.size(); i++) {
				StudentVO vo = readList.get(i);
				System.out.print(vo.getName() + " " 
							+ vo.getTot() + " " + vo.getAvg() + " ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if (ois != null) ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
	}

}
