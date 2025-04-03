 
package UniversitySystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.border.LineBorder;

public class StudentDash extends JFrame {
    
     JButton student , course , score ;
     
    StudentDash(String username){
        //this.username = username ;
        
         setExtendedState(JFrame.MAXIMIZED_BOTH);
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
        
         // header wala panel
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(80,220,170));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        JLabel heading = new JLabel("STUDENT PROFILE...");
        heading.setBounds(80,10,500,40);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
         // Right  panel
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.WHITE);
        p2.setBounds(700,0,900,800);
        add(p2);
        
//        // add image to left panel of frame.
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/dit1.jpg"));
         Image i2 = i1.getImage().getScaledInstance(850, 740,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(0, 35, 700, 800);
         add(image);
         
         // sap of  
        JLabel lbsap = new JLabel("Sap id :");
        lbsap.setBounds(20, 100, 150, 25);
        lbsap.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbsap);
        // 
        JLabel labelsap = new JLabel();
        labelsap.setBounds(150, 100, 150, 25);
        labelsap.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelsap);
        
         // name of  
        JLabel lbname = new JLabel("Name :");
        lbname.setBounds(20, 130, 150, 25);
        lbname.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbname);
        // 
        JLabel labelname = new JLabel();
        labelname.setBounds(150, 130, 150, 25);
        labelname.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelname);
        
         // DOB of  
        JLabel lbdob = new JLabel("DOB :");
        lbdob.setBounds(20, 160, 150, 25);
        lbdob.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbdob);
        // 
        JLabel labeldob = new JLabel();
        labeldob.setBounds(150, 160, 150, 25);
        labeldob.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labeldob);
        
         // gender of  
        JLabel lbgender = new JLabel("Gender :");
        lbgender.setBounds(20, 190, 150, 25);
        lbgender.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbgender);
        // 
        JLabel labelgender = new JLabel();
        labelgender.setBounds(150, 190, 150, 25);
        labelgender.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelgender);
        
         // email of  
        JLabel lbemail = new JLabel("Email :");
        lbemail.setBounds(20, 220, 150, 25);
        lbemail.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbemail);
        // 
        JLabel labelemail = new JLabel();
        labelemail.setBounds(150, 220, 150, 25);
        labelemail.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelemail);
        
         // phone of  
        JLabel lbnumber = new JLabel("Phone no :");
        lbnumber.setBounds(20, 250, 150, 25);
        lbnumber.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbnumber);
        // 
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(150, 250, 150, 25);
        labelnumber.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelnumber);
        
         // father name
        JLabel lbfather = new JLabel("Father Name :");
        lbfather.setBounds(20, 280, 150, 25);
        lbfather.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbfather);
        // 
        JLabel labelfather = new JLabel();
        labelfather.setBounds(150, 280, 150, 25);
        labelfather.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelfather);
        
         // mother name
        JLabel lbmother = new JLabel("Mother Name :");
        lbmother.setBounds(20, 320, 150, 25);
        lbmother.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbmother);
        // 
        JLabel labelmother = new JLabel();
        labelmother.setBounds(150, 320, 150, 25);
        labelmother.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelmother);
        
         // Address
        JLabel lbaddress = new JLabel("Address :");
        lbaddress.setBounds(20, 350, 150, 25);
        lbaddress.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbaddress);
        // 
        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(150, 350, 150, 25);
        labeladdress.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labeladdress);
        
        
         // Batch
        JLabel lbbatch = new JLabel("Batch :");
        lbbatch.setBounds(20, 400, 150, 25);
        lbbatch.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbbatch);
        // 
        JLabel labelbatch = new JLabel();
        labelbatch.setBounds(150, 400, 150, 25);
        labelbatch.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelbatch);
        
         // semester
        JLabel lbsem = new JLabel("Semester :");
        lbsem.setBounds(20, 430, 150, 25);
        lbsem.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbsem);
        // 
        JLabel labelsem = new JLabel();
        labelsem.setBounds(150, 430, 50, 25);
        labelsem.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelsem);
        
        // course1
        JLabel lbcourse1 = new JLabel("Course 1 :");
        lbcourse1.setBounds(20, 460, 150, 25);
        lbcourse1.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbcourse1);
        // 
        JLabel labelcourse = new JLabel();
        labelcourse.setBounds(150, 460, 150, 25);
        labelcourse.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelcourse);
        
        // course2
        JLabel lbcourse2 = new JLabel("Course 2 :");
        lbcourse2.setBounds(20, 490, 150, 25);
        lbcourse2.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbcourse2);
        // 
        JLabel labelcourse2 = new JLabel();
        labelcourse2.setBounds(150, 490, 150, 25);
        labelcourse2.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelcourse2);
        
        // course3
        JLabel lbcourse3 = new JLabel("Course 3 :");
        lbcourse3.setBounds(20, 520, 150, 25);
        lbcourse3.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbcourse3);
        // 
        JLabel labelcourse3 = new JLabel();
        labelcourse3.setBounds(150, 520, 150, 25);
        labelcourse3.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelcourse3);
        
        // course4
        JLabel lbcourse4 = new JLabel("Course 4 :");
        lbcourse4.setBounds(20, 550, 150, 25);
        lbcourse4.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbcourse4);
        // 
        JLabel labelcourse4 = new JLabel();
        labelcourse4.setBounds(150, 550, 150, 25);
        labelcourse4.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelcourse4);
        
        // course1
        JLabel lbcourse5 = new JLabel("Course 5 :");
        lbcourse5.setBounds(20, 580, 150, 25);
        lbcourse5.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbcourse5);
        // 
        JLabel labelcourse5 = new JLabel();
        labelcourse5.setBounds(150, 580, 150, 25);
        labelcourse5.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(labelcourse5);
        
        // fetch data from database and display
         // for personal details....
        try{
            Conn conn = new Conn();
            String query = "select*from studentPersonalDetails  where sap_id = '"+username+"'" ;
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()){
                labelsap.setText(rs.getString("sap_id"));
                labelname.setText(rs.getString("name"));
                labeldob.setText(rs.getString("dob"));
                labelgender.setText(rs.getString("gender"));
                labelemail.setText(rs.getString("email"));
                  
                labelnumber.setText(rs.getString("number"));
                labelfather.setText(rs.getString("father_name"));
                labelmother.setText(rs.getString("mother_name"));
                labeladdress.setText(rs.getString("address"));
                
//                labelbatch.setText(rs.getString("batch"));
//                labelsem.setText(rs.getString("semester"));
//                labelcourse.setText(rs.getString("course1"));
//                labelcourse2.setText(rs.getString("course2"));
//                labelcourse3.setText(rs.getString("course3"));
//                labelcourse4.setText(rs.getString("course4"));
//                labelcourse5.setText(rs.getString("course5"));

                
                
            }
            
        }catch(Exception e){
             e.printStackTrace();
        }
        
        // fetch data from database and display
         // for  course details....
         try{
            Conn conn = new Conn();
            String query = "select*from studentCourse  where sap_id = '"+username+"'" ;
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()){
                
                
                labelbatch.setText(rs.getString("batch"));
                labelsem.setText(rs.getString("semester"));
                labelcourse.setText(rs.getString("course1"));
                labelcourse2.setText(rs.getString("course2"));
                labelcourse3.setText(rs.getString("course3"));
                labelcourse4.setText(rs.getString("course4"));
                labelcourse5.setText(rs.getString("course5"));
   
            }
            
        }catch(Exception e){
             e.printStackTrace();
        }
         
         

           setVisible(true);
    }
    
    public static void main(String[]args){
        new StudentDash("");
    }
}
