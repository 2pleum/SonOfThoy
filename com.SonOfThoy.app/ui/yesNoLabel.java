package ui;
import scenes.yesOrNoFrame;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;

public class yesNoLabel {
    private final JLabel nameFood;
    private final yesOrNoFrame yesNoF;
    private String name;
    private char type;

    public yesNoLabel(yesOrNoFrame yesNoF) {
        this.yesNoF = yesNoF;
        nameFood = new JLabel();
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("img/Myfont/ZF#2ndPixelus.ttf")).deriveFont(80f);
            nameFood.setFont(customFont);
            nameFood.setForeground(new Color(0x7C5A5A));
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            // จัดการข้อผิดพลาด
        }


    }

    public void setType(char x){
        type = x;
    }

    public void setName(String n) {
        name = n;
        nameFood.setText(name);
        nameFood.setBounds((yesNoF.getWidth() - (nameFood.getPreferredSize().width)+5) / 2, yesNoF.getHeight()/2 - 230, nameFood.getPreferredSize().width+5, nameFood.getPreferredSize().height+20);
    }


    public JLabel getNameFood() {
        return nameFood;
    }
}