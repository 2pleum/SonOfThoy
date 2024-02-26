package scenes;

import ui.LastLabel;
import ui.exitButton;
import ui.goHomeButton;

import javax.swing.*;
import java.awt.*;

public class LastFrame extends JFrame {
    //    private char type;
    public LastFrame() {
        LastLabel lastL = new LastLabel(this);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null); // กำหนด Layout เป็น null เพื่อให้สามารถกำหนดตำแหน่งของปุ่มเองได้

        this.add(lastL.getThoyL()); //ข้อความไม่ออกกรี๊ด

        //ปุ่มไปบ้าน
        goHomeButton goHome = new goHomeButton(this,'L');
        JButton home = goHome.getHomeButton();
        home.setBounds(this.getWidth()-110,0,50,50);
        this.add(home);
        //ปุ่มออก
        exitButton outNaJa = new exitButton(this,'L');
        JButton outNaja = outNaJa.getOutButton();
        outNaja.setBounds(this.getWidth()-60,0,50,50);
        this.add(outNaja); // เพิ่มปุ่มลงใน JFrame

        JLabel back = setbackground();
        this.add(back);
        back.setVisible(true);
        outNaja.setVisible(true);
        home.setVisible(true);

        this.setVisible(true);
    }

    public JLabel setbackground(){
        ImageIcon open = new ImageIcon("img/last.png");
        Image gifImage = open.getImage().getScaledInstance(this.getHeight(), this.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedGifIcon = new ImageIcon(gifImage);
        JLabel back = new JLabel(resizedGifIcon);
        back.setBounds((this.getWidth()/2) - (this.getHeight()/2),0,this.getHeight(),this.getHeight());
        return back;
    }
}