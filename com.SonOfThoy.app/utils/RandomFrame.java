package utils;

import javax.swing.*;
import java.awt.*;

public class RandomFrame extends JFrame {
    private char type;

    public RandomFrame(char x) {
        type = x;
        RandomB ranB = new RandomB(this);
        ranB.setType(type);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0xFDD4F0));
        this.setLayout(new FlowLayout(FlowLayout.CENTER)); // กำหนด Layout เป็น null เพื่อให้สามารถกำหนดตำแหน่งของปุ่มเองได้

        // เพิ่มปุ่มเมนูที่ต่าง ๆ ลงในหน้าต่าง scenes.Menuframe
        this.add(ranB.getRandomButton1());
        //เราจะรุู้ได้ไงว่าปุ่มไหนต้องสุ่มอันไหนยังไง สร้างcharบอกชนิด ดีมั้ยจะได้้ไม่ต้องทำrandom 6 ปุม
        //            this.setBackground(Color.BLACK); //ใส่สีหลังไงวะ
        this.setVisible(true);
    }
}

