
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class LastLabel {
    private JLabel thoyL;
    private LastFrame lastF;
    private ImageIcon thoyPic;
    public LastLabel(LastFrame lastF) {
        this.lastF = lastF;
        thoyL = new JLabel();
        Image img = new Image();
//        thoy.setText("Kuy");

//        thoyL.setPreferredSize(new Dimension(200, 100));
        thoyL.setIcon(img.getThoyPic());
        thoyL.setBounds(0,0,1000,1000);

    }
    public JLabel getThoyL(){
        return thoyL;
    }

}
