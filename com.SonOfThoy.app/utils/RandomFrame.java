package utils;

import foods.*;
import scenes.LastFrame;
import scenes.yesOrNoFrame;
import ui.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//

import java.awt.event.ActionListener;

public class RandomFrame extends JFrame implements ActionListener {
    private char type;
    private final JButton ranB;
    private final JLabel ranL;

    private int [] nlist;
    private int count;


    public RandomFrame(char x) {
        type = x;
        //

        RandomB randomB = new RandomB(this, type);
        LabelToRandom ranLabel = new LabelToRandom();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x67020C));


        //
        goHomeButton goHome = new goHomeButton(this, 'R');
        JButton home = goHome.getHomeButton();
        home.setBounds(this.getWidth()-110,0,50,50);
        this.add(home);


        //
        exitButton outNaJa = new exitButton(this, 'R');
        JButton outNaja = outNaJa.getOutButton();
        outNaja.setBounds(this.getWidth()-60,0,50,50);
        this.add(outNaja);


        ranB = randomB.getRandomButton1();
        int wb = randomB.getWeightRanPic();
        int hb = randomB.getHeightRanPic();
        ranB.setBounds(((this.getWidth() - wb) / 2), ((this.getHeight() - hb) / 2), wb, hb);
        ranB.addActionListener(this);


        ranL = ranLabel.getRanL();
        int wl = ranLabel.getweightRan();
        int hl = ranLabel.getheightRan();
        ranL.setBounds(((this.getWidth() - wl) / 2), ((this.getHeight() - hl) / 2), wl, hl);

        JLabel back = setBackground();

        this.add(ranB);
        this.add(ranL);
        this.add(back);
        ranB.setVisible(true);
        ranL.setVisible(false);
        back.setVisible(true);
        this.setVisible(true);

    }

    public RandomFrame(char x,int [] n, int c) {
        type = x;
        nlist = n;
        count = c;
        //

        RandomB randomB = new RandomB(this, type);
        LabelToRandom ranLabel = new LabelToRandom();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x67020C));


        //
        goHomeButton goHome = new goHomeButton(this, 'R');
        JButton home = goHome.getHomeButton();
        home.setBounds(this.getWidth()-110,0,50,50);
        this.add(home);


        //
        exitButton outNaJa = new exitButton(this, 'R');
        JButton outNaja = outNaJa.getOutButton();
        outNaja.setBounds(this.getWidth()-60,0,50,50);
        this.add(outNaja);


        ranB = randomB.getRandomButton1();
        int wb = randomB.getWeightRanPic();
        int hb = randomB.getHeightRanPic();
        ranB.setBounds(((this.getWidth() - wb) / 2), ((this.getHeight() - hb) / 2), wb, hb);
        ranB.addActionListener(this);


        ranL = ranLabel.getRanL();
        int wl = ranLabel.getweightRan();
        int hl = ranLabel.getheightRan();
        ranL.setBounds(((this.getWidth() - wl) / 2), ((this.getHeight() - hl) / 2), wl, hl);

        JLabel back = setBackground();

        this.add(ranB);
        this.add(ranL);
        this.add(back);
        ranB.setVisible(true);
        ranL.setVisible(false);
        back.setVisible(true);
        this.setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ranB && nlist == null) {
            ranL.setVisible(true);
            ranB.setVisible(false);
            // ให้ Label แสดงก่อนด้วย SwingUtilities.invokeLater()
            SwingUtilities.invokeLater(() -> {
                // ปิดหน้าต่าง scenes.MainFrame
                yesOrNoFrame yesNoF = new yesOrNoFrame(type);
                this.setVisible(false);
                // สร้างและแสดงหน้าต่าง LastFrame
            });
        }
        else {
            ranL.setVisible(true);
            ranB.setVisible(false);
            // ให้ Label แสดงก่อนด้วย SwingUtilities.invokeLater()
            SwingUtilities.invokeLater(() -> {
                // ปิดหน้าต่าง scenes.MainFrame
                yesOrNoFrame yesNoF = new yesOrNoFrame(type,nlist,count);
                this.setVisible(false);
                // สร้างและแสดงหน้าต่าง LastFrame
            });
        }
    }

    public JLabel setBackground(){
        ImageIcon back = new ImageIcon("img/paman.png");
        Image backs = back.getImage().getScaledInstance(this.getWidth(),this.getHeight(),Image.SCALE_SMOOTH);
        back = new ImageIcon(backs);
        JLabel backg = new JLabel(back);
        backg.setBounds(0,0,this.getWidth(),this.getHeight());
        return backg;
    }
}




