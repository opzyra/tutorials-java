/*
 * 반복문과 배열
 * 
 * */
public class Exam_03 {
	public static void main(String[] ar){
		boolean[] a = new boolean[5];
		int[] b = new int[3];
		String[] c = new String[7];
		
		// 배열의 크기는 length라는 속성을 이용한다.
		for(int i = 0; i < a.length; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();
		for(int i = 0; i < b.length; i++){
			System.out.println("b[" + i + "] = " + b[i]);
		}
		System.out.println();
		for(int i = 0; i < c.length; i++){
			System.out.println("c[" + i + "] = " + c[i]);
		}
	}
}
