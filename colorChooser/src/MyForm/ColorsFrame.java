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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Font;
import javax.swing.border.Border;


public class ColorsFrame extends JFrame implements ChangeListener{
    JLabel lbl = new JLabel("Move the pointers to generate colors");
    JSlider red =new JSlider(JSlider.HORIZONTAL,0,255,128);
    JSlider blue =new JSlider(JSlider.HORIZONTAL,0,255,128);
    JSlider green =new JSlider(JSlider.HORIZONTAL,0,255,128);
    
    JTextField redt= new JTextField (3);
    JTextField bluet= new JTextField (3);
    JTextField greent= new JTextField (3);
    
    Font font = new Font("Calibri", Font.PLAIN, 3);
    JLabel lbl1 = new JLabel("Red Shades");
    JLabel lbl2 = new JLabel("Blue Shades");
    JLabel lbl3 = new JLabel("Green Shades");
    
    JPanel p = new JPanel();
    JPanel lblpanel =new JPanel(new FlowLayout(FlowLayout.CENTER));
    JPanel slid1 = new JPanel ();
    JPanel slid2 = new JPanel ();
    JPanel slid3 = new JPanel ();
    JPanel sliders = new JPanel ();
    JPanel mainPanel = new JPanel (new BorderLayout());

    
    public ColorsFrame(){
        super("Colors");
         //setLayout(new FlowLayout());
         sliders.setLayout(new BoxLayout(sliders,BoxLayout.Y_AXIS));
         
          lbl.setFont(new Font("Calibri",Font.PLAIN,20));
          
        
          mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,40,10));
          
          p.setBackground(Color.WHITE);
          p.setPreferredSize(new Dimension(200,200));
          lblpanel.add(lbl);
          mainPanel.add(lblpanel,BorderLayout.NORTH);
          mainPanel.add(p,BorderLayout.CENTER);
          slid1.add(lbl1); slid1.add(red);  slid1.add(redt);
          slid2.add(lbl2); slid2.add(blue); slid2.add(bluet);
          slid3.add(lbl3); slid3.add(green);slid3.add(greent);
          
          sliders.add(slid1);
          sliders.add(slid2);
          sliders.add(slid3);
          
          mainPanel.add(sliders,BorderLayout.SOUTH);
          add(mainPanel);
          red.addChangeListener(this);
          blue.addChangeListener(this);
          green.addChangeListener(this);
    }
    public void stateChanged(ChangeEvent e) {
        redt.setText(""+red.getValue());
        bluet.setText(""+blue.getValue());
        greent.setText(""+green.getValue());
        p.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
    }

    
    
}
