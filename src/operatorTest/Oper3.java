package operatorTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고, 정수라면 정수로 출력
//		실수라면 실수로 출력
//		예) 183 -> 183 출력
//			 183.5 -> 183.5 출력
//		삼항 연산자를 사용한다.
		
//		정수인지 실수인지 : 전체에서 진수부를 뺐을 때 0인지 아닌지 검사
//		3.5 - 3 = 0.5 -> 실수
//		3.0 - 3 = 0.0 -> 정수

		//키를 담을 변수 선언
		double height = 0.0;
		
		//정수인지 실수인지 판단할 식을 담을 변수 선언
		boolean check = false;
		
		//출력할 메세지를 담을 변수 선언, 마지막에 서식문자를 활용하여 출력 할 것이기에 String 타입으로 변수 하나 선언
		String message = "키 : ", format = null;
		
		//\n 도 변수에 담아서 사용하기
		char newLine = '\n';
		
		//입력 받을 것이기에 Scanner
		Scanner sc = new Scanner(System.in);
		
		//메세시 출력하고 실수를 입력 받을 것이기에 nextDouble 사용
		System.out.print(message);
		height = sc.nextDouble();
		
		//정수인지 실수인지 확인할 식, 입력받은 수와 진수부를 빼서 0이면 정수 아니면 실수
		check = height - (int)height == 0;
		
		//밑에 식으로 하면 삼항 연산자, 정수와 실수를 연산하면 무조건 값은 실수로 나온다
//		System.out.println(check ? (int)height : height);
		
		//%f 는 실수를 ""안에서 표현하는 서식문자
		//%.0f 는 소수점 없이 표현, %.2f 는 소수점 둘째자리까지 표현 
		format = check ? "%.0fcm%c" : "%.2fcm%c";
		
		System.out.printf(format, height, newLine);
	}
}











