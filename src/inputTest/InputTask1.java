package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		 두 정수를 입력한 뒤 덧셈 결과 출력
//		 단, next()만 사용
		
		//사용할 변수 선언, 첫번째 정수, 두번째 정수, 결과
		int firstNumber = 0, lastNumber = 0, result = 0;
		//출력 메소드에 들어갈 메세지를 변수로 담기
		String firstNumberMsg = "첫번째 정수 : ", lastNumberMsg = "두번째 정수 : ";
		//입력 메소드를 사용해야하기 때문에 import 선언
		Scanner sc = new Scanner(System.in);
		
		//첫번재 정수 입력
		System.out.print(firstNumberMsg);
		firstNumber = Integer.parseInt(sc.next());
		
		//두번째 정수 입력
		System.out.print(lastNumberMsg);
		lastNumber = Integer.parseInt(sc.next());
		
		//두 정수의 합을 결과 값에 저장하기
		result = firstNumber + lastNumber;
		
		//위에서 한 것들을 출력하기
		//변수에 담겨 있는 값을 출력 메소드에 출력하고 싶으니 서식문자를 사용
		System.out.printf("%d + %d = %d", firstNumber, lastNumber, result);
		
	}
}
