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
public class exitButton implements ActionListener  {
    private final ImageIcon image;
    private final JButton outB;
    private final Image images;
    private MenuFrame menuframe;
    private RandomFrame randomFrame;
    private yesOrNoFrame yesNoF;
    private LastFrame lastF;
    private final char typeF;
    public exitButton(MenuFrame menuframe,char x) {
        this.menuframe = menuframe;
        typeF = x;
        //
        outB = new JButton();
        image = new ImageIcon("img/202.png");
        images = image.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
        outB.setIcon(new ImageIcon(images)); // Convert Image to ImageIcon before setting it as icon
        outB.setOpaque(false);
        outB.setContentAreaFilled(false);
        outB.setBorderPainted(false);
        outB.setBorder(BorderFactory.createEmptyBorder());
        outB.addActionListener(this);
    }
    public exitButton(RandomFrame randomFrame, char x) {
        this.randomFrame = randomFrame;
        typeF = x;
        //
        outB = new JButton();
        image = new ImageIcon("img/202.png");
        images = image.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
        outB.setIcon(new ImageIcon(images)); // Convert Image to ImageIcon before setting it as icon
        outB.setOpaque(false);
        outB.setContentAreaFilled(false);
        outB.setBorderPainted(false);
        outB.setBorder(BorderFactory.createEmptyBorder());
        outB.addActionListener(this);
    }
    //
    public exitButton(yesOrNoFrame yesNoF, char x) {
        this.yesNoF = yesNoF;
        typeF = x;
        //
        outB = new JButton();
        image = new ImageIcon("img/202.png");
        images = image.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
        outB.setIcon(new ImageIcon(images)); // Convert Image to ImageIcon before setting it as icon
        outB.setOpaque(false);
        outB.setContentAreaFilled(false);
        outB.setBorderPainted(false);
        outB.setBorder(BorderFactory.createEmptyBorder());
        outB.addActionListener(this);
    }

    public exitButton(LastFrame lastF, char x) {
        this.lastF = lastF;
        typeF = x;
        //
        outB = new JButton();
        image = new ImageIcon("img/202.png");
        images = image.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
        outB.setIcon(new ImageIcon(images)); // Convert Image to ImageIcon before setting it as icon
        outB.setOpaque(false);
        outB.setContentAreaFilled(false);
        outB.setBorderPainted(false);
        outB.setBorder(BorderFactory.createEmptyBorder());
        outB.addActionListener(this);
    }
    public int getWeightImg() { return images.getWidth(null); }
    public int getHeightImg() { return images.getHeight(null); }
    public JButton getOutButton() {
        return outB;
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == outB){
            System.out.println(typeF);
            if(typeF == 'M'){menuframe.setVisible(false);}
            else if(typeF == 'R'){randomFrame.setVisible(false);}
            else if(typeF == 'Y'){yesNoF.setVisible(false);} //ปิดแต่ละอันอ่ะ
            else if(typeF == 'L'){lastF.setVisible(false);}
        }
    }
}
//






