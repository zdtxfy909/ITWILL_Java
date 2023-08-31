package com.mystudy.Stringbuilder;

public class Ex01_StringBuffer {

	public static void main(String[] args) {
		// StringBuffer 클래스
		StringBuffer sb = new StringBuffer("Hello Java!!!");
		System.out.println(sb);
		
		String str = sb.toString(); 
		//StringBuffer 의 저장 문자열 확인
		System.out.println("sb.length() : " + sb.length()); 
		//sb.length() : 13. 데이터갯수 확인
		System.out.println("sb.capacity() : " + sb.capacity()); 
		//sb.capacity() : 29. 여유공간 포함한 저장공간의 값 확인
		//데이터가 들어오면 자동으로 여유공간을 갖는다
		
		System.out.println("---String : 데이터 불변(immutable) ---");
		
		String str1 = sb.toString();
		//String타입의 객체 생성
		System.out.println("str1 : " + str1);
		//한번 저장되면 저장된 문자열 자체를 변경할 수 없다
		String str2 = str1.concat(" 반갑습니다"); 
		//str1에 문자열 붙이기. 다른 저장공간에 "Hello Java 반갑습니다" 생성
		//str1에 저장>str1 자체 데이터가 변경되는 건 아니다. 가진 주소값만 변경된다.
		System.out.println("str2 : " + str2);
		
		System.out.println("--- StringBuffer : 데이터 변경 가능 ----");
		System.out.println("sb : " + sb.toString());
		
		sb.append(" 반갑습니다").append("~~~");
		System.out.println("sb.append 후 : " + sb.toString());
		System.out.println("sb.length() : " + sb.length()); 
		//sb.length() : 19
		System.out.println("sb.capacity() : " + sb.capacity());
		//sb.capacity() : 29 (여유공간 포함)
		
		sb.reverse();
		System.out.println("sb.reverse 후 : " + sb.toString());
		// sb.reverse 후 : ~~~다니습갑반 !!!avaJ olleH
		sb.reverse();
		System.out.println("sb.reverse 한번 더 : " + sb.toString());
		// sb.reverse 한번더 : Hello Java!!! 반갑습니다~~~
		
		System.out.println("==== delete(), insert(), replace() ======");
		// Hello Java!!! 반갑습니다~~~
		StringBuffer sb2 = sb.delete(0, 6);
		// end숫자 전까지. 
		System.out.println("sb.delete(0, 6) : " + sb2); 
		// Java!!! 반갑습니다~~~
		System.out.println("sb.delete(0, 6) : " + sb.delete(0, 6)); 
		// 0부터 6이전까지 삭제. ! 반갑습니다~~~
		System.out.println("sb : " + sb.toString());
		// ! 반갑습니다~~~ (데이터 변경됨)
		System.out.println("sb == sb2 : " + (sb == sb2)); // 동일객체
		
		sb.insert(0, "Hello Java!!"); //입력
		System.out.println("sb.insert(0, \"Hello Java!!\") : " 
					+ sb.toString()); //출력
		
		sb.replace(0, 5, "Hi,"); // delete와 insert 한번에 해줌
		System.out.println("sb.replace(0, 5, \"Hi,\") : " + sb.toString());
		// 0부터 5이전까지 대체한다
		System.out.println("--------------");
		
		sb2 = new StringBuffer(100);
		System.out.println("sb2.length() : " + sb2.length()); 
		System.out.println("sb2.capacity() : " + sb2.capacity());
		//100
		
		sb2.append("안녕하세요");
		System.out.println("sb2 : " + sb2.toString());
		System.out.println("sb2.length() : " + sb2.length()); //5
		System.out.println("sb2.capacity() : " + sb2.capacity()); //100
		//크기 내에 있으면 총용량은 달라지지 않음
		sb2.append(" 반갑습니다!!!!!");
		System.out.println("sb2 : " + sb2.toString());
		System.out.println("sb2.length() : " + sb2.length()); //16
		System.out.println("sb2.capacity() : " + sb2.capacity()); //100
		
		System.out.println("--- trimToSize() 실행하면 -----");
		sb2.trimToSize(); //노는 공간 삭제. 삭제하면 끝 > 리턴값은 없다.
		System.out.println("sb2.length() : " + sb2.length()); //16
		System.out.println("sb2.capacity() : " + sb2.capacity()); //16
		
		System.out.println(">> sb2.setLength(5) 실행하면 -----");
		//sb2.setLength(5); // 길이를 5로 바꿔라. 바꾸고 끝 > 리턴값 없다. 
		// 호출해서 실행만 하면됨. 작게 설정하면 delete 효과가 있음
		sb2.delete(5, sb.length() - 1); // = 앞에 다섯개 남기고 모두 삭제
		System.out.println("sb2 : " + sb2.toString()); 
		// sb2 : 안녕하세요
		
		System.out.println(">> sb2.setLength(0) 실행하면 -----");
		//sb2.setLength(0); //전체 데이터 삭제
		sb2.delete(0, sb.length()); // 전체 데이터 삭제
		System.out.println("sb2 : " + sb2.toString());
		System.out.println("sb2.length() : " + sb2.length()); // 0
		System.out.println("sb2.capacity() : " + sb2.capacity()); // 16
		
		
		
		
		
	}

}
