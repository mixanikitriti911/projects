package staffreport;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Valuation {

	JFrame frmStaffreport;
	private JTextField textlastname;
	private JTextField textname;
	private JTextField user;
	protected static String username;
	protected static int id_worker;
	protected static int id_user;
	private JTextField textField;
	private int a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Valuation window = new Valuation(id_user, id_worker, username);
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
	 * @param id_worker 
	 * @param id_user 
	 */
	public Valuation(int id_user, int id_worker, String username) {
		initialize(id_user, id_worker, username);
		table(id_worker);
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int id_user, int id_worker, String username) {
		
		frmStaffreport = new JFrame();
		frmStaffreport.setTitle("STAFF REPORT");
		frmStaffreport.getContentPane().setBackground(Color.WHITE);
		frmStaffreport.getContentPane().setForeground(new Color(255, 255, 255));
		frmStaffreport.setResizable(false);
		frmStaffreport.setBounds(100, 100, 939, 607);
		frmStaffreport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("\u0391\u039E\u0399\u039F\u039B\u039F\u0393\u0397\u03A3\u0397 \u03A4\u039F\u03A5");
		label.setBounds(166, 57, 157, 24);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textlastname = new JTextField();
		textlastname.setBounds(186, 92, 116, 22);
		textlastname.setColumns(10);
		
		textname = new JTextField();
		textname.setBounds(186, 125, 116, 22);
		textname.setColumns(10);
		
		user = new JTextField();
		user.setBounds(756, 54, 116, 22);
		user.setEditable(false);
		user.setBackground(new Color(255, 255, 255));
		user.setColumns(10);
		user.setBorder(null);
		
		user.setText(username);
		
		JButton btnLogOut = new JButton("log out");
		btnLogOut.setBounds(29, 535, 89, 25);
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn window = new LogIn();
				window.frmStaffReport.setVisible(true);
				frmStaffreport.setVisible(false);
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(29, 491, 89, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					WorkTab window = new WorkTab(id_user, id_worker, username);
					window.frmStaffreport.setVisible(true);
					frmStaffreport.setVisible(false);
			}
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(186, 246, 133, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ÉÁÍÏÕÁÑÉÏÓ", "ÖÅÂÑÏÕÁÑÉÏÓ", "ÌÁÑÔÉÏÓ", "ÁĞÑÉËÉÏÓ", "ÌÁÚÏÓ", "ÉÏÕÍÉÏÓ", "ÉÏÕËÉÏÓ", "ÁÕÃÏÕÓÔÏÓ", "ÓÅĞÔÅÌÂÑÉÏÓ", "ÏÊÔÙÌÂÑÉÏÓ", "ÍÏÅÌÂÑÉÏÓ", "ÄÅÊÅÌÂÑÉÏÓ"}));
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mhnas = comboBox.getSelectedItem().toString();
				Connection connection;
		       try {
		        	Class.forName("com.mysql.jdbc.Driver");
		            connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "test123");
				    PreparedStatement statement = connection.prepareStatement("update valuation set " + mhnas + " = ? where ID = " + id_worker + " ");
		            statement.setInt(1, a);
		            statement.executeUpdate();
		            
		            WorkTab window = new WorkTab(id_user, id_worker, username);
					window.frmStaffreport.setVisible(true);
					frmStaffreport.setVisible(false);
				}catch (SQLException ex) {
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
			}
		});
		btnNewButton.setBounds(563, 245, 75, 23);
		
		JLabel label_1 = new JLabel("\u039C\u0397\u039D\u0391\u03A3");
		label_1.setBounds(221, 212, 59, 22);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_2 = new JLabel("\u0391\u039E\u0399\u039F\u039B\u039F\u0393\u0397\u03A3\u0397");
		label_2.setBounds(404, 212, 108, 22);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStaffreport.getContentPane().setLayout(null);
		frmStaffreport.getContentPane().add(label);
		frmStaffreport.getContentPane().add(user);
		frmStaffreport.getContentPane().add(btnLogOut);
		frmStaffreport.getContentPane().add(btnBack);
		frmStaffreport.getContentPane().add(textname);
		frmStaffreport.getContentPane().add(textlastname);
		frmStaffreport.getContentPane().add(comboBox);
		frmStaffreport.getContentPane().add(btnNewButton);
		frmStaffreport.getContentPane().add(label_1);
		frmStaffreport.getContentPane().add(label_2);
		
		JRadioButton aristos = new JRadioButton("\u0391\u03A1\u0399\u03A3\u03A4\u039F\u03A3");
		aristos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				a = 5;
			}
		});
		aristos.setBounds(403, 245, 109, 23);
		frmStaffreport.getContentPane().add(aristos);
		
		JRadioButton polu_kalos = new JRadioButton("\u03A0\u039F\u039B\u03A5 \u039A\u0391\u039B\u039F\u03A3");
		polu_kalos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 a = 4;
			
			}
		});
		polu_kalos.setBounds(404, 271, 109, 23);
		frmStaffreport.getContentPane().add(polu_kalos);
		
		JRadioButton kalos = new JRadioButton("\u039A\u0391\u039B\u039F\u03A3");
		kalos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				a = 3;
			}
		});
		kalos.setBounds(404, 297, 109, 23);
		frmStaffreport.getContentPane().add(kalos);
		
		JRadioButton metrios = new JRadioButton("\u039C\u0395\u03A4\u03A1\u0399\u039F\u03A3");
		metrios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				a = 2;
			}
		});
		metrios.setBounds(404, 323, 109, 23);
		frmStaffreport.getContentPane().add(metrios);
		
		JRadioButton ligo_kalos = new JRadioButton("\u039B\u0399\u0393\u039F \u039A\u0391\u039B\u039F\u03A3");
		ligo_kalos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				a = 1;
			}
		});
		ligo_kalos.setBounds(404, 349, 109, 23);
		frmStaffreport.getContentPane().add(ligo_kalos);
		
		JLabel label_3 = new JLabel("\u0393\u0395\u039D\u0399\u039A\u0397 \u0391\u039E\u0399\u039F\u039B\u039F\u0393\u0397\u03A3\u0397");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(696, 394, 182, 24);
		frmStaffreport.getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setBounds(745, 440, 86, 20);
		frmStaffreport.getContentPane().add(textField);
		textField.setColumns(10);
		
		ButtonGroup group = new ButtonGroup();
		group.add(aristos);
		group.add(polu_kalos);
		group.add(kalos);
		group.add(metrios);
		group.add(ligo_kalos);
	}

	private void table(int id_worker) {
		Connection connection;
        PreparedStatement wt, wt2;
       try {
        	Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "test123");
            wt = connection.prepareStatement("SELECT `lastname`, `name` FROM `worker` WHERE ID =" + id_worker);
            ResultSet worker = wt.executeQuery();
            if(worker.next()){
            	String lastname = worker.getString("lastname");
            	String name = worker.getString("name");
       
            	textlastname.setText(lastname);
            	textname.setText(name);
            }  
            wt2 = connection.prepareStatement("SELECT * FROM `valuation` WHERE ID =" + id_worker);
            ResultSet valuation = wt2.executeQuery();
            if(valuation.next()){
            	int a = valuation.getInt(2);
            	int b = valuation.getInt(3);
            	int c = valuation.getInt(4);
            	int d = valuation.getInt(5);
            	int e = valuation.getInt(6);
            	int f = valuation.getInt(7);
            	int g = valuation.getInt(8);
            	int i = valuation.getInt(9);
            	int j = valuation.getInt(10);
            	int k = valuation.getInt(11);
            	int l = valuation.getInt(12);
            	int m = valuation.getInt(13);
            	
            	int sum = (a+b+c+d+e+f+g+i+j+k+l+m)/12;
            	if(sum>=4 && sum<5){
            		String sum2 = "ÁÑÉÓÔÏÓ";
            		textField.setText(sum2);
            	}else if(sum>=3 && sum<4){
            		String sum2 = "ĞÏËÕ_ÊÁËÏÓ";
            		textField.setText(sum2);
            	}else if(sum>=2 && sum<3){
            		String sum2 = "ÊÁËÏÓ";
            		textField.setText(sum2);
            	}else if(sum>=1 && sum<2){
            		String sum2 = "ÌÅÔÑÉÏÓ";
            		textField.setText(sum2);
            	}else if(sum>=0 && sum<1){
            		String sum2 = "ËÉÃÏ_ÊÁËÏÓ";
            		textField.setText(sum2);
            	}
            }  
            
		}catch (SQLException ex) {
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
