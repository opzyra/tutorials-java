import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 세수를 입력받아 가장 큰수를 출력하시오.
 * */
public class Exam_14 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int max = -999999999;
		
		// 입력
		System.out.print("첫번째 수 = ");
		num1 = Integer.parseInt(in.readLine());
		
		System.out.print("두번째 수 = ");
		num2 = Integer.parseInt(in.readLine());
		
		System.out.print("세번째 수 = ");
		num3 = Integer.parseInt(in.readLine());
		
		
		
		if(max < num1) {
			max = num1;
		}
		
		if(max < num2) {
			max = num2;
		}
		
		if(max < num3) {
			max = num3;
		}
		
//		if(num1 > num2 && num1 > num3) {
//			max = num1;
//		} else if(num2 > num3 && num2 > num1) {
//			max = num2;
//		} else {
//			max = num3;
//		}
		
		System.out.println("가장큰수 = " + max);
	}
}
