package scenes;

import ui.LastLabel;

import javax.swing.*;
import java.awt.*;

public class LastFrame extends JFrame {
    //    private char type;
    public LastFrame() {
        LastLabel lastL = new LastLabel(this);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER)); // กำหนด Layout เป็น null เพื่อให้สามารถกำหนดตำแหน่งของปุ่มเองได้

        this.add(lastL.getThoyL()); //ข้อความไม่ออกกรี๊ด
        this.setVisible(true);
    }
}

