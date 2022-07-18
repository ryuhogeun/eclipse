package controllTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		
//		브론즈
//   	1~100까지 출력
//     	for (int i = 0; i < 100; i++) {
//    	    System.out.println(i + 1);
// 		}
      
//     	100~1까지 출력
//   	for (int i = 0; i < 100; i++) {
//  		  System.out.println(100 - i);
//  	 }
      
//    	 1~100까지 중 짝수만 출력
		
		//짝수만 출력하기에 반인 50번만 반복하면 된다
//      for (int i = 0; i < 50; i++) {
//        //곱하기 2를 해버리면 짝수만 출력
//    	  System.out.println((i + 1) * 2);
//      }
      
//      실버
//      1~10까지 합 출력
//		//반복되는 값의 합을 담을 변수 하나 선언
//		int total = 0;
//		
//		//10번 반복
//		for (int i = 0; i < 10; i++) {
//			
//			//i +1 을 누적 연산
//			total += i + 1; 
////         	total = total + i + 1;
//			//1   : total = 0 + 1;
//			//2   : total = (0 + 1) + 2
//			//3   : total = (0 + 1 + 2) + 3
//		}
//			System.out.println(total);

		
		//1~n까지 합 출력
		
//		//n을 입력 받아야하기에 Scanner 선언
//		Scanner sc = new Scanner(System.in);
//		
//		//메세지를 담을 문자열 
//		String message = "1~n까지의 합\nn : ";
//		
//		//반복되는 값의 범위와 그 값을 누적 연산할 변수 정수형으로 선언
//		int end = 0, total = 0;
//      
//		System.out.printf(message);
//		end = sc.nextInt();
//      
//		//증감식에 입력 받은 값 넣기
//		for (int i = 0; i < end; i++) {
//			total += i + 1;
//		}
//      
//		System.out.println(total);
      
//   	 골드
//		A~F까지 출력
		
//		//A~F까지 6번 반복 
//		for (int i = 0; i < 6; i++) {
//			
//			//아스키코드를 활용하고 (char)로 형변환
//			System.out.println((char)(i + 65));
//		}
//      
//      A~F까지 중 C제외하고 출력
		
		//C를 제외하기에 5번 반복
//		for (int i = 0; i < 5; i++) {
//			
//			//C가 나오는 3번째 반복부터 C를 건너뛰고 DEF가 나와야 하기에 삼항 연산자 사용
//			System.out.println((char)(i > 1 ? i + 66 : i + 65));
//		}      
      
//      다이아
//      0 1 2 3 0 1 2 3 0 1 2 3 출력

		//a를 n으로 나눈 나머지는 0~n-1까지 나온다
//      a % n -> 0 ~ n-1
		
		//출력할 수가 12개 이니 12까지 반복
//		for (int i = 0; i < 12; i++) {
//			System.out.print(i % 4 + " ");
//		}
      
//      aBcDeFgHiJ....Z 출력
		
		//알파벳은 26개이므로 26번 반복
//		for(int i = 0; i < 26; i++) {
//			
//			//짝수번째 알파벳들이 대문자로 바뀐다 
//			//i를 2로 나눈 나머지가 0이면 짝수, 참이면 대문자 출력 거짓이면 소문자 출력(아스키코드 활용)
//			//값을 문자로 형변환하여 출력
//			System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));
//		}

	
	}
}
