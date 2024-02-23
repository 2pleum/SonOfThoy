package scenes;

import foods.*;
import ui.LabelOfYesNo;
import ui.yesNoButton;
import ui.yesNoLabel;
import utils.RandomFrame;
import utils.Randomizer;

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

    private String name;

    public yesOrNoFrame(char x) {
        type = x;

        yesNoButton yesNoB = new yesNoButton(this,type);
        yesNoLabel yesNoL = new yesNoLabel(this);
        LabelOfYesNo labelOfYesNo = new LabelOfYesNo();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout(null);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0xFDD4F0));

        // เพิ่มปุ่มเมนูที่ต่าง ๆ ลงในหน้าต่าง scenes.Menuframe
        yesB = yesNoB.getYesB();
        yesB.addActionListener(this);
        yesL = labelOfYesNo.getYes();
        int xyes = yesNoB.getWeightpcyes();
        int yyes = yesNoB.getHeightpcyes();
        yesB.setBounds((this.getWidth()/2)- xyes, (this.getHeight()/2), xyes, yyes);
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
        this.add(yesNoL.getNameFood());
        yesB.setVisible(true);
        noB.setVisible(true);
        yesL.setVisible(false);
        noL.setVisible(false);

        //ข้อความไม่ออกกรี๊ด
        //            this.setBackground(Color.BLACK); //ใส่สีหลังไงวะ
        this.setVisible(true);

        Food f = new Food();
        int num;
        if (type == 'A') {
            AllFood [] all = f.getAllFood();
            Randomizer rd = new Randomizer(all.length);
            rd.randomNumber();
            num = rd.getIndex()-1;
            name = all[num].getName();
            System.out.print(name);
            yesNoL.setName(name);
        }
        else if (type == 'T') {
            ThaiFood [] th = f.getThaiFood();
            Randomizer rd = new Randomizer(th.length);
            rd.randomNumber();
            num = rd.getIndex()-1;
            name = th[num].getName();
            yesNoL.setName(name);
        }
        else if (type == 'I') {
            AsianFood [] as = f.getAsianFood();
            Randomizer rd = new Randomizer(as.length);
            rd.randomNumber();
            num = rd.getIndex()-1;
            name = as[num].getName();
            yesNoL.setName(name);
        }
        else if (type == 'H') {
            HealthyFood [] h = f.getHealthyFood();
            Randomizer rd = new Randomizer(h.length);
            rd.randomNumber();
            num = rd.getIndex()-1;
            name = h[num].getName();
            yesNoL.setName(name);
        }
        else if (type == 'W') {
            WesternFood [] w = f.getWesternFood();
            Randomizer rd = new Randomizer(w.length);
            rd.randomNumber();
            num = rd.getIndex()-1;
            name = w[num].getName();
            yesNoL.setName(name);
        }
        else if (type == 'S') {
            SnackAndSweet [] s = f.getSnackAndSweet();
            Randomizer rd = new Randomizer(s.length);
            rd.randomNumber();
            num = rd.getIndex()-1;
            name = s[num].getName();
            yesNoL.setName(name);
        }
//        System.out.println(yesNoL.getNameFood());

    }

    public String getName() {return name;}


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == yesB) {
            yesL.setVisible(true);
            yesB.setVisible(false);
            // ให้ Label แสดงก่อนด้วย SwingUtilities.invokeLater()
            SwingUtilities.invokeLater(() -> {
                // ปิดหน้าต่าง scenes.MainFrame
                this.setVisible(false);

                // สร้างและแสดงหน้าต่าง LastFrame
                LastFrame lastF = new LastFrame();
            });
        } else if (e.getSource() == noB) {
            noL.setVisible(true);
            noB.setVisible(false);
            // ให้ Label แสดงก่อนด้วย SwingUtilities.invokeLater()
            SwingUtilities.invokeLater(() -> {
                // ปิดหน้าต่าง scenes.MainFrame
                // สร้างและแสดงหน้าต่าง LastFrame
                RandomFrame ranF = new RandomFrame(type);
                this.setVisible(false);
            });
        }
    }


}



