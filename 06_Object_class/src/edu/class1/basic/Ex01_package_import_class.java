/* package 선언문 : java 파일의 유의미한 맨 첫번째에 위치하며 한 번만 작성한다. 
 * 자바(class) 파일의 위치를 나타낸다.
 * 일반적으로 회사의 도메인명을 반대로 적용해서 사용한다.
 * 작성예) com.naver.project, com.itwill.mystudy
 * 사용하는 이유는 클래스를 구분하기 위해서. 클래스 이름은 중복될 수 있으니
 */
package edu.class1.basic;

/* import 선언문 : 선택항목이지만 일반적으로 사용한다.
 * String, System은 java.lang 패키지에 있음->굳이 import 안해줘도 자동으로 들어감
 * java.lang 이외에 패키지에 있는 타입 사용시 쓴다. 
 * import java.util.*; -> 대표문자(wild card) * 사용 가능
 java.util.패키지에 있는 거 다~ 하지만 명시적으로 써주는게 좋음
 */
import java.util.Scanner; //java.util에 있는 Scanner를 가져다가 써라.

// class 선언문 : 필수 항목. 선언문장은 꼭 있어야하지만 내용은 없어도 된다.
public class Ex01_package_import_class {

	public static void main(String[] args) {
		//java.util.Scanner scan = new java.util.Scanner(System.in); 
		//대문자로 시작 > 클래스 아니면 인터페이스
		//Scanner만 쓰면 오류뜸. 어디에서 가져온 건지 적어줘야함. java.util.Scanner
		//import 해주면 간단하게 적을 수 있음
		Scanner scan = new Scanner(System.in); 
		System.out.print(">> 인사말 : ");

		String hello = scan.nextLine(); 
		System.out.println("인사말출력 : " + hello);
	}

}
