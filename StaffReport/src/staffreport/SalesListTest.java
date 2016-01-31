package staffreport;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalesListTest {

	@Test
	public void testMain() {
		SalesList window = new SalesList("boss", 100);
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

	@Test
	public void testSalesList() {
		SalesList window = new SalesList("boss", 100);
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

}
