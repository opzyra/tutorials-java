/*
 * String Ÿ��
 * ���ڿ��� ��� �����ڷ���
 * �⺻�ڷ����� Boxing Ŭ���� parse
 * StringŬ������ valueOf �޼��带 ����ϸ� ��ȣ ��ȯ�� �����ϴ�.
 * 
 * ��ȯ�� �Ұ����Ѱ�� ������ �߻��Ѵ�!
 * */
public class Exam_05 {
	public static void main(String[] args) {
		String a = "abc";
		
		System.out.println(a);
		
		String b = "1";
		int c = Integer.parseInt(b);
		System.out.println(c + 1);
		
		int d = 1;
		String e = String.valueOf(d);
		System.out.println(e+1); // 11
	}
}
