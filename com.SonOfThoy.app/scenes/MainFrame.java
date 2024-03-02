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
        buttonToStart.setBounds((int)((this.getWidth() - w) / 2) + 100, (int)(this.getHeight() / 2) + 150, (int)w, (int) h);
        buttonToStart.addActionListener(this);


        float wl = labelOfStarts.getIconWidth();
        float hl = labelOfStarts.getIconHeight();
        labelOfStarts.setBounds((int)((this.getWidth() - wl) / 2) + 100, (int)(this.getHeight() /2) + 150, (int)wl, (int) hl);


        JLabel back = setbackground();
        JLabel icon = setIconthoy();

        // เพิ่มปุ่มลงใน MainFrame
        this.add(buttonToStart);
        this.add(labelOfStarts);
        this.add(icon);
        this.add(back);
        back.setVisible(true);
        icon.setVisible(true);
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
                this.setVisible(false);
                menuframe.setVisible(true);
                // ปิดหน้าต่างปัจจุบันด้วย setVisible(false)
//                this.setVisible(false);
            });
        }
    }


    public JLabel setbackground(){
        ImageIcon back = new ImageIcon("img/background.png");
        Image backs = back.getImage().getScaledInstance(this.getWidth(),this.getHeight()-50,Image.SCALE_SMOOTH);
        ImageIcon back1 = new ImageIcon(backs);
        JLabel back2 = new JLabel(back1);
        back2.setBounds(0,0,this.getWidth(),this.getHeight()-50);
        return back2;
    }

    public JLabel setIconthoy(){
        ImageIcon t = new ImageIcon("img/iconthoy.png");
        Image tt = t.getImage().getScaledInstance(250,250,Image.SCALE_SMOOTH);
        ImageIcon back1 = new ImageIcon(tt);
        JLabel th = new JLabel(back1);
        th.setBounds((this.getWidth()/ 2) -250,(this.getHeight()/2) + 130,250,250);
        return th;
    }

}