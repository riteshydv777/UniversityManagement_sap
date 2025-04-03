 
package UniversitySystem;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class studentlogin extends JFrame implements ActionListener {
    
    JButton login , signup , password , back ;
    JTextField tfpassword , tfsap ;
    studentlogin(){
        
        setSize(900,400);
        setLocation(350,200);
       
        setLayout(null);
        
        getContentPane().setBackground(new java.awt.Color(80,220,170));
        
        // left panel of frame.
         JPanel p1 = new JPanel();
         p1.setBackground(new Color(80,220,170));
         p1.setBounds(0,0,400,400);
         p1.setLayout(null);
         add(p1);
         
         // add image to left panel of frame.
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/dit1.jpg"));
         Image i2 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(0, 30, 500, 300);
         p1.add(image);
         
         // University name
         JLabel lbunivarsity = new JLabel("...DIT Management System...");
         lbunivarsity.setBounds(50, 5, 300, 25);
         lbunivarsity.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p1.add(lbunivarsity);
         
         // welcome to student page
         JLabel lbwelcome = new JLabel("Welcome to Student Loging...");
         lbwelcome.setBounds(20, 334, 320, 20);
         lbwelcome.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p1.add(lbwelcome);
         
         // right panel of frame.
         JPanel p2 = new JPanel();
         setBackground(new Color(200,200,200));
         p2.setLayout(null);
         p2.setBounds(400,30,450,300);
         add(p2);
         
         // sap.
         JLabel lbsap = new JLabel("Sap id");
         lbsap.setBounds(60, 20, 100, 25);
         lbsap.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p2.add(lbsap);
         
         tfsap = new JTextField();
         tfsap.setBounds(60, 60, 300, 30);
         tfsap.setBorder(BorderFactory.createEmptyBorder());
         p2.add(tfsap);
         
         // password.
         JLabel lbpassword = new JLabel("Password");
         lbpassword.setBounds( 60, 110, 100, 25);
         lbpassword.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p2.add(lbpassword);
         
         tfpassword = new JTextField();
         tfpassword.setBounds(60, 150, 300, 30);
         tfpassword.setBorder(BorderFactory.createEmptyBorder());
         p2.add(tfpassword);
         
         // login button
         login = new JButton("Login");
         login.setBounds(60, 200, 130, 30);
         login.setBackground(new Color(80,220,170));
         login.setForeground(Color.BLACK);
         login.setBorder(new LineBorder(new Color(133,193,233)));
         login.addActionListener(this);
         p2.add(login);
         
         // signup button
         signup = new JButton("Signup");
         signup.setBounds(230, 200, 130, 30);
         signup.setBackground(new Color(80,220,170));
         signup.setForeground(Color.BLACK);
         signup.setBorder(new LineBorder(new Color(133,193,233)));
         signup.addActionListener(this);
         p2.add(signup);
         
         // back button
         back = new JButton("Back");
         back.setBounds(150, 250, 100, 30);
         back.setBackground(new Color(80,220,170));
         back.setForeground(Color.BLACK);
         back.setBorder(new LineBorder(new Color(133,193,233)));
         back.addActionListener(this);
         p2.add(back);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){ // logini button
      
          try{
            String username = tfsap.getText();
            String pass = tfpassword.getText();
            
            String query = "select * from student where username = '"+username+"' AND password = '"+pass+"'" ;   
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);
            
            if(rs.next()){
                setVisible(false);
                new StudentDash(username);
            }else{
                JOptionPane.showMessageDialog(null , "Incorrect username or password");
            }
          }catch (Exception e){
              e.printStackTrace();
          }
            
            
            
        } else if(ae.getSource() == signup){ // signup button
            setVisible(false);
            new studentsignup();
        } else{
            setVisible(false);
            new FirstPage();
        }
    }
    public static void main(String[]args){
        new studentlogin();
    }
}
