import java.util.Scanner;

/*
 * 성적 처리 프로그램 1단계
 * 국어, 영어, 수학점수를 입력받아 총점과 평균을 계산하여 출력하는 프로그램
 * <입력방식>
 * 국어 = 
 * 영어 = 
 * 수학 = 
 * 
 * <출력방식>
 * 총점 = 
 * 평균 = 
 * 
 * 
 * <처리조건>
 * 1. 프로그램에 사용될 변수의 자료형과 초기값은 입출력형식을 이용하여 구현할것.
 * 2. 평균은 소숫점이하 둘째자리 까지 표현할 것.
 * 3. 기타 형식은 주어진 입출력 형식을 이용할 것.
 * */
public class Program_01 {
	public static void main(String[] args){
		//선언
		int korean;
		int english; 
		int math; 
		int sum;
		
		float avrage = 0.0f; 
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.print("국어 = ");
		korean = Integer.parseInt(sc.nextLine());
		System.out.print("영어 = "  );
		english = Integer.parseInt(sc.nextLine());
		System.out.print("수학 = ");
		math = sc.nextInt();
		
		//처리
		sum = korean + english + math;
		avrage = sum/3.0f; // 변수를 처리할때 자료의 프로모션과 캐스팅을 생각해야한다.
		
		//출력
		System.out.println();
		System.out.println("총점 = " + sum);
		System.out.printf("평균 = %.2f", avrage);
		
		sc.close();
		
	}
}
