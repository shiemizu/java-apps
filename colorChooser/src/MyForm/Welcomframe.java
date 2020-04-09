/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyForm;

/**
 *
 * @author 15shi
 */
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Welcomframe extends JFrame{
    JLabel ic = new JLabel();
    JLabel lbl = new JLabel("Welcome to the Color Guide");
    JButton bt = new JButton("pick a color");
    
    public Welcomframe(){
        super("Color Guid");
        setLayout(new FlowLayout());
        ic.setIcon(new ImageIcon(getClass().getResource("pantone.png")));
        lbl.setFont(new Font("Calibri",Font.BOLD,20));
        add(ic);
        add(lbl);
        add(bt);
        
        bt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ColorsFrame f=new ColorsFrame();
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setSize(400, 500);
            }
    });
        
    }
    
}
