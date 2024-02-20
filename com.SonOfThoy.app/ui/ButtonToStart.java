package ui;
import scenes.MainFrame;
import scenes.MenuFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonToStart extends JButton {
//    private final MainFrame mainFrame;
    private final ImageIcon image;
    private final Image images;

    public ButtonToStart(MainFrame mainFrame) {
        //this.mainFrame = mainFrame;

        //this.labelOfStarts = labelOfStarts;
        image = new ImageIcon("img/start1.png");
        //imageS.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        images = image.getImage().getScaledInstance(300,300, java.awt.Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(images)); // Convert Image to ImageIcon before setting it as icon
        this.setPreferredSize(new Dimension(images.getWidth(null), images.getHeight(null))); // Provide null as ImageObserver
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