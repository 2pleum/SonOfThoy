package scenes;

import javax.swing.*;
import java.awt.*;

public class FrameofSnackandsweet extends JFrame {

    FrameofSnackandsweet() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}