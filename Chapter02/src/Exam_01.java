/*
 * ����
 * �ڷ��� �����̸� = ��;
 * 
 * �ڷ���
 * �ڹ��� 8�� �⺻ �ڷ���
 * ����Ÿ�� (Primitive type)
 * boolean true / false 1byte
 * char ������ unsigned 2byte
 * byte ���� -128 ~ 127 1byte
 * short ���� -32768 ~ 32767 2byte
 * int ���� -2147483648 ~ 2147483647( -21�� ~ + 21��) 4byte
 * long ���� 8byte
 * float �Ǽ� 4byte
 * double(�⺻ Ÿ��) �Ǽ� 8byte
 * 
 * 
 * ����Ÿ�� (Reference Type)
 * ���� Ÿ���� ������ Ÿ�Ե�(���ڿ�, �迭, ����, Ŭ����, �������̽�)
 * 
 * */
public class Exam_01 {

	public static void main(String[] arg) {
		//byte a = 1;
		byte a;
		a = 1;
		
		boolean b = false ; //true
		byte c = 127; // -128 ~ 127
		short d = 32767; // -32768 ~ 32767
		int e = 100;
		long f = 100L;
		
		float g = 3.14f; //
		double h = 3.14;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " +d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		System.out.println("h = " + h);
	}
	
}
