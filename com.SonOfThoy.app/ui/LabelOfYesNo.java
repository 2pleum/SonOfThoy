package ui;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class LabelOfYesNo {
    private final JLabel yes;
    private final JLabel no;
    private final ImageIcon imageyes;
    private final Image imagesyes;
    private final ImageIcon imageno;
    private final Image imagesno;

    public LabelOfYesNo(){
        yes = new JLabel();
        no = new JLabel();
        imageyes = new ImageIcon("img/yes2.png");
        imageno = new ImageIcon("img/no2.png");
        imagesyes = imageyes.getImage().getScaledInstance(250,250, Image.SCALE_SMOOTH);
        imagesno = imageno.getImage().getScaledInstance(250,250, Image.SCALE_SMOOTH);
        yes.setIcon(new ImageIcon(imagesyes));
        no.setIcon(new ImageIcon(imagesno));
        yes.setOpaque(false);
        no.setOpaque(false);
        yes.setBorder(BorderFactory.createEmptyBorder());
        no.setBorder(BorderFactory.createEmptyBorder());

    }

    public int getweightyes(){ return imagesyes.getWidth(null); }
    public int getheightyes(){ return imagesyes.getHeight(null); }

    public int getweightno(){ return imagesno.getWidth(null); }

    public int getheightno(){ return imagesno.getHeight(null); }

    public JLabel getYes(){
        return yes;
    }

    public JLabel getNo(){
        return no;
    }

}
