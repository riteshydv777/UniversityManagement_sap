 
package UniversitySystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class admisignup extends JFrame implements ActionListener{
    
     JButton create,back ;
    JTextField tfname , tfusername , tfpassword , tfanswer;
    Choice security ;
    
    admisignup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null) ;
        
        // left panel of frame.
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(80,220,170));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        // add image to left panel of frame.
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/dit1.jpg"));
         Image i2 = i1.getImage().getScaledInstance(400, 400,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(490, 0, 400, 400);
         add(image);
        
         JLabel college = new JLabel("DIT UNIVERSITY DEHRADUN ");
        college.setForeground(new Color(0,0,139));
        college.setFont(new Font("Tahoma",Font.BOLD,20));
        college.setBounds(50,20,400,25);
        image.add(college);
        
        // username in left panel
        JLabel lbusername = new JLabel("Admin ID ");
        lbusername.setFont(new Font("Tahoma",Font.BOLD,14));
        lbusername.setBounds(50,20,125,25);
        p1.add(lbusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(190,20,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
         // name in left panel of frame.
        JLabel lbname = new JLabel("Name");
        lbname.setFont(new Font("Tahoma",Font.BOLD,14));
        lbname.setBounds(50,60,125,25);
        p1.add(lbname);
        
        tfname = new JTextField();
        tfname.setBounds(190,60,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
         // password in left panel.
        JLabel lbpassword = new JLabel("Password");
        lbpassword.setFont(new Font("Tahoma",Font.BOLD,14));
        lbpassword.setBounds(50,100,125,25);
        p1.add(lbpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(190,100,180,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        // security in left panel.
        JLabel lbsecurity = new JLabel("Security Question");
        lbsecurity.setFont(new Font("Tahoma",Font.BOLD,14));
        lbsecurity.setBounds(50,140,150,25);
        p1.add(lbsecurity);
        
        security = new Choice();
        security.add("Fav Character from the Boys");
        security.add("Fav Marvel superHero");
        security.add("Fav Place");
        security.add("Your lucky number");
        security.setBounds(190,140,180,25);
        p1.add(security);
        
        // Answer of security.
        JLabel lbanswer = new JLabel(" Answer");
        lbanswer.setFont(new Font("Tahoma",Font.BOLD,14));
        lbanswer.setBounds(50,180,125,25);
        p1.add(lbanswer);
        
        tfanswer = new JTextField();
        tfanswer.setBounds(190,180,180,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
         // create button
        create = new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(Color.BLACK);
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this);
        p1.add(create);
        
        // back button.
        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(250,250,100,30);
        back.addActionListener(this);
        p1.add(back);

                
        setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == create){
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();
            
            String query = "insert into admin values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                setVisible(false);
                new admilogin();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }else if(ae.getSource() == back){
            setVisible(false);
            new admilogin();
        }
    }
    
    
    public static void main(String[]args){
        new admisignup();
    }
}
