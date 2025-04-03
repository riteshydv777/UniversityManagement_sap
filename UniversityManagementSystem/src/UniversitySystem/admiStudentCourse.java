  
package UniversitySystem;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
 
public class admiStudentCourse extends JFrame implements ActionListener{
    
    JComboBox comboid , course1 , course2 , course3 , course4 , course5 , batch ;
    JButton back , save ;
     JTextField  tfsap  ;
     
    admiStudentCourse(){
        
         setSize(400,600);
        setLocation(350,200);
         
        
       
        setLayout(null);
        
        // panel 1 : header
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(80,220,170));
        p1.setBounds(0,0,400,65);
        p1.setBorder(new LineBorder(new Color(0,110,100)));
        
        JLabel heading = new JLabel("Course Details");
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
         
         // Batch.............................................................
         JLabel lbbatch = new JLabel("Batch :");
         lbbatch.setBounds(20, 120, 100, 25);
         lbbatch.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbbatch);
         
        batch = new JComboBox(new String[]{"2025-2029","2024-2028","2023-2027","2022-2026","2021-2025","2020-2024"});
        batch.setBounds(140,120,100,25);
        batch.setBackground(Color.WHITE);
        add(batch);
         
         
         // sem.............................................................
         JLabel lbsem = new JLabel("Semester :");
         lbsem.setBounds(20, 170, 100, 25);
         lbsem.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbsem);
         
        comboid = new JComboBox(new String[]{"1","2","3","4","5","6","7","8"});
        comboid.setBounds(140,170,80,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        // course1.............................................................
         JLabel lbcourse1 = new JLabel("Course 1 :");
         lbcourse1.setBounds(20, 220, 100, 25);
         lbcourse1.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbcourse1);
          
        course1 = new JComboBox(new String[]{"Engineering Chemistry","Data Structure","Environmental Science","Operating System","Engineering Mathematics1","Cellular Communication","R Programming"});
        course1.setBounds(120, 220, 180, 25);
        course1.setBackground(Color.WHITE);
        add(course1);
         
         // course2.............................................................
         JLabel lbcourse2 = new JLabel("Course 2 :");
         lbcourse2.setBounds(20, 270, 100, 25);
         lbcourse2.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbcourse2);
         
        course2 = new JComboBox(new String[]{"C Programming","Electronics and Electrical","Discrete Mathematics","Database Management System","Computer Fundamentals","Principle of Management","Design and Analysis","Python Programming","Evolutionary Computing"});
        course2.setBounds(120, 270, 180, 25);
        course2.setBackground(Color.WHITE);
        add(course2);
         
         // course3.............................................................
         JLabel lbcourse3 = new JLabel("Course 3 :");
         lbcourse3.setBounds(20, 320, 100, 25);
         lbcourse3.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbcourse3);
         
         course3 = new JComboBox(new String[]{"Professional Communication","Engineering Mathematics2","Java Programming","Computer Fundamentals","Wave Optics","Fuzzy logic & Network","Artificial Intelligence"});
         course3.setBounds(120, 320, 180, 25);
         course3.setBackground(Color.WHITE);
         add(course3);
         
         // course4.............................................................
         JLabel lbcourse4 = new JLabel("Course 4 :");
         lbcourse4.setBounds(20, 370, 100, 25);
         lbcourse4.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbcourse4);
         
         course4 = new JComboBox(new String[]{"Thermodynamics","Indian English Literature","Computer Organization","Sustainable Development","Computer Fundamentals","Computer Networ","Operation Reasearch","Machine Learning"});
         course4.setBounds(120, 370, 180, 25);
         course4.setBackground(Color.WHITE);
         add(course4);
         
         // course5.............................................................
         JLabel lbcourse5 = new JLabel("Course 5 :");
         lbcourse5.setBounds(20, 420, 100, 25);
         lbcourse5.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbcourse5);
         
         course5 = new JComboBox(new String[]{" Evolutionary Computing","Artificial Intelligence","R Programming","Machine Learning","Deep Learning","Python Programming","Computer Fundamentals"});
         course5.setBounds(120, 420, 180, 25);
         course5.setBackground(Color.WHITE);
         add(course5);
         
          // back button
         back = new JButton("Back");
         back.setBackground(Color.WHITE);
         back.setForeground(Color.BLACK);
         back.setFont(new Font("Tahoma",Font.BOLD,14));
         back.setBounds(50,480,100,25);
         back.addActionListener(this);
         add(back);
         
         // save button
         save = new JButton("Save");
         save.setBackground(Color.WHITE);
         save.setForeground(Color.BLACK);
         save.setFont(new Font("Tahoma",Font.BOLD,14));
         save.setBounds(180,480,100,25);
         save.addActionListener(this);
         add(save);
        
        
        
         setVisible(true);
    }
    
        public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == save){
             // take data from textfields....
             String sap_id = tfsap.getText();
             String Batch = (String) batch.getSelectedItem();
             String Semester = (String) comboid.getSelectedItem();
             String Course1 = (String) course1.getSelectedItem();
             String Course2 = (String) course2.getSelectedItem();
             String Course3 = (String) course3.getSelectedItem();
             String Course4 = (String) course4.getSelectedItem();
             String Course5 = (String) course5.getSelectedItem();
             
             try{
                    Conn c = new Conn();
                    String query = "insert into studentCourse values('"+sap_id+"','"+Batch+"','"+Semester+"','"+Course1+"','"+Course2+"','"+Course3+"','"+Course4+"','"+Course5+"')";////////////
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
        new admiStudentCourse();
        
    }
}
