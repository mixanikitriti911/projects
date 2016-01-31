package staffreport;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LogIn  extends JFrame{

	JFrame frmStaffReport;
	private JTextField user;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	 
	   
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.frmStaffReport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public LogIn() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		frmStaffReport = new JFrame();
		frmStaffReport.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmStaffReport.setResizable(false);
		frmStaffReport.setType(Type.POPUP);
		frmStaffReport.setTitle("STAFF REPORT");
		frmStaffReport.setBounds(100, 100, 754, 506);
		frmStaffReport.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(161, 127, 107, 32);
		frmStaffReport.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(161, 183, 107, 32);
		frmStaffReport.getContentPane().add(lblPassword);
		
		user = new JTextField();
		user.setColumns(10);
		user.setBounds(311, 135, 143, 32);
		frmStaffReport.getContentPane().add(user);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user.setText(null);
				password.setText(null);
				
			}
		});
		btnClear.setBounds(196, 328, 97, 25);
		frmStaffReport.getContentPane().add(btnClear);
		
		JButton btnLogIn = new JButton("log in");
		btnLogIn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Connection connection;
		        PreparedStatement ps;
		        try { 
		        	Class.forName("com.mysql.jdbc.Driver");
		            connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "test123");
		            ps = connection.prepareStatement("SELECT `username`, `password` , `id` FROM `login` WHERE `username` = ? AND `password` = ?");
		            ps.setString(1, user.getText());
		            ps.setString(2, String.valueOf(password.getText()));
		            ResultSet result = ps.executeQuery();
		            if(result.next()){
		            	int id_user = result.getInt("id");
		            	String username = result.getString("username");
		            	if(id_user==100)
		            	{
		            		GeneralList window = new GeneralList(username, id_user);
							window.frmStaffReport.setVisible(true);
							frmStaffReport.setVisible(false);
						}else if(id_user==200)
		            	{
							MarkList window = new MarkList(username, id_user);
							window.frmStaffreport.setVisible(true);
							frmStaffReport.setVisible(false);
						}else if(id_user==300)
		            	{
							SalesList window = new SalesList(username, id_user);
							window.frmStaffreport.setVisible(true);
							frmStaffReport.setVisible(false);
						}else if(id_user==400)
		            	{
							LawList window = new LawList(username, id_user);
							window.frmStaffreport.setVisible(true);
							frmStaffReport.setVisible(false);
						}else if(id_user==500)
		            	{
							HrList window = new HrList(username, id_user);
							window.frmStaffreport.setVisible(true);
							frmStaffReport.setVisible(false);
						}
		            }
		            else{
		            	JOptionPane.showMessageDialog(null, "Wrong Username or Password");
		            }
		        } catch (SQLException ex) {
		        } catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnLogIn.setBounds(440, 328, 97, 25);
		frmStaffReport.getContentPane().add(btnLogIn);
		
		password = new JPasswordField();
		password.setBounds(311, 187, 143, 32);
		frmStaffReport.getContentPane().add(password);
	}	
}