package operatorTest;

public class BitOper {
	public static void main(String[] args) {
		//2진법으로 둘 다 1이면 1
		System.out.println(10 & 11);
		//2진법으로 둘 중 하나만 1이면 1
		System.out.println(10 | 11);
		//2진법으로 둘이 서로 달라야 1
		System.out.println(10 ^ 11);
		//2진법으로 1은 0으로 0은 1로 ~a = -a-1
		System.out.println(~10);
	}
}
