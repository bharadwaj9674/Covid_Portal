package hospitalNearMe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;

class VaccineRegistration extends JFrame implements ActionListener{


    JLabel label1,label2,label3,label4,label5,label6;
    JTextField t1,t2,t3;
    JRadioButton male,female;
    JComboBox day,month,year;
    JTextArea tA1;
    JCheckBox terms;
    JButton submit;
    JLabel msg;
    JTextArea screen;
    String name;
    String mobile;
    String gender;
    String dob;
    String  aadhaar;
    String hos;



    VaccineRegistration(){

        setTitle("Vaccine Registration Form");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        Container c = getContentPane();
        c.setLayout(null);



        label1 = new JLabel("Name");
        label1.setBounds(20,50,250,20);
        c.add(label1);


        t1 = new JTextField();
        t1.setBounds(130,50,200,20);
        c.add(t1);



        label2 = new JLabel("Mobile");
        label2.setBounds(20,100,150,20);
        c.add(label2);


        t2 = new JTextField();
        t2.setBounds(130,100,150,20);
        c.add(t2);


        label3 = new JLabel("Gender");
        label3.setBounds(20,150,100,20);
        c.add(label3);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setBounds(130,150,80,20);
        female.setBounds(220,150,80,20);
        male.setSelected(true);

        c.add(male);
        c.add(female);

        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);



        label4 = new JLabel("DOB");
        label4.setBounds(20,200,100,20);
        c.add(label4);

        String days[] = {"1","2","3","4","5","6","7","8","9","10",
                "11","12","13","14","15","16","17","18","19","20",
                "21","22","23","24","25","26","27","28","29","30","31"};



        String months[] = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};




        String years[] = {"2022","2021","2020",
                "2019","2018","2017","2016","2015","2014","2013","2012","2011","2010",
                "2009","2008","2007","2006","2005","2004","2003","2002","2001","2000",
                "1999","1998","1997","1996","1995","1994","1993","1992","1991","1990",
                "1989","1988","1987","1986","1985","1984","1983","1982","1981","1980",
                "1979","1978","1977","1976","1975","1974","1973","1972","1971","1970",
                "1969","1968","1967","1966","1965","1964","1963","1962","1961","1960",
                "1959","1958","1957","1956","1955","1954","1953","1952","1951","1950",
                "1949","1948","1947","1946","1945","1944","1943","1942","1941","1940",
                "1939","1938","1937","1936","1935","1934","1933","1932","1931","1930",
                "1929","1928","1927","1926","1925","1924","1923","1922","1921","1920",
                "1919","1918","1917","1916","1915","1914","1913","1912","1911","1910",
                "1909","1908","1907","1906","1905","1904","1903","1902","1901","1900"};



        day = new JComboBox(days);
        month = new JComboBox(months);
        year = new JComboBox(years);

        day.setBounds(130,200,70,30);
        month.setBounds(190,200,70,30);
        year.setBounds(250,200,90,30);

        c.add(day);
        c.add(month);
        c.add(year);



        label5 = new JLabel("Aadhaar Number");
        label5.setBounds(20,250,100,20);
        c.add(label5);

        tA1 = new JTextArea();
        tA1.setBounds(130,250,200,20);
        c.add(tA1);

        label6 = new JLabel("Hospital NAME ");
        label6.setBounds(25,285,120,25);
        c.add(label6);

        t3 = new JTextField();
        t3.setBounds(128,285,200,18);
        c.add(t3);





        terms = new JCheckBox("Please check given information before submitting");
        terms.setBounds(50,330,250,20);
        c.add(terms);


        submit = new JButton("submit");
        submit.setBounds(150,370,80,20);
        c.add(submit);

        submit.addActionListener(this);



        screen = new JTextArea();
        screen.setBounds(370,50,300,300);
        c.add(screen);


        msg = new JLabel("");
        msg.setBounds(20,400,250,20);
        c.add(msg);





        setVisible(true);

    }
    private void displayInfoText() {
        screen.setText("Enter the information correctly");
    }
    private void displaySucessRegistrate(){
        name = t1.getText();
        mobile = t2.getText();
        gender = "male";
        if(female.isSelected()) {
            gender = "female";
        }

        dob = day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
        aadhaar = tA1.getText();
        hos = t3.getText();

        screen.setText(" \n" + "\n" + "Name : "+name+"\n"+"Mobile : "+mobile+"\n"+"Gender : "+gender+"\n"+"DOB : "+dob+"\n"+"Aadhaar : "+aadhaar+"\n"+"Hospital Name :"+hos);

    }
    private void writeFile() {
        try {
            FileWriter fw
                    = new FileWriter(
                    "D:\\vaccineregister.txt", true);
            fw.write(screen.getText());
            fw.close();
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if(terms.isSelected()) {
            if ((t1.getText().isBlank()||  t2.getText().isBlank()||tA1.getText().isBlank())) {
                displayInfoText();
            }

            else{msg.setText("Registration Successfull.....!!");
                displaySucessRegistrate();
            }
        }


        else {

            msg.setText("Please tick the checkbox...!!");
            screen.setText("");

        }
        if (e.getSource() == submit) {
            writeFile();
        }
    }
}



