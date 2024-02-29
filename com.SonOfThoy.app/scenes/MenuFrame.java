package scenes;
import ui.exitButton;
import ui.ButtonForMenu;
import ui.goHomeButton;
import javax.swing.*;
import java.awt.*;

public class MenuFrame extends JFrame {

    public MenuFrame() {
        ButtonForMenu buttonforMenu = new ButtonForMenu(this);
        goHomeButton goHome = new goHomeButton(this,'M');
        exitButton outNaJa = new exitButton(this,'M');


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.getSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0xFDD4F0));
        this.setLayout(null);


        int r = (this.getWidth() / 2) + 30;
        int h1 = (this.getHeight()/2) - 80;
        int h = (this.getHeight()/2) - 50;

        // เพิ่มปุ่มเมนูที่ต่าง ๆ ลงในหน้าต่าง scenes.Menuframe
        JButton all = buttonforMenu.getAllMenuButton();
        all.setBounds(r, h1, 180, 180);
        this.add(all);


        JButton thai = buttonforMenu.getThaiFoodButton();
        thai.setBounds(r + 180, h1, 180, 180);
        this.add(thai);


        JButton asian = buttonforMenu.getAsianFoodButton();
        asian.setBounds(r + 360, h1 ,180, 180);
        this.add(asian);


        JButton healthy = buttonforMenu.getHealthyFoodButton();
        healthy.setBounds(r, h +180, 180, 180);
        this.add(healthy);


        JButton west = buttonforMenu.getWesternFoodButton();
        west.setBounds(r+180, h + 180, 180, 180);
        this.add(west);


        JButton snack = buttonforMenu.getSnackButton();
        snack.setBounds(r+360, h + 180, 180, 180);
        this.add(snack);


        JButton outNaja = outNaJa.getOutButton();
        outNaja.setBounds(this.getWidth()-60,0,50,50);
        this.add(outNaja);


        JButton home = goHome.getHomeButton();
        home.setBounds(this.getWidth()-110,0,50,50);
        this.add(home);


        JLabel thoy = setThoy();
        this.add(thoy);

        JLabel lion = setLion();
        this.add(lion);

        JLabel karok = setkarok();
        this.add(karok);

        JLabel menuback = setbackground();
        this.add(menuback);

        this.setVisible(true);

    }




    public JLabel setThoy(){
        ImageIcon gifIcon = new ImageIcon("img/thoy.gif");
        // Resize GIF (optional)
        Image gifImage = gifIcon.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon resizedGifIcon = new ImageIcon(gifImage);
        JLabel gifLabel = new JLabel(resizedGifIcon);
        gifLabel.setBounds((this.getWidth()/2) - 550 , (this.getHeight()/2)-200,400,400);

        return gifLabel;
    }

    public  JLabel setLion(){
        ImageIcon gifIcon = new ImageIcon("img/lion.gif");
        Image gifImage = gifIcon.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon resizedGifIcon = new ImageIcon(gifImage);
        JLabel gifLabel = new JLabel(resizedGifIcon);
        gifLabel.setBounds((this.getWidth()/2) - 400 , (this.getHeight()/2)-200,400,400);

        return gifLabel;
    }

    public  JLabel setkarok(){
        ImageIcon gifIcon = new ImageIcon("img/karok.gif");
        Image gifImage = gifIcon.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon resizedGifIcon = new ImageIcon(gifImage);
        JLabel karok = new JLabel(resizedGifIcon);
        karok.setBounds((this.getWidth()/2) - 800 , (this.getHeight()/2) - 230,600,600);

        return karok;
    }



    public JLabel setbackground(){
        ImageIcon back = new ImageIcon("img/menu.png");
        Image backs = back.getImage().getScaledInstance(this.getWidth(),this.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon back1 = new ImageIcon(backs);
        JLabel back2 = new JLabel(back1);
        back2.setBounds(0,0,this.getWidth(),this.getHeight());
        return back2;
    }



}