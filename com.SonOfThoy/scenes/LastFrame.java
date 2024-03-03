package scenes;

import ui.LastLabel;
import ui.exitButton;
import ui.goHomeButton;

import javax.swing.*;
import java.awt.*;

public class LastFrame extends JFrame {
        private String name;
    public LastFrame(String name) {
        this.name = name;
        LastLabel lastL = new LastLabel(this,name);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout(null);
        this.setVisible(true);
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null); // กำหนด Layout เป็น null เพื่อให้สามารถกำหนดตำแหน่งของปุ่มเองได้

        //ชื่ออาหาร
        JLabel nameFood = lastL.getNameFood();
        nameFood.setBounds((this.getWidth() - (nameFood.getPreferredSize().width)+5) / 2, (this.getHeight()/2) + 40, nameFood.getPreferredSize().width+5, nameFood.getPreferredSize().height+20);
        this.add(nameFood);

        JLabel thoy = lastL.getThoySay();
        thoy.setBounds(((this.getWidth() - (thoy.getPreferredSize().width)+5) / 2), this.getHeight()/2 - 90, thoy.getPreferredSize().width, thoy.getPreferredSize().height+20);
        this.add(thoy);

        JLabel thoy2 = lastL.getThoySay2();
        thoy2.setBounds(((this.getWidth() - (thoy2.getPreferredSize().width)+5) / 2), this.getHeight()/2 - 90+50, thoy2.getPreferredSize().width, thoy2.getPreferredSize().height+20);
        this.add(thoy2);

//        this.add(lastL.()); //ข้อความไม่ออกกรี๊ด

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

        JLabel lastthoy = setThoy();
        this.add(lastthoy);


        JLabel back = setbackground();
        this.add(back);


        thoy.setVisible(true);
        thoy2.setVisible(true);
        nameFood.setVisible(true);
        back.setVisible(true);
        outNaja.setVisible(true);
        home.setVisible(true);
        this.setVisible(true);
    }

    public JLabel setbackground(){
        ImageIcon open = new ImageIcon("img/last.png");
        Image gifImage = open.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedGifIcon = new ImageIcon(gifImage);
        JLabel back = new JLabel(resizedGifIcon);
        back.setBounds(0,0,this.getWidth(),this.getHeight());
        return back;
    }

    public JLabel setThoy(){
        ImageIcon gifIcon = new ImageIcon("img/lastthoy.png");
        // Resize GIF (optional)
        Image gifImage = gifIcon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        ImageIcon resizedGifIcon = new ImageIcon(gifImage);
        JLabel gifLabel = new JLabel(resizedGifIcon);
        gifLabel.setBounds((this.getWidth()/2) -420, (this.getHeight()/2) + 100 ,250,250);

        return gifLabel;
    }
}