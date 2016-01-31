package staffreport;

import static org.junit.Assert.*;

import org.junit.Test;

public class WorkTabTest {

	@Test
	public void testMain() {
		WorkTab window = new WorkTab(100, 301, "boss");
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

	@Test
	public void testWorkTab() {
		WorkTab window = new WorkTab(100, 301, "boss");
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

}
