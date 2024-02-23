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

    private Image alls;
    private Image thais;
    private Image asians;
    private Image wests;
    private Image healthys;
    private Image snacks;

    public ButtonForMenu(MenuFrame menuframe) {
        this.menuframe = menuframe;


        // สร้าง JButton สำหรับเมนูทั้งหมด
        allmenuButton = new JButton();
        ImageIcon all = new ImageIcon("img/all.png");
        alls = all.getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH);
        allmenuButton.setIcon(new ImageIcon(alls));
        allmenuButton.setOpaque(false);
        allmenuButton.setContentAreaFilled(false);
        allmenuButton.setBorderPainted(false);
        allmenuButton.setBorder(BorderFactory.createEmptyBorder());
        allmenuButton.addActionListener(this);


        // สร้าง JButton สำหรับอาหารไทย
        thaiFoodButton = new JButton();
        ImageIcon thai = new ImageIcon("img/thai.png");
        thais = thai.getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH);
        thaiFoodButton.setIcon(new ImageIcon(thais));
        thaiFoodButton.setOpaque(false);
        thaiFoodButton.setContentAreaFilled(false);
        thaiFoodButton.setBorderPainted(false);
        thaiFoodButton.setBorder(BorderFactory.createEmptyBorder());
        thaiFoodButton.addActionListener(this);


        asianFoodButton = new JButton();
        ImageIcon asian = new ImageIcon("img/asian.png");
        asians = asian.getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH);
        asianFoodButton.setIcon(new ImageIcon(asians));
        asianFoodButton.setOpaque(false);
        asianFoodButton.setContentAreaFilled(false);
        asianFoodButton.setBorderPainted(false);
        asianFoodButton.setBorder(BorderFactory.createEmptyBorder());
        asianFoodButton.addActionListener(this);


        westernFoodButton = new JButton();
        ImageIcon west = new ImageIcon("img/western.png");
        wests = west.getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH);
        westernFoodButton.setIcon(new ImageIcon(wests));
        westernFoodButton.setOpaque(false);
        westernFoodButton.setContentAreaFilled(false);
        westernFoodButton.setBorderPainted(false);
        westernFoodButton.setBorder(BorderFactory.createEmptyBorder());
        westernFoodButton.addActionListener(this);


        healthyFoodButton = new JButton();
        ImageIcon healthy = new ImageIcon("img/clean.png");
        healthys = healthy.getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH);
        healthyFoodButton.setIcon(new ImageIcon(healthys));
        healthyFoodButton.setOpaque(false);
        healthyFoodButton.setContentAreaFilled(false);
        healthyFoodButton.setBorderPainted(false);
        healthyFoodButton.setBorder(BorderFactory.createEmptyBorder());
        healthyFoodButton.addActionListener(this);


        snackButton = new JButton();
        ImageIcon snack = new ImageIcon("img/snack.png");
        snacks = snack.getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH);
        snackButton.setIcon(new ImageIcon(snacks));
        snackButton.setOpaque(false);
        snackButton.setContentAreaFilled(false);
        snackButton.setBorderPainted(false);
        snackButton.setBorder(BorderFactory.createEmptyBorder());
        snackButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == allmenuButton) {
            type = 'A';
            RandomFrame ranf = new RandomFrame(type);
            menuframe.setVisible(false);

        } else if (e.getSource() == thaiFoodButton) {
            type = 'T';
            RandomFrame ranf = new RandomFrame(type);
            menuframe.setVisible(false);

        } else if (e.getSource() == asianFoodButton) {
            type = 'I';
            RandomFrame ranf = new RandomFrame(type);
            menuframe.setVisible(false);

        } else if (e.getSource() == healthyFoodButton) {
            type = 'H';
            RandomFrame ranf = new RandomFrame(type);
            menuframe.setVisible(false);

        } else if (e.getSource() == westernFoodButton) {
            type = 'W';
            RandomFrame ranf = new RandomFrame(type);
            menuframe.setVisible(false);

        } else if (e.getSource() == snackButton) {
            type = 'S';
            RandomFrame ranf = new RandomFrame(type);
            menuframe.setVisible(false);
        }
    }


    // เมทอดสำหรับคืนค่า JButton สำหรับเมนูทั้งหมด
    public JButton getAllMenuButton() {
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

    public JButton getSnackButton() { return snackButton; }

}
