import static org.junit.Assert.*;

import org.junit.Test;

public class RentalAnalysisTest {

	@Test
	public void testAveMonthlyRentalDur() {
		assertEquals("Fail1", RentalAnalysis.aveMonthlyRentalDur(), 28 , 0.0);
		assertEquals("Fail2", RentalAnalysis.aveMonthlyRentalDur(), 26 , 0.0);
	}
	
	@Test
	public void testTotalRev() {
		assertEquals("Fail1", RentalAnalysis.totalRev(),10497.5 , 0.0);
		assertEquals("Fail2", RentalAnalysis.totalRev(),12160.0 , 0.0);
	}

}
