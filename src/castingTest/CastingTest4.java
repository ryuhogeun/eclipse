package castingTest;

public class CastingTest4 {
	public static void main(String[] args) {
		//Integer.parseInt("1")은 문자열을 정수형으로 바꿔주는 강제 형변환 1 + 3 + 9 는 13
		System.out.println(Integer.parseInt("1") + 3 + 9);
		
//		"3.9" + 9 의 결과를 12.9로 출력한다.
		//문자열인 "3.9" 앞에 Double.parseDouble()을 붙여 실수형으로 만들고 +9를 하면 12.9가 나온다.
		System.out.println(Double.parseDouble("3.9") + 9);
		
		//Float.parseFloat()을 해도 값은 똑같다. 하지만 기본형은 Double.
		System.out.println(Float.parseFloat("3.9") + 9);
	}
}
