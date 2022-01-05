package page34;

import java.util.Random;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		/*
		 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 
		 * 당신은 그들에게 슬픈 진실을 알려줘야 한다.

		 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
		 * 이어서 N명의 점수가 주어진다.
		 * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 * 
		 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~1000 사이의 숫자를 입력하세요");
		
		//입력받은 testCase의 수
		int testCase = sc.nextInt();
		sc.close();
		
		//testCase의 수 만큼 출력된 학생의 점수를 담을 배열 
		int[] arr = new int[testCase];
		
		//학생의 점수가 담긴 배열의 합
		int total = 0;
		
		//랜덤함수 선언
		Random random = new Random();

		//testCase만큼의 랜덤점수 담기, 출력, 합계
		for (int i = 0; i < testCase; i++) {
			
			arr[i] = random.nextInt(101);
			System.out.println(arr[i]);
			total += arr[i];

		}
		
		
		System.out.println("total: " + total);
		System.out.println("testCase: " + testCase);
		
		//평균점수
		double average = (double)total / (double)testCase;

		System.out.println("평균점수: " + average);
		
		//평균점수 이상의 학생비율
		double aboveAverage = 0;
		//평균점수 이상의 학생 수
		int cnt = 0;
		
		for (int i = 0; i < testCase; i++) {
	
			if (average < arr[i]) {
				
				cnt++;
				
			}
			
		}
		
		System.out.println("testCase: " + testCase);
		System.out.println("평균이상의 학생 수: " + cnt);
		//평균점수 이상의 학생비율
		aboveAverage = ( 100 / (double)testCase ) * (double)cnt;

		
		System.out.println("aboveAverage:" + aboveAverage);
		//평균점수 이상의 학생비율 반올림 셋째자리까지
		double aboveAverage_3f = Double.parseDouble(String.format("%.3f", aboveAverage));
		System.out.println("평균이상 학생비율: " + aboveAverage_3f);
		
	}//main

}//class
