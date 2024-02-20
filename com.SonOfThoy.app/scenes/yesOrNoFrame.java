package scenes;

import ui.yesNoButton;
import ui.yesNoLabel;

import javax.swing.*;
import java.awt.*;

public class yesOrNoFrame extends JFrame {
    private char type;

    public yesOrNoFrame() {
        yesNoButton yesNoB = new yesNoButton(this);
        yesNoLabel yesNoL = new yesNoLabel(this);
        yesNoL.setType(type);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER)); // กำหนด Layout เป็น null เพื่อให้สามารถกำหนดตำแหน่งของปุ่มเองได้

        // เพิ่มปุ่มเมนูที่ต่าง ๆ ลงในหน้าต่าง scenes.Menuframe
        this.add(yesNoB.getYesB());
        this.add(yesNoB.getNoB());
        this.add(yesNoL.getNameFood()); //ข้อความไม่ออกกรี๊ด
        //            this.setBackground(Color.BLACK); //ใส่สีหลังไงวะ
        this.setVisible(true);
    }
    public void setType(char x){
        type = x;
    }
//    public char getTypeFood(){
//        return type;
//    }
}


