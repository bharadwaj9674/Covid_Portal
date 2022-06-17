package hospitalNearMe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class hospital extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hospital frame = new hospital();
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
	private void displayKannurMenu(){
	kannur1 kannur = new kannur1();
	kannur.setVisible(true);
	dispose();
	System.out.println("gee");
	
}
	private void displayErnakulamMenu(){
	Ernakulam e = new Ernakulam();
	e.setVisible(true);
	dispose();
	
}
	private void displayThrissurMenu(){
        Thrissur Thrissur = new Thrissur();
        Thrissur.setVisible(true);
		dispose();
	}
	private void displayKasargodMenu() {
	Kasargod Kasargod = new Kasargod();
	Kasargod.setVisible(true);
	dispose();
	}
	private void displayKozhikodeMenu() {
	Kozhikode Kozhikode = new Kozhikode();
	Kozhikode.setVisible(true);
	dispose();
	}


	public hospital() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 445, 310);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose The District ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(130, 63, 296, 60);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 138, 137, 21);
		contentPane.add(comboBox);
		comboBox.addItem("Kozkikode");
		comboBox.addItem("Kannur");
		comboBox.addItem("Ernakulam");
		comboBox.addItem("Thrissur");
		comboBox.addItem("Kasargod");
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().toString()=="Kannur") {
					displayKannurMenu();
				}
				
				else if(comboBox.getSelectedItem().toString()=="Ernakulam") {
					displayErnakulamMenu();
				}
				else if(comboBox.getSelectedItem().toString()=="Thrissur") {
					displayThrissurMenu();
				}
				else if(comboBox.getSelectedItem().toString()=="Kasargod") {
					displayKasargodMenu();
				}
				else {
					displayKozhikodeMenu();
				}
					
				}
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(160, 184, 85, 21);
		contentPane.add(btnNewButton);
		
	}
}