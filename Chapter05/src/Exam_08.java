import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 다차원배열의 동적할당
 * */
public class Exam_08 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int [][] a = new int[2][];
		int num = 0;
		
		for(int i = 0; i < a.length; i++){
			System.out.print(i + "의 다차원배열 동적할당 수 = ");
			num = Integer.parseInt(in.readLine());
			
			a[i] = new int[num];
		}
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.println(a[i][j]);
				}
			}
		
	}
}
