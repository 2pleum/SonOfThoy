import javax.swing.JFrame;
import java.awt.*;

public class randomFrame extends  JFrame {
       randomFrame() {
            randomB ranB = new randomB(this);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            this.getContentPane().setLayout(null);
            this.setVisible(true);
            this.setSize(screenSize.getSize());
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setLayout(new FlowLayout(FlowLayout.CENTER)); // กำหนด Layout เป็น null เพื่อให้สามารถกำหนดตำแหน่งของปุ่มเองได้

            // เพิ่มปุ่มเมนูที่ต่าง ๆ ลงในหน้าต่าง Menuframe
            this.add(ranB.getRandomButton1());
            this.setVisible(true);
        }


    }


