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
    private final JLabel thoy;

    public MainFrame() {
        // สร้างอ็อบเจ็กต์ของ ButtontoStart
        labelOfStarts = new LabelOfStarts();
        startButton = new ButtonToStart();
        thoy = new JLabel();
        // ตั้งค่าของ MainFrame
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLayout(null); // ใช้ null layout
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // ทำให้อยู่ตรงกลาง
        this.getContentPane().setBackground(new Color(0xFDD4F0));

        float w = startButton.getIconWidth();
        float h = startButton.getIconHeight();
        startButton.setBounds((int)((this.getWidth() - w) / 2), (int)((this.getHeight() - h) / 2), (int)w, (int) h);
        startButton.addActionListener(this);


        float wl = labelOfStarts.getIconWidth();
        float hl = labelOfStarts.getIconHeight();
        labelOfStarts.setBounds((int)((this.getWidth() - wl) / 2), (int)((this.getHeight() - hl) / 2), (int)wl, (int) hl);

        ImageIcon pthoy = new ImageIcon("png/thoy.gif");
        Image pt = pthoy.getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH);
        thoy.setIcon(new ImageIcon(pt));
        thoy.setOpaque(false);
        thoy.setBorder(BorderFactory.createEmptyBorder());
        //thoy.setBounds(50, this.getHeight()-pt.getHeight(null), pt.getWidth(null), pt.getHeight(null));
        thoy.setBounds(200,200 ,pt.getWidth(null), pt.getHeight(null));

        // เพิ่มปุ่มลงใน MainFrame
        this.add(startButton);
        this.add(labelOfStarts);
        this.add(thoy);
        labelOfStarts.setVisible(false);
        startButton.setVisible(true);
        thoy.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            startButton.setVisible(false);
            labelOfStarts.setVisible(true);

            // ให้ Label แสดงก่อนด้วย SwingUtilities.invokeLater()
            SwingUtilities.invokeLater(() -> {
                // สร้างและแสดงหน้าต่าง MenuFrame
                MenuFrame menuframe = new MenuFrame();
                menuframe.setVisible(true);
                // ปิดหน้าต่าง scenes.MainFrame
                this.setVisible(false);
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