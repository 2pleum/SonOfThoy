import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class randomB implements ActionListener {
    private JButton randomButton1;
    private JButton randomButton2;
    private JButton randomButton3;
    private JButton randomButton4;
    private JButton randomButton5;
    private JButton randomButton6;
    private randomFrame ranF;

    public randomB(randomFrame ranF) {
        this.ranF = ranF;
        // สร้าง JButton สำหรับเมนูทั้งหมด
        randomButton1 = new JButton("Random");
        randomButton1.setPreferredSize(new Dimension(200, 100));
        randomButton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == randomButton1) {
            ranF.setVisible(false);

        }
    }
    public JButton getRandomButton1() {
        return randomButton1;
    }
}
