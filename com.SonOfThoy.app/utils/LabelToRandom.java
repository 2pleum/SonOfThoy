package utils;
//}
import javax.swing.*;
import java.awt.*;
import java.awt.Image; //งงเพิ่มมาไม
import java.util.Objects;

public class LabelToRandom {
    private final JLabel ranL;
    private final ImageIcon imageRanL1;
    private final Image imgRanL2;

    public LabelToRandom(){
        ranL = new JLabel();
        imageRanL1 = new ImageIcon("img/101.png");
        imgRanL2 = imageRanL1.getImage().getScaledInstance(300,300, java.awt.Image.SCALE_SMOOTH);
        ranL.setIcon(new ImageIcon(imgRanL2));
        ranL.setOpaque(false);
        ranL.setBorder(BorderFactory.createEmptyBorder());

    }

    public int getweightRan(){ return imgRanL2.getWidth(null); }
    public int getheightRan(){ return imgRanL2.getHeight(null); }


    public JLabel getRanL(){
        return ranL;
    }

}