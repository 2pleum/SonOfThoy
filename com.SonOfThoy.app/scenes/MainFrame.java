package scenes;

import ui.ButtonToStart;
import ui.LabelOfStarts;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    private final ButtonToStart startButton;
    private final LabelOfStarts labelOfStarts;

    public MainFrame() {
        // สร้างอ็อบเจ็กต์ของ ButtontoStart
        labelOfStarts = new LabelOfStarts(this);
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
        startButton.setBounds((int)((this.getWidth() - w) / 2), (int)((this.getHeight() - h) / 2), (int)w, (int) h);
        startButton.addActionListener(this);
        float wl = labelOfStarts.getIconWidth();
        float hl = labelOfStarts.getIconHeight();
        labelOfStarts.setBounds((int)((this.getWidth() - wl) / 2), (int)((this.getHeight() - hl) / 2), (int)wl, (int) hl);



        // เพิ่มปุ่มลงใน MainFrame
        this.add(startButton);
        this.add(labelOfStarts);
        labelOfStarts.setVisible(false);
        startButton.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            startButton.setVisible(false);
            labelOfStarts.setVisible(true);

            // ให้ Label แสดงก่อนด้วย SwingUtilities.invokeLater()
            SwingUtilities.invokeLater(() -> {
                // ปิดหน้าต่าง scenes.MainFrame
                this.setVisible(false);

                // สร้างและแสดงหน้าต่าง MenuFrame
                MenuFrame menuframe = new MenuFrame();
                menuframe.setVisible(true);
            });
        }
    }



    public void showMenuFrame() {
        // ปิดหน้าต่าง scenes.MainFrame
        this.setVisible(false);

        // เปิดหน้าต่าง MenuFrame
        MenuFrame menuframe = new MenuFrame();
        menuframe.setVisible(true); // เรียกใช้ setVisible(true) เพื่อให้ scenes.Menuframe ปรากฏบนหน้าจอ
    }


}