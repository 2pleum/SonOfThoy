package ui;

import javax.swing.*;
import java.awt.*;

public class LabelOfStarts extends JLabel {
    private final ImageIcon image;
    private final Image images;

    public LabelOfStarts() {
        image = new ImageIcon("img/start2.png");
        images = image.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);

        this.setIcon(new ImageIcon(images));
        this.setPreferredSize(new Dimension(images.getWidth(null), images.getHeight(null)));
        this.setOpaque(false);
        this.setBorder(BorderFactory.createEmptyBorder());

    }

}