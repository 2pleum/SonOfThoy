package scenes;

import ui.ButtonToStart;
import ui.LabelOfStarts;

import javax.swing.*;
import java.awt.*;
public class MainFrame extends JFrame{

    public MainFrame() {
        // สร้างอ็อบเจ็กต์ของ ButtontoStart
        ButtonToStart startButton;
        LabelOfStarts labelOfStarts;

        labelOfStarts = new LabelOfStarts();
        labelOfStarts.setBounds(((this.getWidth() - labelOfStarts.getWidth()) / 2), ((this.getHeight() - labelOfStarts.getHeight()) / 2), labelOfStarts.getWidth(), labelOfStarts.getHeight());


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
        startButton.setBounds((int)((this.getWidth() - w) / 2), (int)((this.getHeight() - w) / 2), (int)w, (int) h);

        // เพิ่มปุ่มลงใน MainFrame
        this.add(startButton);
        this.add(labelOfStarts);
        labelOfStarts.setVisible(false);
        startButton.setVisible(true);

    }

}