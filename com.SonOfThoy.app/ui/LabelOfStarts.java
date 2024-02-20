package ui;

import scenes.MainFrame;

import javax.swing.*;
import java.awt.*;

public class LabelOfStarts extends JLabel {
    private final Image images;
    public LabelOfStarts(MainFrame mainFrame) {

        ImageIcon image = new ImageIcon("img/start2.png");
        images = image.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(images));
        this.setPreferredSize(new Dimension(images.getWidth(null), images.getHeight(null)));
        this.setOpaque(false);
        this.setBorder(BorderFactory.createEmptyBorder());
        //this.setBounds(200,400,300,300);
        //this.setBounds((w-images.getWidth(null))/2,(h-images.getHeight(null))/2,images.getWidth(null),images.getHeight(null));

    }

    public float getIconHeight(){
        return images.getHeight(null);
    }

    public float getIconWidth(){
        return images.getWidth(null);
    }

}