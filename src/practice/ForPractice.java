package practice;

import java.util.Scanner;

public class ForPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, sum = 0, cnt = 0;
		double avg = 0.0;
		String msg = "두 정수 입력 : ";
		
		System.out.print(msg);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("양수만 입력하세요");
		}
		
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				if(i % 3 == 0 || i % 5 ==0) {
					cnt++;
					sum += i;
					avg = (double)sum/cnt;
				}
			}
		}else if(num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				if(i % 3 == 0 || i % 5 ==0) {
					cnt++;
					sum += i;
					avg = (double)sum/cnt;
				}
			}
		}else if(num1 == num2) {
			sum = num2;
			cnt++;
			avg = (double)sum/cnt;
		}
		
		System.out.printf("합계는 : %d\n평균은 : %.2f", sum, avg);
		
	
	
	
	
	
	}
}
