package staffreport;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneralListTest {

	@Test
	public void testMain() {
		GeneralList window = new GeneralList("boss", 100);
		window.frmStaffReport.setVisible(true);
		assertNotNull(window);
	}

	@Test
	public void testGeneralList() {
		GeneralList window = new GeneralList("boss", 100);
		window.frmStaffReport.setVisible(true);
		assertNotNull(window);
	}

}
