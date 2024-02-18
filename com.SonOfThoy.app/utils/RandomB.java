package utils;

import scenes.yesOrNoFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandomB implements ActionListener {
    private final JButton randomButton;
    private final RandomFrame ranF;
    private char type;

    public RandomB(RandomFrame ranF) {
        this.ranF = ranF;
        // สร้าง JButton AllF
        randomButton = new JButton("Random");
        randomButton.setPreferredSize(new Dimension(200, 100));
//        ImageIcon xxx = new ImageIcon("startB.gif");
//        randomButton1.setIcon(xxx); งงใส่รูปไม่ได้
        randomButton.addActionListener(this);
        //ThaiF

    }
    public void setType(char x){
        type = x;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == randomButton) {
            ranF.setVisible(false);
            yesOrNoFrame yesNoF = new yesOrNoFrame();
            yesNoF.setType(type);
        }
    }

    public JButton getRandomButton1() {
        return randomButton;
    }
}
