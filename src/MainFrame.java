import javax.swing.JFrame;
import java.awt.*;

public class MainFrame extends JFrame{

    MainFrame() {
        // สร้างอ็อบเจ็กต์ของ ButtontoStart
        ButtontoStart startButton = new ButtontoStart(this);
        
        // ตั้งค่าของ MainFrame
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER)); // ใช้ FlowLayout และตั้งค่าให้อยู่ตรงกลาง
        this.add(startButton); // เพิ่มปุ่มลงใน MainFrame
       
        this.setVisible(true);
        // เพิ่มปุ่มลงใน MainFrame

        // ทำให้ MainFrame ปรากฏ
    }
}
