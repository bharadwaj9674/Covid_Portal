package hospitalNearMe;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class Login {

	private JFrame frame;
	private JTextField name;
	private JPasswordField password;
	private String username;
	private String Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(186, 28, 90, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(51, 95, 84, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(51, 135, 117, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		name = new JTextField();
		name.setBounds(160, 99, 179, 19);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Password = password.getText(); 
				username = name.getText();
				boolean y=check(Password,username);
				if(y==true) {
					showMenu();
				}
				else {
					loginError();
				}

					
			}
        private void showMenu() {
        	mainMenu  menu = new mainMenu();
			menu.setVisible(true);
			frame.dispose();
        }
        private  void loginError() {
			JOptionPane.showMessageDialog(null,"Incorrect Details","Login Error", JOptionPane.ERROR_MESSAGE);
			password.setText(null);
			name.setText(null);
        	
        }
		private boolean check(String password, String username) {
		String record = null;
	    FileReader in = null;
	    try {
	        in = new FileReader("C:\\Users\\anugr\\Desktop\\Login.txt");
	        BufferedReader br = new BufferedReader(in);
	        Scanner keyboard = new Scanner(System.in);

	        while ((record = br.readLine()) !=null) {
	            String[] split = record.split(",");

	            if (username.equals(split[0]) && password.equals(split[1])) {
                      return true;
	              
	            }
	            
	        }
	        }
	     catch (IOException e) {
	        e.getCause();
	    }
			return false;}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(40, 200, 128, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register Register2 = new Register();
				Register2.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(251, 200, 140, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 63, 376, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(34, 189, 376, 2);
		frame.getContentPane().add(separator_1);
		
		password = new JPasswordField();
		password.setBounds(160, 133, 179, 19);
		frame.getContentPane().add(password);
	}
}