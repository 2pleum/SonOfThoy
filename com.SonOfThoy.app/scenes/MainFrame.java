package scenes;

import ui.ButtonToStart;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        // สร้างอ็อบเจ็กต์ของ ui.ButtontoStart
        ButtonToStart startButton = new ButtonToStart(this);

        // ตั้งค่าของ scenes.MainFrame
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER)); // ใช้ FlowLayout และตั้งค่าให้อยู่ตรงกลาง
        this.add(startButton); // เพิ่มปุ่มลงใน scenes.MainFrame

        this.setVisible(true);
        // เพิ่มปุ่มลงใน scenes.MainFrame

        // ทำให้ scenes.MainFrame ปรากฏ
    }
}
