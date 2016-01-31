package staffreport;

import static org.junit.Assert.*;

import org.junit.Test;

public class HrListTest {

	@Test
	public void testMain() {
		HrList window = new HrList("boss", 100);
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

	@Test
	public void testHrList() {
		HrList window = new HrList("boss", 100);
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

	@Test
	public void testTable() {
		HrList window = new HrList("boss", 100);
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

}
