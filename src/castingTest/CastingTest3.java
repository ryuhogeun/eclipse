package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
		//"1" + 3의 값을 출력 문자열과 정수의 덧셈은 연산이 아니라 연결. 그러므로 13이 나온다.
		System.out.println("1" + 3);
		
		//"1" + 3 + 8의 값을 출력 연산은 왼쪽에서 오른쪽으로 된다. "1"+ 3 은 "13" + 8 은 138
		System.out.println("1" + 3 + 8);
		
		//"1" + (3 + 8)의 값을 출력, 소괄호로 쌓여있는 최우선 연산자 부터 계산, "1" + 11 은 "111"
		System.out.println("1" + (3 + 8));
		
		//"1 더하기 3은" + (1 + 3)의 값을 출력, 소괄호로 쌓여있는 최우선 연산자 먼저 계산,
		//(1 + 3)은 연산, "1 더하기 3은" + 4 는 연결
		System.out.println("1 더하기 3은 " + (1 + 3));
	}
}
