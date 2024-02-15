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
        this.setLayout(new FlowLayout(FlowLayout.CENTER)); // กำหนด Layout เป็น null เพื่อให้สามารถกำหนดตำแหน่งของปุ่มเองได้

        // เพิ่มปุ่มเมนูที่ต่าง ๆ ลงในหน้าต่าง scenes.Menuframe
        this.add(buttonforMenu.getAllmenuButton());
        this.add(buttonforMenu.getThaiFoodButton());
        this.add(buttonforMenu.getAsianFoodButton()); // เพิ่มปุ่ม Asian Food
        this.add(buttonforMenu.getWesternFoodButton()); // เพิ่มปุ่ม Fast Food
        this.add(buttonforMenu.getHealthyFoodButton());
        this.add(buttonforMenu.getSnackButton());

        this.setVisible(true);
    }

    // public static void main(String[] args) {
    //     scenes.Menuframe menuframe = new scenes.Menuframe();
    // }
}