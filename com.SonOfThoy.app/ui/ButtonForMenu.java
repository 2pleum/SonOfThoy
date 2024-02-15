package ui;

import scenes.MenuFrame;
import utils.RandomFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonForMenu implements ActionListener {

    private final JButton allmenuButton;
    private final JButton thaiFoodButton;
    private final JButton asianFoodButton; // เปลี่ยนชื่อตัวแปรจาก AsainFood เป็น foods.AsianFood
    private final JButton healthyFoodButton; // เปลี่ยนชื่อตัวแปรเป็น healthyFoodButton
    private final JButton westernFoodButton;
    private final JButton snackButton;
    private final MenuFrame menuframe;
    private char type;

    public ButtonForMenu(MenuFrame menuframe) {
        this.menuframe = menuframe;
        // สร้าง JButton สำหรับเมนูทั้งหมด
        allmenuButton = new JButton("All Menu");
        allmenuButton.setPreferredSize(new Dimension(200, 100));
        allmenuButton.addActionListener(this);

        // สร้าง JButton สำหรับอาหารไทย
        thaiFoodButton = new JButton("Thai Food");
        thaiFoodButton.setPreferredSize(new Dimension(200, 100));
        thaiFoodButton.addActionListener(this);

        asianFoodButton = new JButton("Asian Food");
        asianFoodButton.setPreferredSize(new Dimension(200, 100));
        asianFoodButton.addActionListener(this);

        westernFoodButton = new JButton("Western Food");
        westernFoodButton.setPreferredSize(new Dimension(200, 100));
        westernFoodButton.addActionListener(this);

        healthyFoodButton = new JButton("Healthy Food");
        healthyFoodButton.setPreferredSize(new Dimension(200, 100));
        healthyFoodButton.addActionListener(this);

        snackButton = new JButton("Snack&Sweet");
        snackButton.setPreferredSize(new Dimension(200, 100));
        snackButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == allmenuButton) {
            type = 'A';
            menuframe.setVisible(false);
            RandomFrame ranf = new RandomFrame();
            ranf.setType(type);
        } else if (e.getSource() == thaiFoodButton) {
            type = 'T';
            menuframe.setVisible(false);
            RandomFrame ranf = new RandomFrame();
            ranf.setType(type);
        } else if (e.getSource() == asianFoodButton) {
            type = 'I';
            menuframe.setVisible(false);
            RandomFrame ranf = new RandomFrame();
            ranf.setType(type);
        } else if (e.getSource() == healthyFoodButton) {
            type = 'H';
            menuframe.setVisible(false);
            RandomFrame ranf = new RandomFrame();
            ranf.setType(type);
        } else if (e.getSource() == westernFoodButton) {
            type = 'W';
            menuframe.setVisible(false);
            RandomFrame ranf = new RandomFrame();
            ranf.setType(type);
        } else if (e.getSource() == snackButton) {
            type = 'S';
            menuframe.setVisible(false);
            RandomFrame ranf = new RandomFrame();
            ranf.setType(type);
        }

    }


    // เมทอดสำหรับคืนค่า JButton สำหรับเมนูทั้งหมด
    public JButton getAllmenuButton() {
        return allmenuButton;
    }

    // เมทอดสำหรับคืนค่า JButton สำหรับอาหารไทย
    public JButton getThaiFoodButton() {
        return thaiFoodButton;
    }

    public JButton getAsianFoodButton() {
        return asianFoodButton;
    }

    public JButton getWesternFoodButton() {
        return westernFoodButton;
    }

    public JButton getHealthyFoodButton() {
        return healthyFoodButton;
    }

    public JButton getSnackButton() {
        return snackButton;
    }


}
