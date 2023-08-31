
public class Ex04_short {

	public static void main(String[] args) {
		//정수형 short : 2byte (갯수 : 65536개, 범위 : -32768 ~ 32767)
		//범위가 좁아 일상적인 데이터 처리는 못한다.
		short short1 = 20000;
		short short2 = 30000;
		
		System.out.println("short1 : " + short1);
		System.out.println("short2 : " + short2);
		
		short sum = (short)(short1 + short2);
		System.out.println("short sum : " + sum);
		//표현범위 벗어났기 때문에 문법적으론 맞으나 값은 이상함.
		
		int sumInt = short1 + short2; 
		System.out.println("int sum : " + sumInt);
		
	}

}
