import static org.junit.Assert.*;

import org.junit.Test;

public class RentalAnalysisTest {

	@Test
	public void testAveMonthlyRentalDur() {
		assertEquals("Fail1", 28, RentalAnalysis.aveMonthlyRentalDur(),  0.0);
		assertEquals("Fail2", 26, RentalAnalysis.aveMonthlyRentalDur(), 0.0);
	}
	
	@Test
	public void testTotalRev() {
		assertEquals("Fail1", 10497.5, RentalAnalysis.totalRev(), 0.0);
		assertEquals("Fail2", 12160.0, RentalAnalysis.totalRev(), 0.0);
	}

}
