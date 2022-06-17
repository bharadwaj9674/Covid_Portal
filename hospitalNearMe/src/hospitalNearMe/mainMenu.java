package hospitalNearMe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class mainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainMenu frame1 = new mainMenu();
					frame1.setVisible(true);
					frame1.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainMenu() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 444, 534);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 436, 79);
		panel.setBackground(new Color(0, 0, 0));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COVID PORTAL");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(53, 31, 321, 81);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Hospital Close to Me");
		btnNewButton.setBounds(0, 190, 436, 118);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\anugr\\Desktop\\hospital-icon.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					hospital  hospital = new hospital();
					hospital.setVisible(true);
					
				}
			}
		);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnCovidProtcols = new JButton("Covid Protocols");
		btnCovidProtcols.setIcon(new ImageIcon("C:\\Users\\anugr\\Desktop\\Actions-help-about-icon ].png"));
		btnCovidProtcols.setBounds(0, 396, 430, 101);
		btnCovidProtcols.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCovidProtcols.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Protocols  protocol = new Protocols();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnCovidProtcols.setForeground(new Color(0, 0, 0));
		btnCovidProtcols.setBackground(new Color(255, 255, 255));
		contentPane.add(btnCovidProtcols);
		JButton btnCovidRegistration = new JButton("Covid Registration");
		btnCovidRegistration.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnCovidRegistration.setIcon(new ImageIcon("C:\\Users\\anugr\\Desktop\\vaccine_PNG14.png"));
		btnCovidRegistration.setBounds(0, 77, 430, 118);
		btnCovidRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Myframe s=new Myframe();
				s.setVisible(true);
			}
			
		});
		btnCovidRegistration.setForeground(Color.BLACK);
		btnCovidRegistration.setBackground(new Color(255, 255, 255));
		contentPane.add(btnCovidRegistration);
		
		JButton btnVehiclePass = new JButton("Vehicle Pass");
		btnVehiclePass.setBounds(0, 307, 430, 91);
		btnVehiclePass.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnVehiclePass.setIcon(new ImageIcon("C:\\Users\\anugr\\Desktop\\sports-car_80.png"));
		btnVehiclePass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vehiclePass  fee = new vehiclePass();
				fee.setVisible(true);
			
			}
		});
		btnVehiclePass.setForeground(Color.BLACK);
		btnVehiclePass.setBackground(new Color(255, 255, 255));
		contentPane.add(btnVehiclePass);
	}
}
