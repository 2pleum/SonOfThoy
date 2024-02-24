package scenes;
import ui.ButtonToStart;
import ui.LabelOfStarts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    private final ButtonToStart buttonToStart;
    private final LabelOfStarts labelOfStarts;


    public MainFrame() {
        // สร้างอ็อบเจ็กต์ของ ButtontoStart
        labelOfStarts = new LabelOfStarts();
        buttonToStart = new ButtonToStart();
        //buttonToStart = new ButtonToStart();
        // ตั้งค่าของ MainFrame
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLayout(null); // ใช้ null layout
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // ทำให้อยู่ตรงกลาง
        this.getContentPane().setBackground(new Color(0xFDD4F0));

        float w = buttonToStart.getIconWidth();
        float h = buttonToStart.getIconHeight();
        buttonToStart.setBounds((int)((this.getWidth() - w) / 2), (int)((this.getHeight() - h) / 2), (int)w, (int) h);
        buttonToStart.addActionListener(this);


        float wl = labelOfStarts.getIconWidth();
        float hl = labelOfStarts.getIconHeight();
        labelOfStarts.setBounds((int)((this.getWidth() - wl) / 2), (int)((this.getHeight() - hl) / 2), (int)wl, (int) hl);

        JLabel thoy = setThoy();
        thoy.setBounds(0,this.getHeight()-300,300,300);

        JLabel lion = setLion();
        lion.setBounds(100,this.getHeight()-310, 300, 300);

        // เพิ่มปุ่มลงใน MainFrame
        this.add(buttonToStart);
        this.add(labelOfStarts);
        this.add(thoy);
        this.add(lion);
        thoy.setVisible(true);
        lion.setVisible(true);
        buttonToStart.setVisible(true);
        labelOfStarts.setVisible(false);
        this.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonToStart) {
            buttonToStart.setVisible(false);
            labelOfStarts.setVisible(true);
            // สร้างและแสดงหน้าต่าง MenuFrame นอกเส้นทางของ EDT
            SwingUtilities.invokeLater(() -> {
                MenuFrame menuframe = new MenuFrame();
                menuframe.setVisible(true);

                // ปิดหน้าต่างปัจจุบันด้วย setVisible(false)
                this.setVisible(false);
            });
        }
    }

    public JLabel setThoy(){
        ImageIcon gifIcon = new ImageIcon("img/thoy.gif");
        // Resize GIF (optional)
        Image gifImage = gifIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon resizedGifIcon = new ImageIcon(gifImage);
        JLabel gifLabel = new JLabel(resizedGifIcon);

        return gifLabel;
    }

    public  JLabel setLion(){
        ImageIcon gifIcon = new ImageIcon("img/lion.gif");
        // Resize GIF (optional)
        Image gifImage = gifIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon resizedGifIcon = new ImageIcon(gifImage);
        JLabel gifLabel = new JLabel(resizedGifIcon);

        return gifLabel;
    }

}