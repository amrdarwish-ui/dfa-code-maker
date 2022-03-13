/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 *
 * @author M&G
 */
public class TableExample { 
    int states;
    JFrame f; 
    JButton b;
    ActionListener listener;
    TableExample(int states){ 
        this.states = states;
    f=new JFrame();    
    String[][] dataa = new String[states][3];
    for(int i=0;i<=states-1;i++){
        for (int j = 0; j <=2; j++) {
            if(i==0 && j==0){
                
            }
        }
    }
    String data[][]={ {"1","",""},    
                          {"2","",""},    
                          {"3","",""}};    
    String column[]={"state","a","b"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt); 
    b = new JButton("OK");
    b.setSize(50, 50);
    b.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("click");
            ArrayList<String> r1 = new ArrayList<String>();
            for(int i = 0; i<= 2;i++){
                r1.add(jt.getValueAt(0, i).toString());
            }
            for(int i =0; i<r1.size();i++){
                System.out.println(r1.get(i));
            }
            
             
//To change body of generated methods, choose Tools | Templates.
        }
    });
    
    f.add(sp);          
    f.add(b);
    f.setSize(500,600);    
    f.setLayout(new FlowLayout());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);   
    
    
}     }
