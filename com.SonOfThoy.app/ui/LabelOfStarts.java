package ui;

import scenes.MainFrame;

import javax.swing.*;
import java.awt.*;

public class LabelOfStarts extends JLabel {
    private final Image images;
    public LabelOfStarts() {

        ImageIcon image = new ImageIcon("img/start2.png");
        images = image.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(images));
        this.setOpaque(false);
        this.setBorder(BorderFactory.createEmptyBorder());

    }

    public float getIconHeight(){
        return images.getHeight(null);
    }

    public float getIconWidth(){
        return images.getWidth(null);
    }

}