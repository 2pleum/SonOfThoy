package ui;
import scenes.MainFrame;
import scenes.MenuFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class ButtonToStart extends JButton {
//    private final MainFrame mainFrame;
    private final ImageIcon image;
    private final Image images;

    public ButtonToStart() {
        image = new ImageIcon("img/start1.png");
        images = image.getImage().getScaledInstance(300,300, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(images)); // Convert Image to ImageIcon before setting it as icon
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setBorder(BorderFactory.createEmptyBorder());
        //this.addActionListener(this);

    }

    public float getIconHeight(){
        return images.getHeight(null);
    }

    public float getIconWidth(){
        return images.getWidth(null);
    }

}