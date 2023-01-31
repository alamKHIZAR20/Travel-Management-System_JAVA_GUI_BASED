package tms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome_screen extends JFrame implements ActionListener {
    JButton login, exit;

    welcome_screen() {
        setSize(900, 400);
        setLocation(350, 200);
        setLayout(null);

        //panel
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(252, 246, 245));
        p1.setBounds(0, 0, 900, 400);

        p1.setLayout(null);
        add(p1);

        JLabel l = new JLabel("WELCOME TO TRAVELLING SYSTEM : ");
        l.setBounds(210, 100, 1000, 40);
        l.setBackground(new Color(252, 246, 245));
        l.setFont(new Font("OSWALD", Font.BOLD, 35));
        l.setForeground(new Color(255, 252, 252));
        p1.add(l);


        /////////////////////////////////////////
        JLabel l1 = new JLabel("Login : ");
        l1.setBounds(250, 300, 90, 40);
        l1.setBackground(new Color(255, 252, 252));
        l1.setForeground(Color.white);
        l1.setFont(new Font("SAN SERIF", Font.BOLD, 21));
        p1.add(l1);


        login = new JButton("");
        login.setBounds(330, 300, 60, 40);
        login.setBackground(new Color(255, 252, 252));
        login.setForeground(Color.white);
        login.setFont(new Font("SAN SERIF", Font.BOLD, 11));

        login.addActionListener(this);
        p1.add(login);

        //image
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/l.png"));
        Image a2 = a1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel image1 = new JLabel(a3);
        image1.setBounds(0, 0, 30, 30);
        login.add(image1);


        JLabel l2 = new JLabel("Quit : ");
        l2.setBounds(490, 300, 90, 40);
        l2.setBackground(new Color(255, 252, 252));
        l2.setForeground(Color.white);
        l2.setFont(new Font("SAN SERIF", Font.BOLD, 21));
        p1.add(l2);


        exit = new JButton("");
        exit.setBounds(570, 300, 60, 40);
        exit.setBackground(new Color(236, 236, 236));
        exit.setForeground(new Color(153, 0, 17));
        exit.setFont(new Font("SAN SERIF", Font.PLAIN, 11));
        exit.addActionListener(this);
        p1.add(exit);

        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icons/close.png"));
        Image b2 = b1.getImage().getScaledInstance(24, 24, Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel image2 = new JLabel(b3);
        image2.setBounds(0, 0, 24, 24);
        exit.add(image2);

        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/t2Blur.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 400);
        p1.add(image);




        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            new login();
            setVisible(false);
        } else if (e.getSource() == exit) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new welcome_screen();
    }

}
