package ui;
import scenes.LastFrame;
import scenes.yesOrNoFrame;
import utils.RandomFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yesNoButton  {
    private final JButton yesB;
    private final JButton NoB;
    private final ImageIcon pyes;
    private final  ImageIcon pno;
    private final Image psyes;
    private final Image psno;

    public yesNoButton() {
        //Yes
        yesB = new JButton();
        pyes = new ImageIcon("img/yes1.png");
        psyes = pyes.getImage().getScaledInstance(250,250, Image.SCALE_SMOOTH);
        yesB.setIcon(new ImageIcon(psyes));
        yesB.setOpaque(false);
        yesB.setContentAreaFilled(false);
        yesB.setBorderPainted(false);
        yesB.setBorder(BorderFactory.createEmptyBorder());


        //No
        NoB = new JButton();
        pno = new ImageIcon("img/no1.png");
        psno = pno.getImage().getScaledInstance(250,250, Image.SCALE_SMOOTH);
        NoB.setIcon(new ImageIcon(psno));
        NoB.setOpaque(false);
        NoB.setContentAreaFilled(false);
        NoB.setBorderPainted(false);
        NoB.setBorder(BorderFactory.createEmptyBorder());

    }

    public JButton getYesB() {
        return yesB;
    }

    public JButton getNoB() {
        return NoB;
    }

    public int getWeightpcyes() { return psyes.getWidth(null); }
    public int getHeightpcyes() { return psyes.getHeight(null); }
    public int getWeightno() { return psno.getWidth(null); }
    public int getHeightpcno() { return psno.getHeight(null); }
}
