package grade;

public class Student {
	// 학생을 구별하는 식별자(유니크한 값)
	private int idx;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private float avg;
	
	public Student() {}
	
	public Student(int idx, String name, int kor, int eng, int math) {
		this.idx = idx;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor + eng + math;
		this.avg = (kor + eng + math) / 3.0f;
	}
	
	public int getIdx() {
		return this.idx;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getKor() {
		return this.kor;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public int getSum() {
		return this.sum;
	}
	
	public float getAvg() {
		return this.avg;
	}
	
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public void setAvg(float avg) {
		this.avg = avg;
	}
}
