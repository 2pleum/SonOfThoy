package ui;

import scenes.MainFrame;
import scenes.MenuFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonToStart extends JButton implements ActionListener {
    private final MainFrame mainFrame;

    public ButtonToStart(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
//        ImageIcon image = new ImageIcon("6422199.png");
//        this.setIcon(image);
//        ImageIcon xxx = new ImageIcon("startB.gif");

//        ImageIcon xxx = new ImageIcon("path/to/startB.gif");
//        this.setIcon(xxx);
//        this.setRolloverIcon(xxx);

//        this.setPressedIcon(xxx);
        this.setPreferredSize(new Dimension(250, 250)); // ปรับขนาดเป็น 150x30
        this.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            // ปิดหน้าต่าง scenes.MainFrame
            mainFrame.setVisible(false);

            // เปิดหน้าต่าง MenuFrame
            MenuFrame menuframe = new MenuFrame();
            menuframe.setVisible(true); // เรียกใช้ setVisible(true) เพื่อให้ scenes.Menuframe ปรากฏบนหน้าจอ
        }
    }
}
