package operatorTest;

public class Oper5 {
	public static void main(String[] args) {
		int data = 10;
		
		//후위형 다음 줄 부터 증가
//		System.out.println(data++);
		
		//전위형 그 줄부터 즉시 증가
		System.out.println(++data);
		
		//둘 다 써도 상관 없을 땐 대게 후위형으로 쓴다
		//전위형으로 쓰면 뭔가 그 줄에 무슨 일이 일어날 거 같아!!
		System.out.println(data);
	}
}
