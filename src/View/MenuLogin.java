/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author asus
 */
public class MenuLogin {
    
    public MenuLogin(){
        JFrame f = new JFrame("Login Menu");
        f.setSize(600, 600);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        
        JLabel label1 = new JLabel("User Name :");
        label1.setBounds(200, 120, 100, 25);
        JTextField field1 = new JTextField();
        field1.setBounds(200, 150, 200, 25);
        f.add(label1);
        f.add(field1);
        
        JLabel pass = new JLabel("Password: ");
        pass.setBounds(200, 200, 100, 25);
        JTextField pass1 = new JTextField();
        pass1.setBounds(200, 230, 200, 25);
        f.add(pass);
        f.add(pass1);
        
        JButton login = new JButton("Login");
        login.setBounds(200, 280, 75, 40);
        JButton back = new JButton("Back");
        back.setBounds(300, 280, 75, 40);
        
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
            }
        });
        
        f.add(login);
        f.add(back);
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
        new MenuLogin();
    }
}
