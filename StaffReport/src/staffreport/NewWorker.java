package staffreport;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewWorker {
	JFrame frmStaffreport;
	private JTextField textlastname;
	private JTextField textname;
	private JTextField textaddress;
	private JTextField textafm;
	private JTextField textamka;
	private JTextField textphone;
	private JTextField textlogar;
	private JTextField textmisthos;
	private JTextField texthmer_gen;
	private JTextField textasfaleia;
	private JTextField texthmer_asf;
	private JTextField texttmhma;
	private JTextField textid;
	protected static int id_worker;
	protected static int id_user;
	protected static String username;
	protected static String id2;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewWorker window = new NewWorker(id_user, id_worker, username);
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
	
	public NewWorker(int id_user, int id_worker, String username) {
		initialize(id_user, id_worker, username);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param username 
	 * @param id_worker 
	 * @param id_user 
	 */
	
	private void initialize(int id_user, int id_worker, String username) {
		frmStaffreport = new JFrame();
		frmStaffreport.setResizable(false);
		frmStaffreport.setBounds(100, 100, 848, 527);
		frmStaffreport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStaffreport.getContentPane().setLayout(null);

		JLabel lblOnoma = new JLabel("ONOMA");
		lblOnoma.setBounds(34, 78, 56, 16);
		frmStaffreport.getContentPane().add(lblOnoma);
		
		JLabel label = new JLabel("\u0395\u03A0\u03A9\u039D\u03A5\u039C\u039F");
		label.setBounds(34, 31, 78, 16);
		frmStaffreport.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0394\u0399\u0395\u03A5\u0398\u03A5\u039D\u03A3\u0397");
		label_1.setBounds(34, 124, 78, 16);
		frmStaffreport.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u0391.\u03A6.\u039C.");
		label_2.setBounds(34, 169, 78, 16);
		frmStaffreport.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u0391\u03A3\u03A6\u0391\u039B\u0399\u03A3\u03A4\u0399\u039A\u039F\u03A3 \u03A4\u039F\u039C\u0395\u0391\u03A3");
		label_3.setBounds(383, 169, 140, 16);
		frmStaffreport.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u03A4\u0397\u039B\u0395\u03A6\u03A9\u039D\u039F");
		label_4.setBounds(34, 267, 78, 16);
		frmStaffreport.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("\u0391\u03A1\u0399\u0398\u039C\u039F\u03A3 \u03A4\u03A1\u0391\u03A0\u0395\u0396. \u039B\u039F\u0393\u0391\u03A1\u0399\u0391\u03A3\u039C\u039F\u03A5");
		label_5.setBounds(339, 31, 236, 16);
		frmStaffreport.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\u039C\u0399\u03A3\u0398\u039F\u0394\u039F\u03A3\u0399\u0391");
		label_6.setBounds(399, 78, 108, 16);
		frmStaffreport.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("\u0397\u039C\u0395\u03A1\u039F\u039C\u0397\u039D\u0399\u0391 \u0393\u0395\u039D\u039D");
		label_7.setBounds(375, 124, 148, 16);
		frmStaffreport.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("\u0397\u039C\u0395\u03A1\u039F\u039C\u0397\u039D\u0399\u0391 1\u03B7\u03C2 \u0391\u03A3\u03A6\u0391\u039B\u0399\u03A3\u0397\u03A3");
		label_8.setBounds(355, 222, 168, 16);
		frmStaffreport.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("\u0391\u039C\u039A\u0391");
		label_9.setBounds(34, 222, 148, 16);
		frmStaffreport.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("\u03A4\u039C\u0397\u039C\u0391");
		label_10.setBounds(406, 267, 148, 16);
		frmStaffreport.getContentPane().add(label_10);
		
		textlastname = new JTextField();
		textlastname.setBounds(124, 28, 116, 22);
		frmStaffreport.getContentPane().add(textlastname);
		textlastname.setColumns(10);
		
		textname = new JTextField();
		textname.setColumns(10);
		textname.setBounds(124, 75, 116, 22);
		frmStaffreport.getContentPane().add(textname);
		
		textaddress = new JTextField();
		textaddress.setColumns(10);
		textaddress.setBounds(124, 121, 116, 22);
		frmStaffreport.getContentPane().add(textaddress);
		
		textafm = new JTextField();
		textafm.setColumns(10);
		textafm.setBounds(124, 166, 116, 22);
		frmStaffreport.getContentPane().add(textafm);
		
		textamka = new JTextField();
		textamka.setColumns(10);
		textamka.setBounds(124, 219, 116, 22);
		frmStaffreport.getContentPane().add(textamka);
		
		textphone = new JTextField();
		textphone.setColumns(10);
		textphone.setBounds(124, 264, 116, 22);
		frmStaffreport.getContentPane().add(textphone);
		
		textlogar = new JTextField();
		textlogar.setColumns(10);
		textlogar.setBounds(552, 28, 116, 22);
		frmStaffreport.getContentPane().add(textlogar);
		
		textmisthos = new JTextField();
		textmisthos.setColumns(10);
		textmisthos.setBounds(552, 75, 116, 22);
		frmStaffreport.getContentPane().add(textmisthos);
		
		texthmer_gen = new JTextField();
		texthmer_gen.setColumns(10);
		texthmer_gen.setBounds(552, 121, 116, 22);
		frmStaffreport.getContentPane().add(texthmer_gen);
		
		textasfaleia = new JTextField();
		textasfaleia.setColumns(10);
		textasfaleia.setBounds(552, 166, 116, 22);
		frmStaffreport.getContentPane().add(textasfaleia);
		
		texthmer_asf = new JTextField();
		texthmer_asf.setColumns(10);
		texthmer_asf.setBounds(552, 219, 116, 22);
		frmStaffreport.getContentPane().add(texthmer_asf);
		
		texttmhma = new JTextField();
		texttmhma.setColumns(10);
		texttmhma.setBounds(552, 264, 116, 22);
		frmStaffreport.getContentPane().add(texttmhma);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			@SuppressWarnings("null")
			public void actionPerformed(ActionEvent e) {
				String lastname = textlastname.getText();
				String name = textname.getText();
				String address = textaddress.getText();
				String afm2 = textafm.getText();
				String amka2 = textamka.getText();
				String phone2 = textphone.getText();
				String logar2 = textlogar.getText();
				String misthos2 = textmisthos.getText();
				String hmer_gen2 = texthmer_gen.getText();
				String hmer_asf2 = texthmer_asf.getText();
				String asfaleia = textasfaleia.getText();
				String tmhma = texttmhma.getText();
				String id2 = textid.getText();
            	
            	int id = Integer.parseInt(id2);
            	int afm = Integer.parseInt(afm2);
            	int amka = Integer.parseInt(amka2);
            	int phone = Integer.parseInt(phone2);
            	int logar = Integer.parseInt(logar2);
            	int misthos = Integer.parseInt(misthos2);
            	int hmer_gen = Integer.parseInt(hmer_gen2);
            	int hmer_asf = Integer.parseInt(hmer_asf2);
            	Connection connection;
                try {
                	
		        	Class.forName("com.mysql.jdbc.Driver");
		            connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "test123");
		            PreparedStatement statement = (PreparedStatement) connection.prepareStatement("Insert INTO worker (lastname, name, address, afm, amka, phone, bank_number, salary, "
							+ "date_bir, date, asfaleia, tmhma, ID) "
							+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
		     
		            statement.setString(1, lastname);
		            statement.setString(2, name);
		            statement.setString(3, address);
		            statement.setInt(4, afm);
		            statement.setInt(5, amka);
		            statement.setInt(6, phone);
		            statement.setInt(7, logar);
		            statement.setInt(8, misthos);
		            statement.setInt(9, hmer_gen);
		            statement.setInt(10, hmer_asf);
		            statement.setString(11, asfaleia);
		            statement.setString(12, tmhma);
		            statement.setInt(13, id);
		            statement.executeUpdate();
		            PreparedStatement valuation = (PreparedStatement) connection.prepareStatement("Insert INTO valuation (ID) "
							+ "VALUES (?)");
		            valuation.setInt(1, id);
		            valuation.executeUpdate();
		            
		            GeneralList window = new GeneralList(username, id_user);
					window.frmStaffReport.setVisible(true);
					frmStaffreport.setVisible(false);
                }catch (SQLException ex) {
         	       
        		} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setBounds(124, 362, 97, 25);
		frmStaffreport.getContentPane().add(btnSave);
		
		JButton button = new JButton("<----");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GeneralList window = new GeneralList(username, id_user);
				window.frmStaffReport.setVisible(true);
				frmStaffreport.setVisible(false);
			}
		});
		button.setBounds(15, 362, 97, 25);
		frmStaffreport.getContentPane().add(button);
		
		textid = new JTextField();
		textid.setColumns(10);
		textid.setBounds(552, 310, 116, 22);
		frmStaffreport.getContentPane().add(textid);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(419, 314, 46, 14);
		frmStaffreport.getContentPane().add(lblId);
	}
}