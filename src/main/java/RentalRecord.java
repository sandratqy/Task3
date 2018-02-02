
public class RentalRecord {
	
	private String carType;
	private String month;
	private double monthlyRevenue;
	private int rentalDuration;
	
	public RentalRecord(String carType, String month, double monthlyRevenue, int rentalDuration) {
		this.carType = carType;
		this.month = month;
		this.monthlyRevenue = monthlyRevenue;
		this.rentalDuration = rentalDuration;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public double getMonthlyRevenue() {
		return monthlyRevenue;
	}

	public void setMonthlyRevenue(double monthlyRevenue) {
		this.monthlyRevenue = monthlyRevenue;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	
	
}
