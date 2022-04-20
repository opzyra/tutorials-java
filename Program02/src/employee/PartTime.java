package employee;

public class PartTime extends Employee {
	
	private int timePay;
	private int time;

	public PartTime(String name, int timePay, int time) {
		super(name);
		this.timePay = timePay;
		this.time = time;
	}

	@Override
	public void showSalary() {
		// TODO Auto-generated method stub
		showName();
		System.out.println("salary :" + getSalary());
	}

	@Override
	public int getSalary() {
		return timePay * time;
	}

}
