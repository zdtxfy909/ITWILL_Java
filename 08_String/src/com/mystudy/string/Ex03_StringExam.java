package com.mystudy.string;

public class Ex03_StringExam {

	public static void main(String[] args) {
		//String str = "901012-1234567"; //주민번호
		//1. 전체자리수 14개 여부확인, '-'위치: 7번째 여부 확인
		//2. 생년월일 출력(1-2:년도, 3-4:월, 5-6:일)
		//   예) 90년 10월 12일 또는 1990년 10월 12일
		//3. 성별 확인하고 출력(1,3: 남성, 2,4: 여성)  if홀수=남자 짝수=여자
		//4. 데이터 값 검증(월: 1~12, 일: 1~31)      
		//참고) int num = Integer.parseInt("10"); //"10" -> 10
		//---------------------------------------------------
		// 			  01234567890123
		String str = "900131-2234567";
		System.out.println(str);
		//1. 전체자리수 14개 여부확인, '-'위치: 7번째 여부 확인	
		
		if (str.length() == 14) {
			System.out.println("[정상] 전체길이 14자리");
		} else {
			System.out.println("[비정상] 전체길이 " + str.length());
			//return; 
			//반복문의 break와 비슷함. 주석처리 안 하면 비정상일 경우 이거만 뜸.
		}
		
		// '-'위치 : 7번째 여부 확인 (str.substring() 사용)
		// 7번째 문자가 '-' 이냐?
		if (str.substring(6, 7).equals("-")) {
			System.out.println("[정상] 7번째 문자 '-'");
		} else {
			System.out.println("[비정상2] 7번째 문자 " + str.substring(6, 7));
		}
		
		// 7번째 문자가 '-' 문자가 아니냐? 
		// 위의 처리와 같으나 "-"가 앞에오는게 좀더 안전함
		if (!"-".equals(str.substring(6, 7))) {
			System.out.println("[비정상3] 7번째 문자 " + str.substring(6, 7));
		} 
		//-------------------------------------------
		System.out.println("str.indexOf('-') : " + str.indexOf('-'));
		if (str.indexOf('-') != 6) {
			System.out.println("[비정상4] '-' 문자위치가 7번째가 아님.");
		} 
		
		System.out.println("str.charAt(6) : " + str.charAt(6));
		if (str.charAt(6) != '-') {
			System.out.println("[비정상5] 7번째 문자 '-' 아님" + str.charAt(6));
		}
			
		System.out.println("2. 생년월일 출력 =========");
		//2. 생년월일 출력(1-2:년도, 3-4:월, 5-6:일)		
		String yymmdd = str.substring(0, 6);
		System.out.println("yymmdd : " + yymmdd);
		
		String yy = str.substring(0, 2);
		String mm = str.substring(2, 4);
		String dd = str.substring(4, 6);
		
		System.out.println(yy + "년 " + mm + "월 " + dd + "일");
		
		char charFlag = str.charAt(7);
		String yyyy = "";
		System.out.println(charFlag == 1);
		
		if (charFlag == '1' || charFlag == '2') {
			System.out.println("19" + yy + "년 " + mm + "월 " + dd + "일");
			yyyy = "19" + yy;
		} else if (charFlag == '3' || charFlag == '4') {
			//System.out.println("20" + yy + "년 " + mm + "월 " + dd + "일");
			yyyy = "20" + yy;
		}
		
		String flag = str.substring(7, 8); 		// flag : 2
		System.out.println("flag : " + flag);
		if ("1".equals(flag) || "2".equals(flag)) {
			yyyy = "19" + yy;
		} else if ("3".equals(flag) || "4".equals(flag)) {
			yyyy = "20" + yy;
		}
		System.out.println(yy + "년 " + mm + "월 " + dd + "일");
		
		System.out.println("3. 성별확인 =========");
		//3. 성별 확인하고 출력(1,3: 남성, 2,4: 여성)
		char gender = str.charAt(7);
		if (gender == '1' || gender == '3') {
			System.out.println("주민등록번호(첫글자) : " + gender + " 남성");
		} else if (gender == '2' || gender == '4') {
			System.out.println("주민등록번호(첫글자) : " + gender + " 여성");
		} else {
			System.out.println("주민등록번호(첫글자) : " + gender + " 외국인");
		}
		
		switch (gender) { 
		case '1':
		case '3':
			System.out.println("주민등록번호(첫글자) : " + gender + " 남성");
			break;
		case '2':
		case '4':
			System.out.println("주민등록번호(첫글자) : " + gender + " 여성");
			break;
		default:
			System.out.println("주민등록번호(첫글자) : " + gender + " 외국인");
		}
		
		int num = Integer.parseInt(str.substring(7, 8));
		if (num % 2 == 0) {
			System.out.println("성별 : 여자");
		} else if (num % 2 == 1){
			System.out.println("성별 : 남자");
		}
		
		System.out.println("4. 월, 일 값 검증 =========");
		//4. 데이터 값 검증(월: 1~12, 일: 1~31)
		
		String sMonth = str.substring(2, 4);
		String sDay = str.substring(4, 6);
		
		int month = Integer.parseInt(sMonth);
		if (month >= 1 && month <= 12) {
			System.out.println("[정상] 월 데이터 (1~12)");
		} else {
			System.out.println("[비정상] 월 데이터 : " + month);
		}
		
		int date = Integer.parseInt(sDay);
		if (date >= 1 && date <= 31) {
			System.out.println("[정상] 일자 데이터값 (1~31)");
		} 
		else {
			System.out.println("[비정상] 일자 데이터 : " + date);
		}
		
	}

}
