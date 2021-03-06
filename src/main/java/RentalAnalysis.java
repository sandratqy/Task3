import java.util.ArrayList;

public class RentalAnalysis {
	
	public static ArrayList<RentalRecord> createRecords() {
		ArrayList<RentalRecord> r = new ArrayList<RentalRecord>();
		r.add(new RentalRecord("Honda Fit", "Jul", 1543.75, 25));
		r.add(new RentalRecord("Honda Fit", "Aug", 1235.00, 20));
		r.add(new RentalRecord("Honda Fit", "Sep", 1235.00, 20));
		r.add(new RentalRecord("Honda Fit", "Oct", 1543.75, 25));
		r.add(new RentalRecord("Honda Fit", "Nov", 1852.50, 30));
		r.add(new RentalRecord("Honda Fit", "Dec", 3087.50, 50));
		r.add(new RentalRecord("Toyota Wish", "Jul", 1140.00, 15));
		r.add(new RentalRecord("Toyota Wish", "Aug", 1140.00, 15));
		r.add(new RentalRecord("Toyota Wish", "Sep", 1140.00, 15));
		r.add(new RentalRecord("Toyota Wish", "Oct", 2280.00, 30));
		r.add(new RentalRecord("Toyota Wish", "Nov", 2660.00, 35));
		r.add(new RentalRecord("Toyota Wish", "Dec", 3800.00, 50));
		
		return r;
	}
	
	public static double aveMonthlyRentalDur(String car) {
		
		ArrayList<RentalRecord> r = createRecords();
		int aveMonthlyRentalDur = 0;
		int j = 0;
		
		for (int i = 0; i < r.size(); i++){
			if (r.get(i).getCarType().equals(car)){
				aveMonthlyRentalDur += r.get(i).getRentalDuration();
				j++;
			}
		}
		
		return (double) (aveMonthlyRentalDur / j);
	}
	
	public static double totalRev(String car) {
		ArrayList<RentalRecord> r = createRecords();
		double totalRev = 0;
		
		for (int i = 0; i < r.size(); i++){
			if (r.get(i).getCarType().equals(car)){
				totalRev += r.get(i).getMonthlyRevenue();
			}
		}
		
		return totalRev;
	}
}
