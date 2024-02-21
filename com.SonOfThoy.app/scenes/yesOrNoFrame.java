package scenes;

import ui.LabelOfYesNo;
import ui.yesNoButton;
import ui.yesNoLabel;
import utils.RandomFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yesOrNoFrame extends JFrame implements ActionListener {
    private char type;
    private final JButton yesB;
    private final JButton noB;
    private final JLabel yesL;
    private final JLabel noL;

    public yesOrNoFrame() {
        yesNoButton yesNoB = new yesNoButton();
        //yesNoLabel yesNoL = new yesNoLabel(this);
        LabelOfYesNo labelOfYesNo = new LabelOfYesNo();


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // เพิ่มปุ่มเมนูที่ต่าง ๆ ลงในหน้าต่าง scenes.Menuframe
        yesB = yesNoB.getYesB();
        yesB.addActionListener(this);
        yesL = labelOfYesNo.getYes();
        int xyes = yesNoB.getWeightpcyes();
        int yyes = yesNoB.getHeightpcyes();
        //yesB.setBounds((this.getWidth()/2)- xyes, (this.getHeight()/2), xyes, yyes);
        yesB.setBounds(this.getWidth()/2 - (xyes + 25),this.getHeight()/2,xyes,yyes);
        yesL.setBounds(this.getWidth()/2 - (xyes + 25),this.getHeight()/2,xyes,yyes);

        noB = yesNoB.getNoB();
        noB.addActionListener(this);
        noL = labelOfYesNo.getNo();
        int xno = yesNoB.getWeightno();
        int yno = yesNoB.getHeightpcno();
        noB.setBounds((this.getWidth()/2) + 25 , this.getHeight()/2, xno, yno);
        noL.setBounds((this.getWidth()/2) + 25 , this.getHeight()/2, xno, yno);

        this.add(yesB);
        this.add(noB);
        this.add(yesL);
        this.add(noL);
        yesB.setVisible(true);
        noB.setVisible(true);
        yesL.setVisible(false);
        noL.setVisible(false);
        //this.add(yesNoL.getNameFood()); //ข้อความไม่ออกกรี๊ด
        //            this.setBackground(Color.BLACK); //ใส่สีหลังไงวะ

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == yesB) {
            yesB.setVisible(false);
            yesL.setVisible(true);
            // ให้ Label แสดงก่อนด้วย SwingUtilities.invokeLater()
            SwingUtilities.invokeLater(() -> {
                // ปิดหน้าต่าง scenes.MainFrame
                this.setVisible(false);

                // สร้างและแสดงหน้าต่าง LastFrame
                LastFrame lastF = new LastFrame();
            });
        } else if (e.getSource() == noB) {
            noB.setVisible(false);
            noL.setVisible(true);
            // ให้ Label แสดงก่อนด้วย SwingUtilities.invokeLater()
            SwingUtilities.invokeLater(() -> {
                // ปิดหน้าต่าง scenes.MainFrame
                this.setVisible(false);

                // สร้างและแสดงหน้าต่าง LastFrame
                RandomFrame ranF = new RandomFrame();
            });
        }
    }


}

