package staffreport;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class WorkTab {

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
	protected static int id_user;
	protected static String username;
	protected static int id_worker;


	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkTab window = new WorkTab(id_user, id_worker, username);
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
	 * @param lastname2 
	 */
	
	public WorkTab(int id_user, int id_worker, String username) {
		initialize(username, id_user, id_worker);
		table(id_worker);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param username 
	 * @param id_worker 
	 * @param id2 
	 * @param id2 
	 */
	
	private void initialize(String username, int id_user, int id_worker) {
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
		textlastname.setBackground(Color.WHITE);
		textlastname.setEditable(false);
		textlastname.setBounds(124, 28, 116, 22);
		frmStaffreport.getContentPane().add(textlastname);
		textlastname.setColumns(10);
		
		textname = new JTextField();
		textname.setEditable(false);
		textname.setBackground(Color.WHITE);
		textname.setColumns(10);
		textname.setBounds(124, 75, 116, 22);
		frmStaffreport.getContentPane().add(textname);
		
		textaddress = new JTextField();
		textaddress.setBackground(Color.WHITE);
		textaddress.setEditable(false);
		textaddress.setColumns(10);
		textaddress.setBounds(124, 121, 116, 22);
		frmStaffreport.getContentPane().add(textaddress);
		
		textafm = new JTextField();
		textafm.setBackground(Color.WHITE);
		textafm.setEditable(false);
		textafm.setColumns(10);
		textafm.setBounds(124, 166, 116, 22);
		frmStaffreport.getContentPane().add(textafm);
		
		textamka = new JTextField();
		textamka.setBackground(Color.WHITE);
		textamka.setEditable(false);
		textamka.setColumns(10);
		textamka.setBounds(124, 219, 116, 22);
		frmStaffreport.getContentPane().add(textamka);
		
		textphone = new JTextField();
		textphone.setBackground(Color.WHITE);
		textphone.setEditable(false);
		textphone.setColumns(10);
		textphone.setBounds(124, 264, 116, 22);
		frmStaffreport.getContentPane().add(textphone);
		
		textlogar = new JTextField();
		textlogar.setBackground(Color.WHITE);
		textlogar.setEditable(false);
		textlogar.setColumns(10);
		textlogar.setBounds(552, 28, 116, 22);
		frmStaffreport.getContentPane().add(textlogar);
		
		textmisthos = new JTextField();
		textmisthos.setBackground(Color.WHITE);
		textmisthos.setEditable(false);
		textmisthos.setColumns(10);
		textmisthos.setBounds(552, 75, 116, 22);
		frmStaffreport.getContentPane().add(textmisthos);
		
		texthmer_gen = new JTextField();
		texthmer_gen.setBackground(Color.WHITE);
		texthmer_gen.setEditable(false);
		texthmer_gen.setColumns(10);
		texthmer_gen.setBounds(552, 121, 116, 22);
		frmStaffreport.getContentPane().add(texthmer_gen);
		
		textasfaleia = new JTextField();
		textasfaleia.setBackground(Color.WHITE);
		textasfaleia.setEditable(false);
		textasfaleia.setColumns(10);
		textasfaleia.setBounds(552, 166, 116, 22);
		frmStaffreport.getContentPane().add(textasfaleia);
		
		texthmer_asf = new JTextField();
		texthmer_asf.setBackground(Color.WHITE);
		texthmer_asf.setEditable(false);
		texthmer_asf.setColumns(10);
		texthmer_asf.setBounds(552, 219, 116, 22);
		frmStaffreport.getContentPane().add(texthmer_asf);
		
		texttmhma = new JTextField();
		texttmhma.setBackground(Color.WHITE);
		texttmhma.setEditable(false);
		texttmhma.setColumns(10);
		texttmhma.setBounds(552, 264, 116, 22);
		frmStaffreport.getContentPane().add(texttmhma);
		
		JButton btnSave = new JButton("NEW WORKER");
		if(id_user==100)
			btnSave.setVisible(true);
		else btnSave.setVisible(false);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewWorker window = new NewWorker(id_user, id_worker, username);
				window.frmStaffreport.setVisible(true);
				frmStaffreport.setVisible(false);
			}
		});
		btnSave.setBounds(149, 422, 128, 25);
		frmStaffreport.getContentPane().add(btnSave);
		
		JButton button = new JButton("<----");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(id_worker>=200 && id_worker<300){
					MarkList window = new MarkList(username, id_user);
					window.frmStaffreport.setVisible(true);
					frmStaffreport.setVisible(false);
				}
				if(id_worker>=300 && id_worker<400){
					SalesList window = new SalesList(username, id_user);
					window.frmStaffreport.setVisible(true);
					frmStaffreport.setVisible(false);
				}
				if(id_worker>=400 && id_worker<500){
					LawList window = new LawList(username, id_user);
					window.frmStaffreport.setVisible(true);
					frmStaffreport.setVisible(false);
				}
				if(id_worker>=500 && id_worker<600){
					HrList window = new HrList(username, id_user);
					window.frmStaffreport.setVisible(true);
					frmStaffreport.setVisible(false);
				}
			}
		});
		button.setBounds(15, 362, 97, 25);
		frmStaffreport.getContentPane().add(button);
		
		textid = new JTextField();
		textid.setBackground(Color.WHITE);
		textid.setEditable(false);
		textid.setColumns(10);
		textid.setBounds(552, 310, 116, 22);
		frmStaffreport.getContentPane().add(textid);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(419, 314, 46, 14);
		frmStaffreport.getContentPane().add(lblId);
		
		JButton button_1 = new JButton("\u0391\u039E\u0399\u039F\u039B\u039F\u0393\u0397\u03A3\u0397");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Valuation window = new Valuation(id_user, id_worker, username);
				window.frmStaffreport.setVisible(true);
				frmStaffreport.setVisible(false);

			}
		});
		button_1.setBounds(9, 422, 128, 25);
		frmStaffreport.getContentPane().add(button_1);
	
	}
	private void table(int id_worker) {
		Connection connection;
        PreparedStatement wt;
       try {
        	Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "test123");
            wt = connection.prepareStatement("SELECT * FROM `worker` WHERE ID =" + id_worker + "");
            ResultSet worker = wt.executeQuery();
            if(worker.next()){
            	String lastname = worker.getString("lastname");
            	String name = worker.getString("name");
            	String address = worker.getString("address");
            	int afm = worker.getInt("afm");
            	int amka = worker.getInt("amka");
            	int phone = worker.getInt("phone");
            	int logar = worker.getInt("bank_number");
            	int misthos = worker.getInt("salary");
            	String hmer_gen = worker.getString("date_bir");
            	String hmer_asf = worker.getString("date");
            	String asfaleia = worker.getString("asfaleia");
            	String tmhma = worker.getString("tmhma");
            	int id = worker.getInt("ID");
            	
            	textlastname.setText(lastname);
            	textname.setText(name);
            	textaddress.setText(address);
            	textafm.setText(Integer.toString(afm));
            	textamka.setText(Integer.toString(amka));
            	textphone.setText(Integer.toString(phone));
            	textlogar.setText(Integer.toString(logar));
            	textmisthos.setText(Integer.toString(misthos));
            	texthmer_gen.setText(hmer_gen);
            	texthmer_asf.setText(hmer_asf);
            	textasfaleia.setText(asfaleia);
            	texttmhma.setText(tmhma);
            	textid.setText(Integer.toString(id));
            }  
		}catch (SQLException ex) {
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}