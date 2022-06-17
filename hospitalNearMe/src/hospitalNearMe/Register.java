package hospitalNearMe;
import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;

public class Register extends JFrame {
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	private JTextField id1;
	private JTextField no1;
	private String userName;
	private String Password12;
	private String mobileNo;
	private String eid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame1 = new Register();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(92, 81, 93, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(92, 115, 93, 19);
		contentPane.add(lblNewLabel_2);
		
		password = new JTextField();
		password.setBounds(183, 115, 156, 19);
		contentPane.add(password);
		password.setColumns(10);
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			private void displayErrorPassword() {
				JOptionPane.showMessageDialog(null,"Password size less than 8","Size Warning", JOptionPane.WARNING_MESSAGE);
				password.setText(null);
			}
			private void displayErrorMobile() {
			JOptionPane.showMessageDialog(null,"Enter the numbers","Mobile No", JOptionPane.WARNING_MESSAGE);
			no1.setText(null);
			}
			private void writeIntoFile() {
				try
		        {
				 String str=userName+","+Password12+","+mobileNo+","+eid;
				     FileWriter fileWriter = new FileWriter("C:\\\\Users\\\\anugr\\\\Desktop\\\\Login.txt", true);
				    PrintWriter printWriter = new PrintWriter(fileWriter);
				    printWriter.println(str);  //New line
				    printWriter.close();
		            }

		     

		        catch(FileNotFoundException e1)
		        {
		            System.out.println(e1);
		        } catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"Sucessfully registered","Registered", JOptionPane.INFORMATION_MESSAGE);
				
			}
			public void actionPerformed(ActionEvent e) {
				userName=username.getText();
				 Password12=password.getText();
			     mobileNo=no1.getText();
				 eid=id1.getText();
		    	boolean st=false;
		    	try
		        {
		            Long.parseLong(no1.getText());
		        }
		        catch(NumberFormatException ex)
		        {
		            st=true;
		        }
				if(Password12.length()<8) {
					displayErrorPassword();
				}
				else if(st==true) {
					displayErrorMobile();
				}
				else {
					writeIntoFile();
			    }
			}
			
		});
		btnNewButton.setBounds(155, 223, 117, 40);
		contentPane.add(btnNewButton);
		
		username = new JTextField();
		username.setBounds(183, 85, 157, 19);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setBounds(118, 10, 169, 24);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 44, 416, 2);
		contentPane.add(separator);
		
		id1 = new JTextField();
		id1.setBounds(183, 171, 155, 19);
		contentPane.add(id1);
		id1.setColumns(10);
		
		no1 = new JTextField();
		no1.setBounds(183, 144, 156, 19);
		contentPane.add(no1);
		no1.setColumns(10);
		
		JLabel no = new JLabel("Mobile No");
		no.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		no.setBounds(95, 144, 80, 13);
		contentPane.add(no);
		
		JLabel id = new JLabel("Email id");
		id.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		id.setBounds(97, 173, 78, 13);
		contentPane.add(id);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 213, 416, 2);
		contentPane.add(separator_1);
		
		
	}
}
