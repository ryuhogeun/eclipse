package operatorTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		두 정수를 입력 받아서 더 큰 수 구하기
		
		//입력 받아야할 변수 2개 이므로 두개의 변수 선언과 초기화
		int firstNumber = 0, lastNumber = 0;
		
		//삼항연산자를 사용할 것이기 때문에 true, false 값이 나와야하기에 boolean 타입으로 선언
		//두 수가 같을 경우도 있기에 두개를 선언
		boolean isBigger = false, isSame = false;
		
		//출력할 메세지를 변수에 담고, 마지막 결과값으로 나타낼 것 까지 String 타입으로 선언 및 초기화
		String message = "정수 두 개를 입력하세요", result = null;
		
		//입력 받아야하기에 Scanner
		Scanner sc = new Scanner(System.in);
		
		//메세지를 출력 메소드를 활용하여 출력하고, 입력 받을 두 정수 sc.nextInt();를 사용해서 선언해놓은 변수에 담기
		System.out.println(message);
		firstNumber = sc.nextInt();
		lastNumber = sc.nextInt();
		
		//위에 선언해놓은 boolean 타입에 관계연산자를 사용하여 클 경우, 같을 경우 담기
		isBigger = firstNumber > lastNumber;
		isSame = firstNumber == lastNumber;
		
		//result 변수에 삼항연산자를 활용하여 담기
		//firstNumber 가 더 크다면(isBigger가 참이면) "큰 값 :" + firestNumber 출력
		//거짓이면 : 뒤로 가서 isSame 보기 
		//두 수가 같으면(isSame이 참이면) "두 수가 같습니다" 출력
		//두 수가 다르다면 자동으로 lastNumber가 더 크므로 : 뒤에 있는 값 출력
		result = isBigger ? "큰 값 : " + firstNumber : isSame ? "두 수가 같습니다" : "큰 값 : " + lastNumber;
		
		System.out.println(result);
	}
}
