package utils;

import scenes.yesOrNoFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Objects;

public class RandomB{
    private final JButton randomButton;
    private final RandomFrame ranF;
    private char type;
    private final  ImageIcon ranPic1;
    private final java.awt.Image ranPic2;

    public RandomB(RandomFrame ranF,char x) {
        type = x;
        this.ranF = ranF;
        // สร้าง JButton AllF
        randomButton = new JButton();
        ranPic1 = new ImageIcon("img/100.png");
        ranPic2 = ranPic1.getImage().getScaledInstance(300,300, java.awt.Image.SCALE_SMOOTH);
        randomButton.setIcon(new ImageIcon(ranPic2));
        randomButton.setOpaque(false);
        randomButton.setContentAreaFilled(false);
        randomButton.setBorderPainted(false);
        randomButton.setBorder(BorderFactory.createEmptyBorder());

    }


    public JButton getRandomButton1() {
        return randomButton;
    }
    public int getWeightRanPic() { return ranPic2.getWidth(null); }
    public int getHeightRanPic() { return ranPic2.getHeight(null); }
}