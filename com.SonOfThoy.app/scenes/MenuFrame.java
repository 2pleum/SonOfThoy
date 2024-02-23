package scenes;

import ui.ButtonForMenu;

import javax.swing.*;
import java.awt.*;

public class MenuFrame extends JFrame {

    public MenuFrame() {
        ButtonForMenu buttonforMenu = new ButtonForMenu(this);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0xFDD4F0));
        //this.setLayout(new FlowLayout(FlowLayout.CENTER)); // กำหนด Layout เป็น null เพื่อให้สามารถกำหนดตำแหน่งของปุ่มเองได้
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        // เพิ่มปุ่มเมนูที่ต่าง ๆ ลงในหน้าต่าง scenes.Menuframe
        JButton all = buttonforMenu.getAllMenuButton();
        gbc.gridx = 0; // ตำแหน่งในแนวแกน X
        gbc.gridy = 0; // ตำแหน่งในแนวแกน Y
        gbc.insets = new Insets(0, 10, 10, 10); // ระยะห่างของปุ่มจากขอบ
        this.add(all, gbc); // เพิ่มปุ่มลงใน JFrame


        JButton thai = buttonforMenu.getThaiFoodButton();
        gbc.gridx = 1; // ตำแหน่งในแนวแกน X
        gbc.gridy = 0; // ตำแหน่งในแนวแกน Y
        gbc.insets = new Insets(0, 10, 10, 10); // ระยะห่างของปุ่มจากขอบ
        this.add(thai, gbc); // เพิ่มปุ่มลงใน JFrame


        JButton asian = buttonforMenu.getAsianFoodButton();
        gbc.gridx = 2; // ตำแหน่งในแนวแกน X
        gbc.gridy = 0; // ตำแหน่งในแนวแกน Y
        gbc.insets = new Insets(0, 10, 10, 10); // ระยะห่างของปุ่มจากขอบ
        this.add(asian, gbc); // เพิ่มปุ่มลงใน JFrame


        JButton healthy = buttonforMenu.getHealthyFoodButton();
        gbc.gridx = 0; // ตำแหน่งในแนวแกน X
        gbc.gridy = 1; // ตำแหน่งในแนวแกน Y
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0, 10, 10, 10); // ระยะห่างของปุ่มจากขอบ
        this.add(healthy, gbc); // เพิ่มปุ่มลงใน JFrame

        JButton west = buttonforMenu.getWesternFoodButton();
        gbc.gridx = 1; // ตำแหน่งในแนวแกน X
        gbc.gridy = 1; // ตำแหน่งในแนวแกน Y
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0, 10, 10, 10); // ระยะห่างของปุ่มจากขอบ
        this.add(west, gbc); // เพิ่มปุ่มลงใน JFrame

        JButton snack = buttonforMenu.getSnackButton();
        gbc.gridx = 2; // ตำแหน่งในแนวแกน X
        gbc.gridy = 1; // ตำแหน่งในแนวแกน Y
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0, 10, 10, 10); // ระยะห่างของปุ่มจากขอบ
        this.add(snack, gbc); // เพิ่มปุ่มลงใน JFrame



        this.setVisible(true);
    }

}
