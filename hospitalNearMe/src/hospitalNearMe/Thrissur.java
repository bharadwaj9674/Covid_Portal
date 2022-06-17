package hospitalNearMe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Thrissur extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	DefaultTableModel model;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thrissur frame = new Thrissur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void displayThrissurdetails(Object [] row) {
		File file =new File("C:\\Users\\anugr\\Desktop\\thrissur.txt");

		Scanner sc;
		  
		try {
			sc = new Scanner(file);
			int i=0;
			while(i<=10) {
	        	String str= sc.nextLine();
	        	String[] sts = str.split( "," );
	        	row[0]=sts[0];
	        	row[1]=sts[1];
	        	row[2]=sts[2];
	        	row[3]=sts[3];
	        	i++;
	        	
			model.addRow(row);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	public Thrissur() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 886, 358);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(91, 88, 670, 175);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		model=new DefaultTableModel ();
		Object [] column= {"Hospital Name","Phone No","Address","Availability"};
		Object [] row =new Object[7];

		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Hospital In Thrissur");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(336, 46, 216, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayThrissurdetails(row);
						btnNewButton.setEnabled(false);
				}	
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNewButton.setBounds(354, 273, 126, 38);
		contentPane.add(btnNewButton);

	}
}