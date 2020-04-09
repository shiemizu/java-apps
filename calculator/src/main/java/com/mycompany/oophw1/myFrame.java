/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oophw1;

/**
 *
 * @author 15shi
 */

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class myFrame extends JFrame implements ActionListener {
    
    String op ="=";
    int n1=0;
    int n2 =0;
    int total=0;
    
    JPanel center = new JPanel(new BorderLayout(5,5));
    JTextField txt = new JTextField();
    JButton btt[]= new JButton[10];
    
    JButton ad = new JButton( new AbstractAction("+") {
        public void actionPerformed( ActionEvent e ) {
           op=e.getActionCommand(); txt.setText("") ;}});
    
    JButton devid = new JButton(new AbstractAction("/") {
        public void actionPerformed( ActionEvent e ) {
           op=e.getActionCommand(); txt.setText("") ;}});
    
    JButton sub = new JButton(new AbstractAction("-") {
        public void actionPerformed( ActionEvent e ) {
           op=e.getActionCommand(); txt.setText("") ;}});
    
    JButton mult = new JButton(new AbstractAction("*") {
        public void actionPerformed( ActionEvent e ) {
           op=e.getActionCommand(); txt.setText("") ;}});
    
    JButton equ = new JButton(new AbstractAction("=") {
        public void actionPerformed( ActionEvent e ) {
            
            if (op.equals("+")){
                 txt.setText(""+(n1+n2)); n1=n1+n2;}
            else if(op.equals("-")){
                 txt.setText(""+(n1-n2)); n1=n1-n2;}
            else if(op.equals("/")){
                 txt.setText(""+(n1/n2));  n1=n1/n2;}
            else if(op.equals("*")){
                 txt.setText(""+(n1*n2));  n1=n1*n2;}
            op="=";
                }});
    
   
    JButton clr = new JButton(new AbstractAction("Clear") {
        public void actionPerformed( ActionEvent e ) {
           txt.setText(""); op="="; n1=0; n2=0;
                   ;}});
    JPanel numpanel = new JPanel(new GridLayout(4,4,6,6));
    
    public myFrame (){
        super("Calcutor");
   
        for (int i = 0;i<10;i++){
            btt[i]= new JButton(""+i);
           btt[i].addActionListener(this );
        }
        numpanel.add(btt[7]); numpanel.add(btt[8]); numpanel.add(btt[9]); numpanel.add(devid); 
        numpanel.add(btt[4]); numpanel.add(btt[5]); numpanel.add(btt[6]); numpanel.add(mult); 
        numpanel.add(btt[1]); numpanel.add(btt[2]); numpanel.add(btt[3]); numpanel.add(sub); 
        numpanel.add(btt[0]); numpanel.add(new JButton());  numpanel.add(equ); numpanel.add(ad);
        
        center.add(numpanel,BorderLayout.CENTER);
        center.add(txt,BorderLayout.NORTH);
        JPanel btpanel = new JPanel();
        btpanel.add(clr);
        
        center.add(btpanel,BorderLayout.SOUTH);
        center.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(center,BorderLayout.CENTER);
    }
        public void actionPerformed(ActionEvent e) {
            String c =e.getActionCommand();
            txt.setText(txt.getText()+c);
            
            if (op.equals("=")) n1 = Integer.parseInt(txt.getText());
            else{  n2=Integer.parseInt(txt.getText());}
         
            
        }
   
}
