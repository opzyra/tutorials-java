package employee;

// 개요를 선택했을때 필요한 정보를 객체로 담아 전달하기 위한 클래스
public class SummaryDTO {
	private int employeeCount;
	private int permanentCount;
	private int salesCount;
	private int partTimeCount;
	private int salarySum;
	
	public SummaryDTO(int employeeCount, int permanentCount, int salesCount, int partTimeCount, int salarySum) {
		this.employeeCount = employeeCount;
		this.permanentCount = permanentCount;
		this.salesCount = salesCount;
		this.partTimeCount = partTimeCount;
		this.salarySum = salarySum;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public int getPermanentCount() {
		return permanentCount;
	}

	public void setPermanentCount(int permanentCount) {
		this.permanentCount = permanentCount;
	}

	public int getSalesCount() {
		return salesCount;
	}

	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}

	public int getPartTimeCount() {
		return partTimeCount;
	}

	public void setPartTimeCount(int partTimeCount) {
		this.partTimeCount = partTimeCount;
	}

	public int getSalarySum() {
		return salarySum;
	}

	public void setSalarySum(int salarySum) {
		this.salarySum = salarySum;
	}
	
	
}
