 
package UniversitySystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.border.LineBorder;

public class AdminDash extends JFrame implements ActionListener{
    
    JButton student , course , score , search , logout ;
    JTextField tfsap , tfname , tfdob , tfgender ,tfemail , tfnumber , tffather , tfmother ,tfaddress , tfbatch , tfsem , tfcourse ;
    JTextField tfcourse2 , tfcourse3 , tfcourse4 , tfcourse5 ;
    
    AdminDash(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         // header wala panel
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(80,220,170));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        JLabel heading = new JLabel("DIT UNIVERSITY...");
        heading.setBounds(80,10,500,40);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        // add image to left panel of frame.
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/dit1.jpg"));
         Image i2 = i1.getImage().getScaledInstance(850, 740,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(0, 35, 800, 800);
         add(image);
         
         // button 1 : student
        student = new JButton("Student");
        student.setBounds(30,40,150,50);
        student.setBackground(new Color(80,220,170));
        student.setForeground(Color.BLACK);
        student.setFont(new Font("Tahoma",Font.PLAIN,30));
        student.setBorder(new LineBorder(new Color(0,0,200)));
        student.setMargin(new Insets(0,0,0,0));
        student.addActionListener(this);
        image.add(student);
        
          // button 2 : course
        course = new JButton("Course");
        course.setBounds(200,40,150,50);
        course.setBackground(new Color(80,220,170));
        course.setForeground(Color.BLACK);
        course.setFont(new Font("Tahoma",Font.PLAIN,30));
        course.setBorder(new LineBorder(new Color(0,0,200)));
        course.setMargin(new Insets(0,0,0,0));
        course.addActionListener(this);
        image.add(course);
        
          // button 3 : score
        score = new JButton("Score");
        score.setBounds(370,40,150,50);
        score.setBackground(new Color(80,220,170));
        score.setForeground(Color.BLACK);
        score.setFont(new Font("Tahoma",Font.PLAIN,30));
        score.setBorder(new LineBorder(new Color(0,0,200)));
        score.setMargin(new Insets(0,0,0,0));
       //student.addActionListener(this);
        image.add(score);
        
          // Right  panel
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.WHITE);
        p2.setBounds(700,0,900,800);
        add(p2);
        
         // button 4 : search
        search = new JButton("search");
        search.setBounds(450,100,100,25);
        search.setBackground(new Color(80,220,170));
        search.setForeground(Color.BLACK);
        search.setFont(new Font("Tahoma",Font.PLAIN,20));
        search.setBorder(new LineBorder(new Color(0,0,200)));
        search.setMargin(new Insets(0,0,0,0));
        search.addActionListener(this);
        p2.add(search);
        
         // button 4 : logout
        logout = new JButton("logout");
        logout.setBounds(600,100,100,25);
        logout.setBackground(new Color(80,220,170));
        logout.setForeground(Color.BLACK);
        logout.setFont(new Font("Tahoma",Font.PLAIN,20));
        logout.setBorder(new LineBorder(new Color(0,0,200)));
        logout.setMargin(new Insets(0,0,0,0));
        logout.addActionListener(this);
        p2.add(logout);
        
