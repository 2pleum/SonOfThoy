import javax.swing.JFrame;
import java.awt.*;

public class LastFrame extends  JFrame {
//    private char type;
    LastFrame() {
//        yesNoButton yesNoB = new yesNoButton(this);
        LastLabel lastL = new LastLabel(this);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER)); // กำหนด Layout เป็น null เพื่อให้สามารถกำหนดตำแหน่งของปุ่มเองได้

        // เพิ่มปุ่มเมนูที่ต่าง ๆ ลงในหน้าต่าง Menuframe
        this.add(lastL.getThoy()); //ข้อความไม่ออกกรี๊ด
        //            this.setBackground(Color.BLACK); //ใส่สีหลังไงวะ
        this.setVisible(true);
    }
//    public void setType(char x){
//        type = x;
//    }
//    public char getTypeFood(){
//        return type;
//    }
}


