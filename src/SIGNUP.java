import java.awt.BorderLayout;
import java.util.regex.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SIGNUP extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField Lname;
	private JTextField number;
	private JTextField id;
	private JTextField age;
	private JTextField add;
	private JTextField join;
	private JTextField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SIGNUP frame = new SIGNUP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SIGNUP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FIRST-NAME");
		lblNewLabel.setBackground(new Color(240, 248, 255));
		lblNewLabel.setBounds(10, 87, 107, 30);
		contentPane.add(lblNewLabel);
		
		fname = new JTextField();
		fname.setBackground(Color.WHITE);
		fname.setBounds(125, 92, 139, 20);
		contentPane.add(fname);
		fname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("LAST-NAME");
		lblNewLabel_1.setBounds(10, 157, 90, 30);
		contentPane.add(lblNewLabel_1);
		
		Lname = new JTextField();
		Lname.setBounds(125, 162, 139, 20);
		contentPane.add(Lname);
		Lname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PHONE NO");
		lblNewLabel_2.setBounds(10, 215, 90, 20);
		contentPane.add(lblNewLabel_2);
		
		number = new JTextField();
		number.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				String phonenumber = number.getText();
				int length = phonenumber.length();
			}
			@Override
			public void keyTyped(KeyEvent arg0) {
				if(!Character.isDigit(arg0.getKeyChar()))
						arg0.consume();
			}
		});
		number.setBounds(125, 215, 139, 20);
		contentPane.add(number);
		number.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("EMAIL-ID");
		lblNewLabel_3.setBounds(22, 265, 46, 30);
		contentPane.add(lblNewLabel_3);
		
		id = new JTextField();
		id.setBounds(125, 270, 139, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("AGE");
		lblNewLabel_4.setBounds(337, 87, 66, 30);
		contentPane.add(lblNewLabel_4);
		
		age = new JTextField();
		age.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if(!Character.isDigit(arg0.getKeyChar()))
					arg0.consume();
			}
			
		});
		age.setBounds(440, 92, 139, 20);
		contentPane.add(age);
		age.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("ADDRESS");
		lblNewLabel_5.setBounds(326, 162, 77, 20);
		contentPane.add(lblNewLabel_5);
		
		add = new JTextField();
		add.setBounds(440, 162, 139, 20);
		contentPane.add(add);
		add.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("JOIN DATE");
		lblNewLabel_6.setBounds(326, 210, 66, 30);
		contentPane.add(lblNewLabel_6);
		
		join = new JTextField();
		join.setBounds(440, 215, 139, 20);
		contentPane.add(join);
		join.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("PASSWORD");
		lblNewLabel_7.setBounds(326, 266, 77, 28);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton =    new JButton("SUBMIT");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				String phonenumber = number.getText();
				String emailid = id.getText();
				int length = phonenumber.length();
				String Email_pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
				Pattern pattern = Pattern.compile("Email_pattern");
				Matcher matcher=pattern.matcher("emailid"); 
				
					if(fname.getText().trim().isEmpty() || Lname.getText().trim().isEmpty() || number.getText().trim().isEmpty() || id.getText().isEmpty() || 
							age.getText().trim().isEmpty() || add.getText().trim().isEmpty() || join.getText().trim().isEmpty() || pwd.getText().trim().isEmpty()){
						JOptionPane.showMessageDialog(null, "one or mopre field are empty");
						}
				
					else
						if(length>10 ||length<10){
					JOptionPane.showMessageDialog(null, "phone Number should be 10 digit");
					}
				
					
						else
					if(matcher.find()){
						JOptionPane.showMessageDialog(null, "Email id  is not correct");
					}	
					
					
						/*else
							if(age.getText().trim().isEmpty())
							JOptionPane.showMessageDialog(null, "AGE FEILD IS EMPTY");		
							else
								if(add.getText().trim().isEmpty())
									JOptionPane.showMessageDialog(null, "ADDRES FIELD IS EMPTY");
								else
									if(join.getText().trim().isEmpty())
										JOptionPane.showMessageDialog(null, "JOIN DATE FIELD IS EMPTY");
									else
										if(pwd.getText().trim().isEmpty())
											JOptionPane.showMessageDialog(null, "PASSWORD FIELD IS EMPTY");*/
					else
						JOptionPane.showMessageDialog(null , "you entered information succfully");
			}
		});
		btnNewButton.setBounds(125, 344, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblSingnup = new JLabel("SINGNUP");
		lblSingnup.setBounds(265, 26, 251, 20);
		contentPane.add(lblSingnup);
		
		pwd = new JTextField();
		pwd.setBounds(440, 270, 139, 20);
		contentPane.add(pwd);
		pwd.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fname.setText(null);
				Lname.setText(null);
				number.setText(null);
				id.setText(null);
				age.setText(null);
				add.setText(null);
				join.setText(null);
				pwd.setText(null);
			}
		});
		btnNewButton_1.setBounds(353, 354, 89, 23);
		contentPane.add(btnNewButton_1);
		
	
		
		this.setLocationRelativeTo(null);
	}
}
