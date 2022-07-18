package operatorTest;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
//		심리 테스트
		/*
		 * Q. 당신이 좋아하는 색을 선택하세요.
		 * 1. 빨간색
		 * 2. 노란색
		 * 3. 검은색
		 * 4. 흰색
		 * 
		 * 빨간색 : 불같고 열정적이고 적극적이다.
		 * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
		 * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
		 * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
		 * 
		 */
		
		String message = "Q. 당신이 좋아하는 색을 선택하세요.";
		String choiceMessage = "1. 빨간색\n2.노란색\n3.검은색\n4.흰색";
		String redMessage = "불같고 열정적이고 적극적이다."; 
		String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다."; 
		String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다."; 
		String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMessage = "다시 입력해주세요.";
		String resultMessage = null;
		
		//정수를 입력받아야하기에 정수형 타입의 변수 하나 선언
		int choice = 0;
		
		//입력 받아야하기에 Scanner
		Scanner sc = new Scanner(System.in);
		
		//심리테스트 질문지 출력
		System.out.println(message + "\n" + choiceMessage);
		
		//입력 받을 정수를 담을 변수 선언
		choice = sc.nextInt();
		
		//삼항 연산자를 사용 조건식 ? 참 : 거짓
		//조건식 1이 거짓일 때 거짓으로 가서 다시 조건식을 쓰고 그것을 반복
		//마지막에 1~4까지 수가 아닐경우 에러메세지 출력
		resultMessage = choice == 1 ? redMessage : 
			choice == 2 ? yellowMessage :
				choice == 3 ? blackMessage : 
					choice == 4 ? whiteMessage : errorMessage;
		
		System.out.println(resultMessage);
	}
}


















