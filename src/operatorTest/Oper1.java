package operatorTest;

public class Oper1 {
	public static void main(String[] args) {
		//자료형 boolean 타입 결과값이 true, false로 나온다
		//최단산쉬관리삼대 관계 연산자가 대입 연산자 보다 먼저 계산!
		boolean isTrue = 10 > 11;
		
		//10과 11은 다르므로 false
		System.out.println(10 == 11);
		
		//10과 11은 다르므로 true
		System.out.println(10 != 11);
		
		//boolean isTrue = 10 > 11; 여기서 10 > 11 을 값으로 봐야한다 
		//값은 false 가 나온다
		System.out.println(isTrue);
		
		//&&는 둘 다 true 여야 true
		//false && true 이기 때문에 값은 false
		System.out.println(isTrue && 10 == 10);
		
		//||는 하나라도 true 면 true
		//false || true 이기 때문에 값은 true
		System.out.println(isTrue || 10 == 10);
		
		//true가 나오도록 수정
		//방법은 많음.&&를 ||로 바꿔도 true
		System.out.println(!isTrue && 10 == 10);
	}
}
