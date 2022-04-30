package employee;

public class Sales extends Employee {

	private int salary;
	private int salesResut;
	private float rate;
	
	public Sales(String name, int salary, int salesResut, float rate) {
		super(name);
		this.salary = salary;
		this.salesResut = salesResut;
		this.rate = rate;
	}

	public int getSalesResut() {
		return salesResut;
	}



	public void setSalesResut(int salesResut) {
		this.salesResut = salesResut;
	}



	public float getRate() {
		return rate;
	}



	public void setRate(float rate) {
		this.rate = rate;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public int getSalary() {
		return salary + (int)(salesResut*rate);
	}

	@Override
	public String getEmployeeType() {
		return "영업직";
	}

}
