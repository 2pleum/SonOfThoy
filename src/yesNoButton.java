import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yesNoButton implements ActionListener {
    private JButton yesB;
    private JButton NoB;
    private char type;
    private yesOrNoFrame yesNoF;

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
        }
        else if(e.getSource() == NoB) {
            yesNoF.setVisible(true);
            randomFrame ranF = new randomFrame();
        }
    }
    public JButton getYesB() {
        return yesB;
    }
    public JButton getNoB() {
        return NoB;
    }
}
