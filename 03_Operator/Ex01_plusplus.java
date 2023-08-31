
public class Ex01_plusplus {

	public static void main(String[] args) {
		// 증감연산자 : ++, --
		// 사용형태 : ++변수명, 변수명++, --변수명, 변수명--
		// ++ : 값을 1 증가 시킴
		// -- : 값을 1 감소 시킴
		// ++num; ----> num = num + 1; num에 1을 하나씩 증가시킨다.
		// ++변수명 앞에 붙어있으면 값을 1증가시킨 상태에서 연산에 참여한다
		// 변수명++ 뒤에 있으면 연산에 참여하고 값을 1증가시킴
		
		int num = 100; //num이라는 저장공간에 100이라는 숫자가 저장되어있음.
		System.out.println("num : " + num);
		
		num = num + 1; //우측이 먼저 처리됨 > 101 -> 그리고 num에 치환된다.
		System.out.println("num = num + 1 :" + num);
		System.out.println("---------");
		
		// ++,-- 연산자 단독사용시 항상 1증가 또는 감소
		num = 100;
		System.out.println("num : " + num);
		++num; // num = num + 1;
		System.out.println("++num : " + num);
		System.out.println("---------");
		
		num = 100;
		System.out.println("num : " + num);
		num++; // num = num + 1;
		System.out.println("num++ : " + num);
		System.out.println("---------");
		
		System.out.println("=========");
		// ++, -- 연산자가 연산식에 사용되는 경우
		// ++변수명 : 변수값이 1증가되고 증가된 상태에서 연산에 참여한다.
		// 변수명++ : 변수값이 연산에 사용되고 작업이 끝나고 나면 변수값이 1 증가됨
		
		int sum = 0;
		num = 100;
		System.out.println("num : " + num);
		sum = num++;
		System.out.println("sum = num++ : " + sum);
		System.out.println("num : " + num);
		// num에 100이 저장되어있음. 
		// ++가 변수명 뒤에 오면 100이 sum에 그대로 치환된다.
		// 그 다음에 1증가처리된다. 
		// > sum 값에는 영향을 주지 않는다. num은 100이 되지만
		System.out.println("---------");
		
		num = 100;
		System.out.println("num : " + num);
		sum = num++ + 5;
		//풀어 표현하면
		//sum = num + 5;
		//num = num + 1;
		System.out.println("sum = num++ + 5 : " + sum);
		System.out.println("num : " + num);
		System.out.println("---------");
		
		num = 100;
		System.out.println("num : " + num);
		sum = ++num;
		
		System.out.println("sum = ++num : " + sum);
		System.out.println("num : " + num);
		System.out.println("---------");

		num = 100;
		System.out.println("num : " + num);
		sum = ++num + 5;
		//num = num + 1; = num++; 또는 ++num;
		//sum = num + 5;
		
		
		System.out.println("sum = ++num + 5 : " + sum);
		System.out.println("num : " + num);
	
	}

}
