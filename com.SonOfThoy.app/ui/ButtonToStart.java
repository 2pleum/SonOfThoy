package ui;
import scenes.MainFrame;
import scenes.MenuFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonToStart extends JButton implements ActionListener {
    private final MainFrame mainFrame;
    private final ImageIcon image;
    public ButtonToStart(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        image = new ImageIcon("img/S__4571152.jpg");
        this.setIcon(image); // ตั้งรูปภาพให้กับปุ่ม
        this.setPreferredSize(new Dimension(300, 300)); // ปรับขนาดเป็น 250x250
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setBorder(BorderFactory.createEmptyBorder()); // ลบขอบของปุ่ม
        this.addActionListener(this); // เพิ่ม ActionListener เพื่อจัดการเหตุการณ์การคลิกปุ่ม

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

    public float getIconHeight(){
        return image.getIconHeight();
    }

    public float getIconWidth(){
        return image.getIconWidth();
    }

}