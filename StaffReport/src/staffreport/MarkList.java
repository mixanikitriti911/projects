package staffreport;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import staffreport.GeneralList;
import staffreport.LogIn;
import staffreport.NewWorker;
import staffreport.WorkTab;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MarkList {

	JFrame frmStaffreport;
	private JTable table;
	private JTextField user;
	protected static String username;
	protected static int id_user;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarkList window = new MarkList(username, id_user);
					window.frmStaffreport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param username 
	 * @param id_user 
	 */
	
	public MarkList(String username, int id_user) {
		initialize(username, id_user);
		table(id_user, username);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize(String username, int id_user) {
		frmStaffreport = new JFrame();
		frmStaffreport.setResizable(false);
		frmStaffreport.getContentPane().setBackground(Color.WHITE);
		frmStaffreport.setBackground(SystemColor.activeCaption);
		frmStaffreport.setTitle("STAFF REPORT");
		frmStaffreport.setBounds(100, 100, 939, 607);
		frmStaffreport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStaffreport.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(294, 164, 385, 294);
		frmStaffreport.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "\u0395\u03A0\u03A9\u039D\u03A5\u039C\u039F", "\u039F\u039D\u039F\u039C\u0391"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(65);
		table.getColumnModel().getColumn(1).setMinWidth(10);
		table.getColumnModel().getColumn(2).setPreferredWidth(65);
		scrollPane.setViewportView(table);
		
		JLabel lblHumanResource = new JLabel("\u03A4\u039C\u0397\u039C\u0391 MARKETING");
		lblHumanResource.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHumanResource.setBounds(417, 24, 175, 37);
		frmStaffreport.getContentPane().add(lblHumanResource);
		
		user = new JTextField();
		user.setEditable(false);
		user.setBackground(new Color(255, 255, 255));
		user.setBounds(756, 54, 116, 22);
		frmStaffreport.getContentPane().add(user);
		user.setColumns(10);
		user.setBorder(null);
		
		JButton btnLogOut = new JButton("log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn window = new LogIn();
				window.frmStaffReport.setVisible(true);
				frmStaffreport.setVisible(false);
			}
		});
		btnLogOut.setBounds(29, 524, 89, 25);
		frmStaffreport.getContentPane().add(btnLogOut);
		
		JButton btnBack = new JButton("Back");
		if(id_user==100)
			btnBack.setVisible(true);
		else btnBack.setVisible(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					GeneralList window = new GeneralList(username, id_user);
					window.frmStaffReport.setVisible(true);
					frmStaffreport.setVisible(false);
			}
		});
		btnBack.setBounds(29, 480, 89, 23);
		frmStaffreport.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("New Worker");
		if(id_user==100)
			btnNewButton.setVisible(true);
		else btnNewButton.setVisible(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id_worker = 0;
				NewWorker window = new NewWorker(id_user, id_worker, username);
				window.frmStaffreport.setVisible(true);
				frmStaffreport.setVisible(false);
			}
		});
		btnNewButton.setBounds(776, 524, 116, 24);
		frmStaffreport.getContentPane().add(btnNewButton);
	}
	
	private void table(int id_user, String username) {
		Connection connection;
        PreparedStatement wt;
        user.setText(username);
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "test123");
            wt = connection.prepareStatement("SELECT `ID`, `lastname`, `name` FROM `worker` WHERE `ID`>=200 AND `ID`<300 ");
            ResultSet worker = wt.executeQuery();
        
            while(worker.next()){
            	String id = worker.getString(1);
            	String lastname = worker.getString(2);
            	String name = worker.getString(3);
            	Object[] content = {id, lastname, name};
            	DefaultTableModel model=(DefaultTableModel) table.getModel();
            	model.addRow(content);
            	
            }
            
		}catch (SQLException ex) {
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
       table.addMouseListener(new java.awt.event.MouseAdapter(){
    	   public void mouseClicked(java.awt.event.MouseEvent e){
    		   int row=table.rowAtPoint(e.getPoint());
    		   String id_worker2 = table.getValueAt(row,0).toString();
    		   int id_worker = Integer.parseInt(id_worker2);
    		   WorkTab window = new WorkTab(id_user, id_worker, username);
    		   window.frmStaffreport.setVisible(true);
    		   frmStaffreport.setVisible(false);
    	   }
       });
	}
}