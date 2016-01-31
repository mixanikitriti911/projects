package staffreport;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValuationTest {

	@Test
	public void testMain() {
		Valuation window = new Valuation(100, 301, "boss");
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

	@Test
	public void testValuation() {
		Valuation window = new Valuation(100, 301, "boss");
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

}
