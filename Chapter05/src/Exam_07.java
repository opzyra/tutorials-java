import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 다차원배열의 활용
 * 
 * 3명의 성적을 입력받아 총점과 평균을 계산하여 출력하는 프로그램을 구현하시오.
 * */
public class Exam_07 {
	public static void main(String[] args) throws IOException {
		float [] avg = new float[3];
		int[][] sub = new int[3][4]; // int
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0; i < 3; i++){//3명의 성적을 입력받는다.
			System.out.print("국어 = ");
			sub[i][0] = Integer.parseInt(in.readLine());
			System.out.print("영어 = ");
			sub[i][1] = Integer.parseInt(in.readLine());
			System.out.print("수학 = ");
			sub[i][2] = Integer.parseInt(in.readLine());
			sub[i][3] = sub[i][0] + sub[i][1] + sub[i][2];
			avg[i] = sub[i][3] / 3.0f;
		}
		
		System.out.println();
		
		for(int i = 0; i < 3; i++){
			System.out.println("총점 = " + sub[i][3]);
			System.out.printf("평균 = %.2f\n", avg[i]);
			System.out.println();
		}
	}
}
