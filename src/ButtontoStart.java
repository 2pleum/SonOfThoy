import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtontoStart extends JButton implements ActionListener {
    private MainFrame mainFrame;

    ButtontoStart(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
//        ImageIcon image = new ImageIcon("6422199.png");
//        this.setIcon(image);
//        ImageIcon xxx = new ImageIcon("startB.gif");

//        ImageIcon xxx = new ImageIcon("path/to/startB.gif");
//        this.setIcon(xxx);
//        this.setRolloverIcon(xxx);

//        this.setPressedIcon(xxx);
        this.setPreferredSize(new Dimension(250,250)); // ปรับขนาดเป็น 150x30
        this.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            // ปิดหน้าต่าง MainFrame
            mainFrame.setVisible(false);
            
            // เปิดหน้าต่าง MenuFrame
            Menuframe menuframe = new Menuframe();
            menuframe.setVisible(true); // เรียกใช้ setVisible(true) เพื่อให้ Menuframe ปรากฏบนหน้าจอ
        }
    }
}
