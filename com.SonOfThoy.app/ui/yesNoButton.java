package ui;

import scenes.LastFrame;
import scenes.yesOrNoFrame;
import utils.RandomFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yesNoButton implements ActionListener {
    private final JButton yesB;
    private final JButton NoB;
    private final yesOrNoFrame yesNoF;
    private char type;

    public yesNoButton(yesOrNoFrame yesNoF) {
        this.yesNoF = yesNoF;
        //Yes
        yesB = new JButton("yes");
        yesB.setPreferredSize(new Dimension(200, 100));
//        ImageIcon xxx = new ImageIcon("startB.gif");
//        randomButton1.setIcon(xxx); งงใส่รูปไม่ได้
        yesB.addActionListener(this);
        //No
        NoB = new JButton("No");
        NoB.setPreferredSize(new Dimension(200, 100));
        NoB.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == yesB) {
            yesNoF.setVisible(false);
            LastFrame lastF = new LastFrame();
        } else if (e.getSource() == NoB) {
            yesNoF.setVisible(true);
            RandomFrame ranF = new RandomFrame();
        }
    }

    public JButton getYesB() {
        return yesB;
    }

    public JButton getNoB() {
        return NoB;
    }
}
