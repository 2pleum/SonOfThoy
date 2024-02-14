import javax.swing.JFrame;
import java.awt.*;

public class LastFrame extends  JFrame {
//    private char type;
    LastFrame() {
        LastLabel lastL = new LastLabel(this);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER)); // กำหนด Layout เป็น null เพื่อให้สามารถกำหนดตำแหน่งของปุ่มเองได้

        this.add(lastL.getThoy()); //ข้อความไม่ออกกรี๊ด
        this.setVisible(true);
    }
}


