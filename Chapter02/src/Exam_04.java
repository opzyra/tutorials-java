/*
 * 형변환
 * 자료형의 크기를 부등호로 순서지어 나열하면
 * byte < short < int < long < float < double < String
 * 
 * */
public class Exam_04 {
	public static void main(String[] args) {
		float ff = 1;
		System.out.println(ff); // 1.0
		
		int ii = (int)ff;
		System.out.println(ii);
		
		int x = 130;
		long y = x;  // promotion(자동변환)
		byte z = (byte)x; // casting 
		
		System.out.println(x);
		System.out.println(z); // 자료의 손실이 발생한다!
		char a = 65; // A
		short b = (short)a; // -32768 ~ 32767
		System.out.println(a);
		
		byte c = 100;
		short d = c;
		char e = (char)c;
		
		System.out.println(d);
		System.out.println(e);
		
		long f = 100L;
		float g = f;
		System.out.println(g); // 실수부가 생긴다!
		
		float h = 3.14f;
		
		long i = (long)h;
		
		System.out.println(i); // 실수부는 사라진다.
		
	}
}
