import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 배열의 동적할당
 * (가변배열)
 * 
 * N개의 정수를 입력받아 가장 큰수를 출력하는 프로그램을 작성하시오.
 * 
 * */
public class Exam_05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int number;
		int max = 0;
		
		// 입력
		System.out.print("입력수 = ");
		number = Integer.parseInt(in.readLine());
		
		int[] score = new int[number];
		
		for(int i = 0; i<score.length; i++) {
			System.out.print("정수 #" + (i+1) + " = ");
			score[i] = Integer.parseInt(in.readLine());
		}
		
		// 처리
		for(int i = 0; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		// 출력
		System.out.println("가장큰 수 = " + max);
	}
}
