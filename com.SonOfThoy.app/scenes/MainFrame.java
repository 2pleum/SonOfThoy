package scenes;

import ui.ButtonToStart;
import javax.swing.*;
import java.awt.*;
public class MainFrame extends JFrame{

    public MainFrame() {
        // สร้างอ็อบเจ็กต์ของ ButtontoStart
        ButtonToStart startButton;
        startButton = new ButtonToStart(this);

        // ตั้งค่าของ MainFrame
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLayout(null); // ใช้ null layout
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // ทำให้อยู่ตรงกลาง
        float w = startButton.getIconWidth();
        float h = startButton.getIconHeight();
        startButton.setBounds((int)((this.getWidth() - 300) / 2), (int)((this.getHeight() - 300) / 2), 300, 300);

        // เพิ่มปุ่มลงใน MainFrame
        this.add(startButton);

    }

}
