package employee;

// 영업직 : 이름, 기본급, 인센티브(판매실적 * 보너스율)
public class Sales extends Employee {
	private int salary;
	private int salesResult;
	private float rate;
	
	
	public Sales(){
		
	}
	
	public Sales(String name, int salary, int salesResult, float rate){
		super(name);
		this.salary = salary;
		this.salesResult = salesResult;
		this.rate = rate;
	}
	
	public int getSalary(){
		return salary + (int)(salesResult*rate);
	}
	
	public void showSalary(){
		showName();
		System.out.println("salary :" + getSalary());
	}
}
