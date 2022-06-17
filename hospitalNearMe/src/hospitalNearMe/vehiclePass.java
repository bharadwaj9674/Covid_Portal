package hospitalNearMe;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class vehiclePass extends Frame {

    private JLabel Date;
    JLabel l1, l2, l3, l4,
            l5, l6, l7, l8,
            l9, l10, l12, l13,
            l14, l11, l15;

    JTextField tf1, tf2, tf3,
            tf4, tf5, tf6,
            tf7, tf8, tf9,
            tf10;

    JTextArea area2, area1;

    JRadioButton rb1, rb2, rb3,
            rb4, rb5, rb6,
            rb7;

    JFileChooser f1;
    private int LocalDateTime;
    private Date date;

    // Default constructor to
    // initialize the parameters
    vehiclePass() {

        l1 = new JLabel(new ImageIcon("D:\\icon(4).jpeg"));
        l1.setBounds(110, 10, 370, 215);

        l2 = new JLabel("Name");
        l2.setBounds(150, 150, 250, 20);

        tf1 = new JTextField();
        tf1.setBounds(220, 150, 250, 20);

        l6 = new JLabel("Contact Number :");
        l6.setBounds(90, 200, 250, 20);

        tf7 = new JTextField();
        tf7.setBounds(220, 200, 250, 20);

        l13 = new JLabel(("Date : "));
        l13.setBounds(135, 420, 250, 20);


        tf5 = new JTextField();
        tf5.setBounds(220, 420, 230, 20);

        l14 = new JLabel(("Hospital Details : "));
        l14.setBounds(70, 450, 250, 20);

        tf4 = new JTextField();
        tf4.setBounds(220, 450, 230, 20);

        l9 = new JLabel("Gender:");
        l9.setBounds(130, 300, 250, 20);


        JRadioButton r5
                = new JRadioButton("Male");
        JRadioButton r6
                = new JRadioButton(" Female");

        r5.setBounds(220, 300, 100, 30);
        r6.setBounds(220, 370, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r5);
        bg.add(r6);


        l10 = new JLabel(("Vehicle ID : "));
        l10.setBounds(110, 250, 250, 20);

        tf6 = new JTextField();
        tf6.setBounds(220, 250, 250, 20);

        JButton Receipt
                = new JButton("Generate Receipt");
        Receipt.setBounds(150, 490, 150, 30);
        JButton b2 = new JButton("Reset");
        b2.setBounds(320, 490, 150, 30);
        JButton Print = new JButton("Print");
        Print.setBounds(460, 490, 150, 30);

        area2 = new JTextArea();
        area2.setBounds(150, 540, 450, 140);

        add(l1);
        add(l2);
        add(l6);
        add(l9);
        add(l10);
        add(l13);
        add(l14);
        add(tf1);
        add(tf4);
        add(tf5);
        add(tf6);
        add(tf7);
        add(area2);
        add(r5);
        add(r6);
        add(Receipt);
        add(b2);
        add(Print);
        // Reset the text fields
        b2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(
                            ActionEvent e) {
                        area2.setText("");
                        tf1.setText("");
                        tf4.setText("");
                        tf5.setText("");
                        tf6.setText("");
                        tf7.setText("");
                    }
                });

        
        
        // Implementing the Print action
        Print.addActionListener(
                new ActionListener() {
                    public void actionPerformed(
                            ActionEvent e) {
                    	print();
                    }
                });

        // Generating the receipt
        Receipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                area2.setText("\n" +
                        "VEHICLE INFORMATION" + "******" + "\n" + "\n");

                area2.setText(area2.getText()
                        + " Name: "
                        + tf1.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Contact Number: "
                        + tf7.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "VEHICLE ID : "
                        + tf6.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + " Hospital Details : "
                        + tf4.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Time : "
                        + tf5.getText()
                        + "\n");

                if (e.getSource() == Receipt) {
                	getRecepit();
                }

                JOptionPane.showMessageDialog(
                        area2, "DATA SAVED SUCCESSFULLY");
            }
        });
        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(
                            WindowEvent we) {
                        dispose();
                    }
                });
        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);
        setBackground(Color.cyan);
    }
private void print() {
    try {
        area2.print();
    } catch (PrinterException a) {
        System.err.format(
                "NoPrinter Found",
                a.getMessage());
    }
}
private void getRecepit() {
    try {
        FileWriter fw
                = new FileWriter(
                "CarDetails.txt", true);
        fw.write(area2.getText());
        fw.close();
    } catch (Exception ae) {
        System.out.println(ae);
    }
}
    public static void main(String[] args) {
        new vehiclePass();
    }
}

