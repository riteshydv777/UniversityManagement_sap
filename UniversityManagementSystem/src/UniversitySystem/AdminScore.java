 
package UniversitySystem;

 import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class AdminScore extends JFrame {
    
     JTextField  tfsap , tfname , tfsem1 , tfsem2 , tfsem3 , tfsem4 , tfsem5 , tfsem6 , tfsem7,tfsem8 ;
     
    JButton back , save , search ;
    
     AdminScore(){
     setSize(400,600);
     setLocation(350,200);
    
     setLayout(null);
     
     // panel 1 : header
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(80,220,170));
        p1.setBounds(0,0,400,65);
        p1.setBorder(new LineBorder(new Color(0,110,100)));
        
        JLabel heading = new JLabel("Student Score Details");
        heading.setBounds(70,10,500,40);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("Tahoma",Font.BOLD,25));
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
         
          // sem1.............................................................
         JLabel lbsem1 = new JLabel("sem_1 :");
         lbsem1.setBounds(20, 170, 100, 25);
         lbsem1.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbsem1);
         
         tfsem1 = new JTextField();
         tfsem1.setBounds(120, 170, 70, 25);
         tfsem1.setBorder(BorderFactory.createEmptyBorder());
         add(tfsem1);
         
          // sem2?
        JLabel lbsem2 = new JLabel("sem_2 :");
        lbsem2.setBounds(20,220,100,25);
        lbsem2.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
        add(lbsem2);
        
        tfsem2 = new JTextField();
        tfsem2.setBounds(120,220,70,25);
        tfsem2.setBorder(BorderFactory.createEmptyBorder());
        add(tfsem2);
        
         // sem3.............................................................
         JLabel lbsem3 = new JLabel("sem_3 :");
         lbsem3.setBounds(20, 270, 100, 25);
         lbsem3.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbsem3);
         
         tfsem3 = new JTextField();
         tfsem3.setBounds(120, 270, 70, 25);
         tfsem3.setBorder(BorderFactory.createEmptyBorder());
         add(tfsem3);
         
         // sem4.............................................................
         JLabel lbsem4 = new JLabel("sem_4 :");
         lbsem4.setBounds(20, 320, 100, 25);
         lbsem4.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbsem4);
         
         tfsem4 = new JTextField();
         tfsem4.setBounds(120, 320, 70, 25);
         tfsem4.setBorder(BorderFactory.createEmptyBorder());
         add(tfsem4);
         
          // sem5.............................................................
         JLabel lbsem5 = new JLabel("sem_5 :");
         lbsem5.setBounds(20, 370, 100, 25);
         lbsem5.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbsem5);
         
         tfsem5 = new JTextField();
         tfsem5.setBounds(120, 370, 70, 25);
         tfsem5.setBorder(BorderFactory.createEmptyBorder());
         add(tfsem5);
         
           // sem6.............................................................
         JLabel lbsem6 = new JLabel("sem_6 :");
         lbsem6.setBounds(20, 420, 100, 25);
         lbsem6.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbsem6);
         
         tfsem6 = new JTextField();
         tfsem6.setBounds(120, 420, 70, 25);
         tfsem6.setBorder(BorderFactory.createEmptyBorder());
         add(tfsem6);
         
           // sem7.............................................................
         JLabel lbsem7 = new JLabel("sem_7 :");
         lbsem7.setBounds(20, 470, 100, 25);
         lbsem7.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbsem7);
         
         tfsem7 = new JTextField();
         tfsem7.setBounds(120, 520, 70, 25);
         tfsem7.setBorder(BorderFactory.createEmptyBorder());
         add(tfsem7);
         
           // sem8.............................................................
         JLabel lbsem8 = new JLabel("sem_8 :");
         lbsem8.setBounds(20, 520, 100, 25);
         lbsem8.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         add(lbsem8);
         
         tfsem8 = new JTextField();
         tfsem8.setBounds(120, 470, 70, 25);
         tfsem8.setBorder(BorderFactory.createEmptyBorder());
         add(tfsem8);
         
         // save button
         save = new JButton("Save");
         save.setBackground(Color.WHITE);
         save.setForeground(Color.BLACK);
         save.setFont(new Font("Tahoma",Font.BOLD,14));
         save.setBounds(280,470,100,25);
         // save.addActionListener(this);
         add(save);
         
          // back button
         back = new JButton("Back");
         back.setBackground(Color.WHITE);
         back.setForeground(Color.BLACK);
         back.setFont(new Font("Tahoma",Font.BOLD,14));
         back.setBounds(280,520,100,25);
        // back.addActionListener(this);
         add(back);
         
          
         
         
         
         
    
     setVisible(true);

     }
    
    public static void main(String[]args){
        new AdminScore();
    }
}
