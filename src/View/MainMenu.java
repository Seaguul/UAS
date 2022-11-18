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

/**
 *
 * @author asus
 */
public class MainMenu {
    
    public MainMenu(){
        JFrame f = new JFrame();
        f.setSize(700, 600);
        JLabel title = new JLabel ("Main Menu");
        title.setBounds(270, 30, 300, 100);
        title.setFont(new Font("Sans", Font.BOLD, 28));
        f.setVisible(true);
        f.add(title);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        
        JButton a = new JButton("Login");
        a.setBounds(275, 150, 150, 75);
        JButton b = new JButton("Register");
        b.setBounds(275, 260, 150, 75);
        JButton c = new JButton("User Profile");
        c.setBounds(275, 370, 150, 75);
        
        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MenuLogin();
            }
        });
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MenuRegistrasi();
            }
        });
        
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MenuLihatSeluruhDataPengguna();
            }
        });
        
        f.add(a);
        f.add(b);
        f.add(c);
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
        new MainMenu();
    }
}
