
public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	// constructor
	public CommissionEmployee(String firstname, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, DateOfBirth date) {
		super(firstname, lastName, socialSecurityNumber, date);
		
		if(commissionRate <= 0.0 || commissionRate >= 1.0)  // validate
			throw new IllegalArgumentException("Commisiion rate must be >0.0 and <1.0");
		
		if(grossSales < 0.0)  // validate
			throw new IllegalArgumentException("Gross sales must be >0.0");
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	// set gross sales amount
	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0)  // validate
			throw new IllegalArgumentException("Gross sales must be >0.0");
		
		this.grossSales = grossSales;
	}
	
	 // return gross sales amount
	public double getGrossSales() {
		return grossSales;
	}
	
	 // set commission rate
	public void setCommissionRate(double commissionRate) {
		if(commissionRate <= 0.0 || commissionRate >= 1.0)  // validate
			throw new IllegalArgumentException("Commisiion rate must be >0.0 and <1.0");
		
		this.commissionRate = commissionRate;
	}
	
	// return commission rate
	public double getcommissionRate() {
		return commissionRate;
	}
	
	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings() {
		return getcommissionRate() * getGrossSales() + GetBirthdayBonus();
	}
	
	 // return String representation of CommissionEmployee object
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", 
							"commission employee",super.toString(),
							"gross sales",getGrossSales(), 
							"commission rate",getcommissionRate());
	}

}
