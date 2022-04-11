import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 두 개의 정수를 입력받아 큰수와 작은수를 비교하여 출력하는 프로그램을 구현하시오.
 * <입력형식>
 * 첫번째수 = 
 * 두번쨰수 = 
 * 세번째수 = 
 * <출력형식>
 * 큰수 = 
 * 작은수 = 
 */
public class Exam_11 {
	public static void main(String[] ar) throws IOException{
		//선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int su1 = 0, su2 = 0, su3 = 0, max = 0, min = 0;
		
		//입력
		System.out.print("첫번째수 = ");
		su1 = Integer.parseInt(in.readLine());
		System.out.print("두번째수 = ");
		su2 = Integer.parseInt(in.readLine());
		System.out.print("세번쨰수 = ");
		su3 = Integer.parseInt(in.readLine());
		
		//처리
		
		//2가지 이상 동일한 수 입력시 에러
		if(su1 == su2 || su1 == su3 ||su2 == su3){
			System.out.println("같은거 입력 ㄴㄴ");
			return;
			//su1이 가장큼
		}else if(su1 > su2 && su1 > su3){
			max = su1;
			//su2와 su3를 비교
			if(su2>su3){
				min = su3;
			}else{
				min = su2;
			}
			//su2가 가장큼
		}else if(su2 > su1 && su2 > su3){
			max = su2;
			//su1과 su3를 비교
			if(su1 > su3){
				min = su3;
			}else{
				min = su1;
			}
		}else{
			//su3이 가장큼
			max = su3;
			//su1과 su2비교
			if(su1>su2){
				min = su2;
			}else{
				min = su1;
			}
		}
		
		//출력
		System.out.println();
		System.out.println("큰수 = " + max);
		System.out.println("작은수 = " + min);
	}
}
