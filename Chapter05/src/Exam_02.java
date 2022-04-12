/*
 * 	1차원 배열의 선언과 초기화
 */
public class Exam_02 {
	public static void main(String[] args) {
		//배열의 선언
		boolean[] a;
		int[] b;
		String[] c;
		float[] k;
		
		// 할당 실제 기억공간을 차지하는 작업
		a = new boolean[5]; // a[0], a[1], a[2], a[3], a[4] 
		b= new int[3]; // b[0], b[1], b[2]
		c = new String[3]; // c[0], c[1], c[2]
		
		//배열의 선언과 초기화 동시에 한다.
		int[] x = new int[5];
		int[] y = new int[]{10, 20, 30, 40, 50};
		c = new String[]{"국어", "영어", "수학"};
		String[] d = new String[]{"국어","영어","수학"};
	}
}
