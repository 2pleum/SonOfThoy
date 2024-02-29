package ui;

import scenes.LastFrame;
import utils.Image;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class LastLabel {
    private final JLabel nameFood;
    private String name;
    public LastLabel(LastFrame lastF,String name) {
        this.name = name;
        nameFood = new JLabel(name);
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("img/Myfont/ZF#2ndPixelus.ttf")).deriveFont(80f);
            nameFood.setFont(customFont);
            nameFood.setForeground(new Color(0x7C5A5A));

        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            // จัดการข้อผิดพลาด
        }


    }

    public JLabel getNameFood() {
        return nameFood;
    }

}