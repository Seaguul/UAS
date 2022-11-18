/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.User;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author asus
 */
public class MenuLogin {
    
    static ArrayList<User> users = new ArrayList<User>();
    
        
        
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
        
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean log = false;
                String warn = "user name dan password tidak tepat!";
                String username = field1.getText();
                String pass = pass1.getText();
                
                for (int i = 0; i < users.size(); i++) {
                    if(users.get(i).getUserName() == username && users.get(i).getPassword() == pass){
                        log = true;
                    } else {
                        log = false;
                        JOptionPane.showMessageDialog(null, warn, "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
        });
        
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
        User user1 = new User(1, "kevin", "123", "kevin@email.com", "Male", null, 4);
        users.add(user1);
        new MenuLogin();
    }
}
