/*
 * ����ȯ
 * �ڷ����� ũ�⸦ �ε�ȣ�� �������� �����ϸ�
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
		long y = x;  // promotion(�ڵ���ȯ)
		byte z = (byte)x; // casting 
		
		System.out.println(x);
		System.out.println(z); // �ڷ��� �ս��� �߻��Ѵ�!
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
		System.out.println(g); // �Ǽ��ΰ� �����!
		
		float h = 3.14f;
		
		long i = (long)h;
		
		System.out.println(i); // �Ǽ��δ� �������.
		
	}
}
