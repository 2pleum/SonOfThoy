package ui;
import scenes.LastFrame;
import scenes.MainFrame;
import scenes.MenuFrame;
import scenes.yesOrNoFrame;
import utils.RandomFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
public class goHomeButton implements ActionListener  {
    private final ImageIcon image;
    private final JButton homeB;
    private final Image images;
    private MenuFrame menuframe;
    private RandomFrame randomFrame;
    private yesOrNoFrame yesNoF;
    private LastFrame lastF;
    private char typeF;
    public goHomeButton(MenuFrame menuframe,char type) {
        this.menuframe = menuframe;
        typeF = type;
        //
        homeB = new JButton();
        image = new ImageIcon("img/203.png");
        images = image.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
        homeB.setIcon(new ImageIcon(images)); // Convert Image to ImageIcon before setting it as icon
        homeB.setOpaque(false);
        homeB.setContentAreaFilled(false);
        homeB.setBorderPainted(false);
        homeB.setBorder(BorderFactory.createEmptyBorder());
        homeB.addActionListener(this);
    }
    public goHomeButton(RandomFrame randomFrame,char type) {
        this.randomFrame = randomFrame;
        typeF = type;
        //
        homeB = new JButton();
        image = new ImageIcon("img/203.png");
        images = image.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
        homeB.setIcon(new ImageIcon(images)); // Convert Image to ImageIcon before setting it as icon
        homeB.setOpaque(false);
        homeB.setContentAreaFilled(false);
        homeB.setBorderPainted(false);
        homeB.setBorder(BorderFactory.createEmptyBorder());
        homeB.addActionListener(this);
    }
    public goHomeButton(yesOrNoFrame yesNoF,char type) {
        this.yesNoF = yesNoF;
        typeF = type;
        //
        homeB = new JButton();
        image = new ImageIcon("img/203.png");
        images = image.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
        homeB.setIcon(new ImageIcon(images)); // Convert Image to ImageIcon before setting it as icon
        homeB.setOpaque(false);
        homeB.setContentAreaFilled(false);
        homeB.setBorderPainted(false);
        homeB.setBorder(BorderFactory.createEmptyBorder());
        homeB.addActionListener(this);
    }
    public goHomeButton(LastFrame lastF,char type) {
        this.lastF = lastF;
        typeF = type;
        //
        homeB = new JButton();
        image = new ImageIcon("img/203.png");
        images = image.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
        homeB.setIcon(new ImageIcon(images)); // Convert Image to ImageIcon before setting it as icon
        homeB.setOpaque(false);
        homeB.setContentAreaFilled(false);
        homeB.setBorderPainted(false);
        homeB.setBorder(BorderFactory.createEmptyBorder());
        homeB.addActionListener(this);
    }
    //
    public float getIconHeight(){
        return images.getHeight(null);
    }

    public float getIconWidth(){
        return images.getWidth(null);
    }
    public JButton getHomeButton() {
        return homeB;
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == homeB){
            if(typeF == 'M') {
                MainFrame mainFrame = new MainFrame();
                menuframe.setVisible(false);
            }
            else if(typeF == 'R'){
                MainFrame mainFrame = new MainFrame();
                randomFrame.setVisible(false);
            }
            else if(typeF == 'Y'){
                MainFrame mainFrame = new MainFrame();
                yesNoF.setVisible(false);
            }
            else if(typeF == 'L'){
                MainFrame mainFrame = new MainFrame();
                lastF.setVisible(false);
            }
        }
    }
}
//






