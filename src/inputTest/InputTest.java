package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
//		초기값 : 어떤 값을 넣을 지 아직 모를 때
//		정수 : 0
//		실수 : 0.0
//		문자 : ' '
//		문자열 : null 또는 ""
		
		//입력받아야 하기에 import 선언
		Scanner sc = new Scanner(System.in);
		//String 타입의 name 변수 선언 후 null 로 초기화
		String name = null;
		//String 타입의 firstName 변수 선언 후 null 로 초기화
		String firstName = null;
		
		//이름을 입력해라고 알려주기 위해 출력 메소드 사용
		System.out.print("이름 : ");
		//name 변수에 저장될 값 입력 받기 nextLine 은 엔터로 구분
		name = sc.nextLine();
		//입력 받은 값이 name에 저장되었기에 입력 받은 값 출력
		System.out.println(name + "님 환영합니다");
		
		//sc.next 는 띄어쓰기로 구분
//		name = sc.next();
//		firstName = sc.next();
//		System.out.println(name + firstName + "님 환영합니다.");
	}
}
