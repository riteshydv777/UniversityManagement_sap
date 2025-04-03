 
package UniversitySystem;


 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class FirstPage extends JFrame implements ActionListener {
    
      JButton adminlogin , studentlogin   ;

    public FirstPage() {
        
         setSize(900,400);
         setLocation(350,200);
        
        // left panel of frame.
         JPanel p1 = new JPanel();
         p1.setBackground(new Color(80,220,170));
         p1.setBounds(0,0,400,400);
         p1.setLayout(null);
         add(p1);
         
         
         
          // left panel of frame.
//         JPanel p2 = new JPanel();
//         p1.setBackground(new Color(131,193,233));
//         p2.setBounds(400,30,450,300);
//         p2.setLayout(null);
//         add(p2);
         
//         // add image to left panel of frame.
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/dit2.jpg"));
         Image i2 = i1.getImage().getScaledInstance(900, 500,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(400, 0, 300, 300);
         add(image);
         
         JLabel name = new JLabel("University Management System... ");
         name.setBounds(60, 15, 300, 25);
         name.setForeground(Color.BLACK); 
         name.setFont(new Font(name.getFont().getName(), Font.BOLD, name.getFont().getSize())); 
         name.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p1.add(name);
         
          JLabel welcome = new JLabel("Welome to our System...");
         welcome.setBounds(60, 200, 300, 25);
         welcome.setForeground(Color.BLACK); 
         welcome.setFont(new Font(name.getFont().getName(), Font.BOLD, name.getFont().getSize())); 
         welcome.setFont(new Font("SAN__SERIF",Font.PLAIN , 20));
         p1.add(welcome);
         
         // admin login button
         adminlogin = new JButton("Admin Login");
         adminlogin.setBounds(60,  100, 160, 30);
         adminlogin.setBackground(Color.WHITE);
         adminlogin.setForeground(Color.BLACK);
         adminlogin.setBorder(new LineBorder(new Color(133,193,233)));
         adminlogin.addActionListener(this);
         p1.add(adminlogin);
         
         // customber login button
         studentlogin = new JButton("Student Login");
         studentlogin.setBounds(60,  140, 170, 30);
         studentlogin.setBackground(Color.WHITE);
         studentlogin.setForeground(Color.BLACK);
         studentlogin.setBorder(new LineBorder(new Color(133,193,233)));
         studentlogin.addActionListener(this);
         p1.add(studentlogin);
         
         
         
         
         
        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }
      @Override
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == studentlogin){ // logini button
            setVisible(false);
            new studentlogin();
        } else if(ae.getSource() == adminlogin){ // signup button
            setVisible(false);
            new admilogin();
        }  
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FirstPage::new);
    }
}
