package controllTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		// 두 정수 입력받고 대소비교
		
		//두 정수 대소비교, 
		
		//입력받을 두 변수 선언
		int firstNumber = 0, lastNumber = 0;
		
		//출력 메소드에 담을 메세지, 결과 값 담을 변수 선언
		String message = "두 정수 입력 : ", resultMessage = null;
		
		//입력 받아야하기에 Scanner
		Scanner sc = new Scanner(System.in);
		
		//입력해라고 출력하고 정수이기에 sc.nextInt();
		System.out.print(message);
		firstNumber = sc.nextInt();
		lastNumber = sc.nextInt();
		
		//if문 활용, 조건식이 비교 연산자 이고 여러개의 조건식을 활용해야 하기에 사용
		//else if를 쓰는 경우는 위에 조건식이 참이면 밑으로는 검사하지 않기 위해
		//if를 쓰면 모두 검사함
		if(firstNumber > lastNumber) {
			resultMessage = "큰 값 : " + firstNumber;
			
		}else if(firstNumber != lastNumber) {
			resultMessage = "큰 값 : " + lastNumber;
			
		}else {
			resultMessage = "두 수가 같습니다.";
		}
		
		System.out.println(resultMessage);
		
	}
}
