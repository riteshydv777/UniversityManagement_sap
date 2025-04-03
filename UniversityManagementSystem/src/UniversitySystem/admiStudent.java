 
package UniversitySystem;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
 
public class admiStudent extends JFrame implements ActionListener{
    
    JTextField  tfsap , tfname , tfdob , tfemail , tfnumber , tffather , tfmother , tfaddress ;
    JRadioButton rmale,rfemale ;
    JButton back , save ;
    
    admiStudent(){
        
        setSize(400,600);
        setLocation(350,200);
         
        
       
        setLayout(null);
        
        // panel 1 : header
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(80,220,170));
        p1.setBounds(0,0,400,65);
        p1.setBorder(new LineBorder(new Color(0,110,100)));
        
        JLabel heading = new JLabel("Student Details");
        heading.setBounds(80,10,500,40);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        add(p1);
        
         // sap id............................................................
         JLabel lbsap = new JLabel("Sap id :");
         lbsap.setBounds(20, 70, 100, 25);
         lbsap.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbsap);
         
         tfsap = new JTextField();
         tfsap.setBounds(120, 70, 100, 25);
         tfsap.setBorder(BorderFactory.createEmptyBorder());
         add(tfsap);
         
          // name.............................................................
         JLabel lbname = new JLabel("Name :");
         lbname.setBounds(20, 120, 100, 25);
         lbname.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbname);
         
         tfname = new JTextField();
         tfname.setBounds(120, 120, 100, 25);
         tfname.setBorder(BorderFactory.createEmptyBorder());
         add(tfname);
         
          // dat of birth.............................................................
         JLabel lbdob = new JLabel("DOB :");
         lbdob.setBounds(20, 170, 100, 25);
         lbdob.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbdob);
         
         tfdob = new JTextField();
         tfdob.setBounds(120, 170, 100, 25);
         tfdob.setBorder(BorderFactory.createEmptyBorder());
         add(tfdob);
         
         // your gender ?
        JLabel lbgender = new JLabel("Gender :");
        lbgender.setBounds(20,220,100,25);
        lbgender.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
        add(lbgender);
        // answer your gender.
        rmale = new JRadioButton("Male");
        rmale.setBounds(120,220,70,25);
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(210,220,70,25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
         // email.............................................................
         JLabel lbemail = new JLabel("Email :");
         lbemail.setBounds(20, 270, 100, 25);
         lbemail.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbemail);
         
         tfemail = new JTextField();
         tfemail.setBounds(120, 270, 150, 25);
         tfemail.setBorder(BorderFactory.createEmptyBorder());
         add(tfemail);
         
          // phone number.............................................................
         JLabel lbnumber = new JLabel("Phone no :");
         lbnumber.setBounds(20, 320, 100, 25);
         lbnumber.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbnumber);
         
         tfnumber = new JTextField();
         tfnumber.setBounds(120, 320, 150, 25);
         tfnumber.setBorder(BorderFactory.createEmptyBorder());
         add(tfnumber);
         
          // Father Name.............................................................
         JLabel lbfather = new JLabel("Father Name :");
         lbfather.setBounds(20, 370, 100, 25);
         lbfather.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbfather);
         
         tffather = new JTextField();
         tffather.setBounds(120, 370, 150, 25);
         tffather.setBorder(BorderFactory.createEmptyBorder());
         add(tffather);
         
          // Mother Name.............................................................
         JLabel lbmother = new JLabel("Mother Name :");
         lbmother.setBounds(20, 420, 100, 25);
         lbmother.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbmother);
         
         tfmother = new JTextField();
         tfmother.setBounds(120, 420, 150, 25);
         tfmother.setBorder(BorderFactory.createEmptyBorder());
         add(tfmother);
         
          // Address Name.............................................................
         JLabel lbaddress = new JLabel("Address :");
         lbaddress.setBounds(20, 470, 100, 25);
         lbaddress.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbaddress);
         
         tfaddress = new JTextField();
         tfaddress.setBounds(120, 470, 150, 25);
         tfaddress.setBorder(BorderFactory.createEmptyBorder());
         add(tfaddress);
         
         // back button
         back = new JButton("Back");
         back.setBackground(Color.WHITE);
         back.setForeground(Color.BLACK);
         back.setFont(new Font("Tahoma",Font.BOLD,14));
         back.setBounds(50,520,100,25);
         back.addActionListener(this);
         add(back);
         
         // save button
         save = new JButton("Save");
         save.setBackground(Color.WHITE);
         save.setForeground(Color.BLACK);
         save.setFont(new Font("Tahoma",Font.BOLD,14));
         save.setBounds(180,520,100,25);
         save.addActionListener(this);
         add(save);
         
         
         
        
         
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == save){
             // take data from textfields....
             String sap_id = tfsap.getText();
             String name = tfname.getText();
             String dob = tfdob.getText();
             
             String gender = null ;
            if(rmale.isSelected()){
                gender = "Male" ;
            }else{
                gender = "Female" ;
            }
            
            String email = tfemail.getText();
            String number = tfnumber.getText();
            String father_name = tffather.getText();
            String mother_name = tfmother.getText();
            String address = tfaddress.getText();
            
                try{
                    Conn c = new Conn();
                    String query = "insert into studentPersonalDetails values('"+sap_id+"','"+name+"','"+dob+"','"+gender+"','"+email+"','"+number+"','"+father_name+"','"+mother_name+"','"+address+"')";////////////
                    c.s.executeUpdate(query);
                    
                    JOptionPane.showMessageDialog(null," Details Added Successfully");
                     setVisible(false);
                     
                }catch(Exception e){
                    e.printStackTrace();
                }
            
         }else {
              setVisible(false);
         }  
    }
    
    public static void main(String[]args){
        new admiStudent();
    }
}
