import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 성적처리 프로그램
 * 국어, 영어, 수학점수를 입력받아 총점과 평균을 계산하여 출력하는 프로그램을 구현하시오.
 * 
 * <처리조건>
 * 1. 배열을 이용할 것.
 * 2. 각 과목의 점수는 0 ~ 100사이만 입력받도록 한다.
 */
public class Exam_04 {
	public static void main(String[] ar) throws IOException{
		//선언문
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] sub = new int[4];
		//int kor = 0, eng = 0, math = 0, tot = 0;
		String[] title = new String[]{"국어", "영어", "수학"};
		float avg = 0.0f;
		
		//입력문
		for(int i = 0; i < title.length; i++){
			System.out.print(title[i] + " = ");
			sub[i] = Integer.parseInt(in.readLine()); 
			sub[3] += sub[i];
		}
		
		//처리문
		avg = sub[3] / 3.0f;
		
		//출력문
		System.out.println();
		System.out.println("총점 = " + sub[3]);
		System.out.printf("평균 = %.2f" , avg);
	}
}
