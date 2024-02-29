package ui;

import scenes.LastFrame;
import utils.Image;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class lastL2 {
    private JLabel thoySay,thoySay2;
    public lastL2(LastFrame lastF) {
        thoySay = new JLabel("วันนี้พี่ตอย");
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("img/Myfont/ZF#2ndPixelus.ttf")).deriveFont(80f);
            thoySay.setFont(customFont);
            thoySay.setForeground(new Color(0x7C5A5A));

        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            // จัดการข้อผิดพลาด
        }
        //
        thoySay2 = new JLabel("ขอนำเสนอเมนู");
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("img/Myfont/ZF#2ndPixelus.ttf")).deriveFont(80f);
            thoySay2.setFont(customFont);
            thoySay2.setForeground(new Color(0x7C5A5A));

        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            // จัดการข้อผิดพลาด
        }


    }

    public JLabel getThoy() {
        return thoySay;
    }
    public JLabel getThoy2() {
        return thoySay2;
    }


}