//<<<<<<< Updated upstream:src/ourButton.java
//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class ourButton {
//    private String img;
//    private int w, h;
//    public ourButton(String img,int w,int h) {
//        this.img = img;
//        this.w = w;
//        this.h = h;
//    }
//
//
//}

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class ourButton extends Image implements ActionListener {
        //start b
        
        JButton startB = new JButton();
        //menu b
        JButton allFoodB = new JButton();
        JButton thaiFoodB = new JButton();
        JButton asianFoodB = new JButton();
        JButton healthyFoodB = new JButton();
        JButton fastFoodB = new JButton();
        JButton snackFoodB = new JButton();
        //random
        JButton randomB = new JButton();
        //yes no
        JButton yesB = new JButton();
        JButton noB = new JButton();
        //กูลอกแชท
        public ourButton() { //conturtour
            // Add ActionListener to buttons
            startB.addActionListener(this);
            allFoodB.addActionListener(this);
            thaiFoodB.addActionListener(this);
            asianFoodB.addActionListener(this);
            healthyFoodB.addActionListener(this);
            fastFoodB.addActionListener(this);
            snackFoodB.addActionListener(this);
            randomB.addActionListener(this);
            yesB.addActionListener(this);
            noB.addActionListener(this);
        }
    
        public void actionPerformed(ActionEvent e) {
            // Handle button clicks here
            if (e.getSource() == startB){
                // Code for the "Start" button

                //ให้ลบทุกอย่างในเฟรมและสร้างหน้าต่อไป
            } else if (e.getSource() == allFoodB) {
                // Code for the "All Food" button
            } else if (e.getSource() == thaiFoodB) {
                // Code for the "Thai Food" button
            }
            // Add similar if-else conditions for other buttons
        }
    
        // You can add more methods or code here as needed
        // public void actionPerformed(ActionEvent e){
    
        // }
    


}
