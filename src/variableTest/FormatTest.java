package variableTest;

public class FormatTest {
	public static void main(String[] args) {

//		이름, 나이, 몸무게 저장할 변수 선언
		//String 타입의 변수명 name 값 문자열 "한동석"
		String name = "한동석";
		
		//int 타입의 변수명 age 값 정수형 7
		int age = 7;
		
		//double 타입의 변수명 weight 실수형 76.2
		double weight = 76.2;
		
		//서식문자 활용, %s 는 String 타입을 불러오는 서식문자.
		System.out.printf("이름 : %s\n", name);
		
		//%d 는 정수형 불러옴. %02d 는 둘째 자리까지, %03d 는 셋째 자리까지.
		//%f 	는 실수형 불러옴. %.1f 는 소수점 첫째 자리까지, %.2f 는 소수점 둘째 자리까지.
		System.out.printf("나이 : %02d살\n몸무게 : %.1fkg", age, weight);
		
	}
}
