package staffreport;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class GeneralList {

	JFrame frmStaffReport;
	protected static String username;
	private JTextField user;
	protected static int id_user;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneralList window = new GeneralList(username, id_user);
					window.frmStaffReport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param username 
	 * @param id 
	 */
	
	public GeneralList(String username, int id_user) {
		initialize(username, id_user);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param username 
	 * @param id 
	 */
	
	private void initialize(String username, int id_user) {
		frmStaffReport = new JFrame();
		frmStaffReport.getContentPane().setBackground(Color.WHITE);
		frmStaffReport.setResizable(false);
		frmStaffReport.setTitle("STAFF REPORT");
		frmStaffReport.setBounds(100, 100, 939, 607);
		frmStaffReport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStaffReport.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u039D\u039F\u039C\u0399\u039A\u039F \u03A4\u039C\u0397\u039C\u0391");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LawList window = new LawList(username, id_user);
				window.frmStaffreport.setVisible(true);
				frmStaffReport.setVisible(false);
			}
		});
		btnNewButton.setBounds(384, 141, 212, 43);
		frmStaffReport.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\u03A4\u039C\u0397\u039C\u0391 \u03A0\u03A9\u039B\u0397\u03A3\u0395\u03A9\u039D");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalesList window = new SalesList(username, id_user);
				window.frmStaffreport.setVisible(true);
				frmStaffReport.setVisible(false);
			}
		});
		button.setBounds(384, 222, 212, 43);
		frmStaffReport.getContentPane().add(button);
		
		JButton btnMarketing = new JButton("\u03A4\u039C\u0397\u039C\u0391 MARKETING");
		btnMarketing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MarkList window = new MarkList(username, id_user);
				window.frmStaffreport.setVisible(true);
				frmStaffReport.setVisible(false);
			}
		});
		btnMarketing.setBounds(384, 305, 212, 43);
		frmStaffReport.getContentPane().add(btnMarketing);
		
		JButton btnHumanResource = new JButton("HUMAN RESOURCE");
		btnHumanResource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HrList window = new HrList(username, id_user);
				window.frmStaffreport.setVisible(true);
				frmStaffReport.setVisible(false);
			}
		});
		btnHumanResource.setBounds(384, 386, 212, 43);
		frmStaffReport.getContentPane().add(btnHumanResource);
		
		JLabel label = new JLabel("");
		label.setBounds(262, 173, 212, 43);
		frmStaffReport.getContentPane().add(label);
		
		JButton btnLogOut = new JButton("log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn window = new LogIn();
				window.frmStaffReport.setVisible(true);
				frmStaffReport.setVisible(false);
			}
		});
		btnLogOut.setBounds(29, 524, 84, 25);
		frmStaffReport.getContentPane().add(btnLogOut);
	
		user = new JTextField();
		user.setEditable(false);
		user.setBackground(new Color(255, 255, 255));
		user.setBounds(756, 54, 116, 22);
		frmStaffReport.getContentPane().add(user);
		user.setColumns(10);
		user.setBorder(null);
		
		user.setText(username);
	}
}