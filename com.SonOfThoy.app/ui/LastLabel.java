package ui;

import scenes.LastFrame;
import utils.Image;

import javax.swing.*;

public class LastLabel {
    private final JLabel thoyL;
    private final LastFrame lastF;
    private ImageIcon thoyPic;

    public LastLabel(LastFrame lastF) {
        this.lastF = lastF;
        thoyL = new JLabel();
        utils.Image img = new Image();
//        thoy.setText("Kuy");

//        thoyL.setPreferredSize(new Dimension(200, 100));
        thoyL.setIcon(img.getThoyPic());
        thoyL.setBounds(0, 0, 1000, 1000);
        //


    }

    public JLabel getThoyL() {
        return thoyL;
    }

}