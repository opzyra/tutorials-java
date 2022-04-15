import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 성적처리 프로그램
 * 
 * 3명의 국어, 영어, 수학 성적을 입력받아 각 학생의 총점과 평균을 계산하여 출력하는 프로그램을 구현하시오.
 * 
 * <입력>
 * 학생1
 * 국어 = 
 * 영어 = 
 * 수학 = 
 * 
 * 학생2
 * 국어 = 
 * 영어 = 
 * 수학 = 
 * 
 * 학생3
 * 국어 = 
 * 영어 = 
 * 수학 = 
 * 
 * <출력>
 * 학생1
 * 총점 = 
 * 평균 = 
 * 
 * 학생2
 * 총점 = 
 * 평균 = 
 * 
 * 학생3
 * 총점 = 
 * 평균 = 
 * 
 * <처리조건>
 * 1. 다차원배열을 활용할것
 * 2. 평균은 소숫점 두째자리까지 표현할것
 * 
 * */
public class Exam_07 {
	public static void main(String[] args) throws IOException {
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int [][] score = new int[3][3];
		int [] sum = new int[3];
		float [] avg = new float[3];
		
		// 입력 - 처리
		for(int i = 0; i < score.length; i++) {
			System.out.println("학생" + (i+1));
			System.out.print("국어 = ");
			score[i][0] = Integer.parseInt(in.readLine());
			
			System.out.print("영어 = ");
			score[i][1] = Integer.parseInt(in.readLine());
			
			System.out.print("수학 = ");
			score[i][2] = Integer.parseInt(in.readLine());
			
			sum[i] = score[i][0] + score[i][1] + score[i][2];
			avg[i] = sum[i] / 3.0f;
		}
		
		System.out.println();
		
		// 출력
		for(int i = 0; i < sum.length; i++) {
			System.out.println("학생" + (i+1));
			System.out.println("총점 = " + sum[i]);
			System.out.printf("평균 = %.2f", avg[i]);
			System.out.println();
		}
		
	}
}