         // sap of  
        JLabel lbsap = new JLabel("Sap id :");
        lbsap.setBounds(150, 100, 150, 25);
        lbsap.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbsap);
        // 
        tfsap = new JTextField();
        tfsap.setBounds(270, 100, 150, 25);
        tfsap.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfsap);
        
         // name of  
        JLabel lbname = new JLabel("Name :");
        lbname.setBounds(150, 130, 150, 25);
        lbname.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbname);
        // 
        tfname = new JTextField();
        tfname.setBounds(270, 130, 150, 25);
        tfname.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfname);
        
         // DOB of  
        JLabel lbdob = new JLabel("DOB :");
        lbdob.setBounds(150, 160, 150, 25);
        lbdob.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbdob);
        // 
        tfdob = new JTextField();
        tfdob.setBounds(270, 160, 150, 25);
        tfdob.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfdob);
        
         // gender of  
        JLabel lbgender = new JLabel("DOB :");
        lbgender.setBounds(150, 190, 150, 25);
        lbgender.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbgender);
        // 
        tfgender = new JTextField();
        tfgender.setBounds(270, 190, 150, 25);
        tfgender.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfgender);
        
         // email of  
        JLabel lbemail = new JLabel("Email :");
        lbemail.setBounds(150, 220, 150, 25);
        lbemail.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbemail);
        // 
        tfemail = new JTextField();
        tfemail.setBounds(270, 220, 150, 25);
        tfemail.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfemail);
        
         // phone of  
        JLabel lbnumber = new JLabel("Phone no :");
        lbnumber.setBounds(150, 250, 150, 25);
        lbnumber.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbnumber);
        // 
        tfnumber = new JTextField();
        tfnumber.setBounds(270, 250, 150, 25);
        tfnumber.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfnumber);
        
         // father name
        JLabel lbfather = new JLabel("Father Name :");
        lbfather.setBounds(150, 280, 150, 25);
        lbfather.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbfather);
        // 
        tffather = new JTextField();
        tffather.setBounds(270, 280, 150, 25);
        tffather.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tffather);
        
         // mother name
        JLabel lbmother = new JLabel("Mother Name :");
        lbmother.setBounds(150, 320, 150, 25);
        lbmother.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbmother);
        // 
        tfmother = new JTextField();
        tfmother.setBounds(270, 320, 150, 25);
        tfmother.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfmother);
        
         // Address
        JLabel lbaddress = new JLabel("Address :");
        lbaddress.setBounds(150, 350, 150, 25);
        lbaddress.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbaddress);
        // 
        tfaddress = new JTextField();
        tfaddress.setBounds(270, 350, 150, 25);
        tfaddress.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfaddress);
        
        
         // Batch
        JLabel lbbatch = new JLabel("Batch :");
        lbbatch.setBounds(150, 400, 150, 25);
        lbbatch.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbbatch);
        // 
        tfbatch = new JTextField();
        tfbatch.setBounds(270, 400, 150, 25);
        tfbatch.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfbatch);
        
         // semester
        JLabel lbsem = new JLabel("Semester :");
        lbsem.setBounds(150, 430, 150, 25);
        lbsem.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbsem);
        // 
        tfsem = new JTextField();
        tfsem.setBounds(270, 430, 50, 25);
        tfsem.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfsem);
        
        // course1
        JLabel lbcourse1 = new JLabel("Course 1 :");
        lbcourse1.setBounds(150, 460, 150, 25);
        lbcourse1.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbcourse1);
        // 
        tfcourse = new JTextField();
        tfcourse.setBounds(270, 460, 150, 25);
        tfcourse.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfcourse);
        
        // course2
        JLabel lbcourse2 = new JLabel("Course 2 :");
        lbcourse2.setBounds(150, 490, 150, 25);
        lbcourse2.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbcourse2);
        // 
        tfcourse2 = new JTextField();
        tfcourse2.setBounds(270, 490, 150, 25);
        tfcourse2.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfcourse2);
        
        // course3
        JLabel lbcourse3 = new JLabel("Course 3 :");
        lbcourse3.setBounds(150, 520, 150, 25);
        lbcourse3.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbcourse3);
        // 
        tfcourse3 = new JTextField();
        tfcourse3.setBounds(270, 520, 150, 25);
        tfcourse3.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfcourse3);
        
        // course4
        JLabel lbcourse4 = new JLabel("Course 4 :");
        lbcourse4.setBounds(150, 550, 150, 25);
        lbcourse4.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbcourse4);
        // 
        tfcourse4 = new JTextField();
        tfcourse4.setBounds(270, 550, 150, 25);
        tfcourse4.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfcourse4);
        
        // course1
        JLabel lbcourse5 = new JLabel("Course 5 :");
        lbcourse5.setBounds(150, 580, 150, 25);
        lbcourse5.setFont(new Font("Tahoma",Font.BOLD,15));
        p2.add(lbcourse5);
        // 
        tfcourse5 = new JTextField();
        tfcourse5.setBounds(270, 580, 150, 25);
        tfcourse5.setBorder(new LineBorder(new Color(0,0,200)));
        p2.add(tfcourse5);
         
         
         
        
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == student){
             new admiStudent();
         }else if(ae.getSource() == course){
             new admiStudentCourse();
         } else if(ae.getSource() == logout){
             setVisible(false);
             new admilogin();
         }else if(ae.getSource() == search){
             try{
                String query = "select * from studentPersonalDetails where  sap_id = '"+tfsap.getText()+"'" ;
                Conn c = new Conn();
                
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                     tfname.setText(rs.getString("name"));
                      tfdob.setText(rs.getString("dob"));
                       tfgender.setText(rs.getString("gender"));
                        tfemail.setText(rs.getString("email"));
                         tfnumber.setText(rs.getString("number"));
                          tffather.setText(rs.getString("father_name"));
                           tfmother.setText(rs.getString("mother_name"));
                            tfaddress.setText(rs.getString("address"));
                             
                }
            } catch(Exception e){
                e.printStackTrace();
            }
             
                try{
                    String query = "select * from studentCourse where  sap_id = '"+tfsap.getText()+"'" ;
                    Conn c = new Conn();
                
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()){
                             tfbatch.setText(rs.getString("batch"));
                             tfsem.setText(rs.getString("semester"));
                             tfcourse.setText(rs.getString("course1"));
                             tfcourse2.setText(rs.getString("course2"));
                             tfcourse3.setText(rs.getString("course3"));
                             tfcourse4.setText(rs.getString("course4"));
                             tfcourse5.setText(rs.getString("course5"));
                    }
                } catch(Exception e){
                    e.printStackTrace();
                }
         }
       
    }
    
    public static void main(String[]args){
        new AdminDash();
    }
}
