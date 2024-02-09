import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setSize(screenSize.getSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JLabel text = new JLabel("Hello world",JLabel.LEFT);
        text.setSize(100,100);
        frame.add(text);
    }

}