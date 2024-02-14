
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class LastLabel {
    private JLabel thoy;
    private LastFrame lastF;
    private ImageIcon thoyPic;
    public LastLabel(LastFrame lastF) {
        this.lastF = lastF;
        thoy = new JLabel();
        thoyPic = new ImageIcon("lastFPic.jpg");
        thoy.setText("Kuy");

        thoy.setPreferredSize(new Dimension(200, 100));
        thoy.setIcon(thoyPic);
    }
    public JLabel getThoy(){
        return thoy;
    }

}
