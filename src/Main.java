import javax.swing.*;
import java.awt.*;

public class Main {
    public static void setFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setSize(screenSize.getSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        setFrame();
    }
}