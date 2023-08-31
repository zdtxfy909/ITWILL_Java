package com.mystudy.ex02_extends;

class Web_Mp3Phone extends Mp3Phone {

	//생성자 정의
	public Web_Mp3Phone(String phoneNo) {
		super("Web_Mp3Phone 타입", phoneNo);
	}
	
	public Web_Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo);
	}

	public void webSearch() {
		System.out.println(">> WebPhone - 웹검색");
		
	}
	
	
}
