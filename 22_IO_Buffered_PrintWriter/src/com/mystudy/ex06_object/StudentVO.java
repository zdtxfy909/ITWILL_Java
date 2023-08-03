package com.mystudy.ex06_object;

import java.io.Serializable;

/* 직렬화 (Serialization)/ 역직렬화(Deserialization)
	- 직렬화 : JVM 메모리에 있는 객체를 바이트스트림으로 변환하는 작업
	- 역직렬화 : 바이트스트림 데이터를 자바 객체로 사용하기 위해 변환하는 작업
	---------------------
	데이터 전송을 위해서는 직렬화 처리가 가능해야한다. Serializable 형식만 가능하다.
	- Serializable 인터페이스를 구현하면 된다.
	데이터 직렬화 처리시 제외할 데이터는
	- transient 처리를 하면 된다.
	transient 처리해도 전달되는 데이터 : static, final 처리된 데이터는 전달이 된다.
 */

public class StudentVO implements Comparable<StudentVO>, Serializable {
	//만들어진 데이터가 읽어서 사용될 때 InvalidClassException 발생할 수 있다.
	// (serialVersionUID가 다른 경우에) ---> UID가 일치해야됨.
	//private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 111L;
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//transient : 데이터 전송시 값 전달 제외
	transient private String phoneNo;
	
	//생성자 마음대로 만들기
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeToAvg(); //데이터가 들어오면 자동으로 계산처리 해라.
	}
	

	//메소드 마음대로 만들기
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		computeToAvg(); 
		//국어점수가 바뀔 때마다 자동으로 계산처리하겠다. StudentSetManagerMain에서
		//데이터 바꿔도 알아서 총점, 평균 수정됨.
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		computeToAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		computeToAvg();
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + ", phoneNo=" + phoneNo + "]";
	}


	public void computeToAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
	
	@Override
	public int hashCode() {
		System.out.println(":: hashCode() 실행");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(":: equals() 실행~~~");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentVO other = (StudentVO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(StudentVO o) {
		return this.name.compareTo(o.name);
	}	
	
	
	
	
}
