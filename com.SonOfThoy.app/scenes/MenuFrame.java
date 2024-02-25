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


        int r = (this.getWidth() - 600)/2;
        int h = (this.getHeight()/2) - 150;

        // เพิ่มปุ่มเมนูที่ต่าง ๆ ลงในหน้าต่าง scenes.Menuframe
        JButton all = buttonforMenu.getAllMenuButton();
        all.setBounds(r, h, 200, 200);
        this.add(all);


        JButton thai = buttonforMenu.getThaiFoodButton();
        thai.setBounds(r + 200, h, 200, 200);
        this.add(thai);


        JButton asian = buttonforMenu.getAsianFoodButton();
        asian.setBounds(r + 400, h ,200, 200);
        this.add(asian);


        JButton healthy = buttonforMenu.getHealthyFoodButton();
        healthy.setBounds(r, h +200, 200, 200);
        this.add(healthy);


        JButton west = buttonforMenu.getWesternFoodButton();
        west.setBounds(r+200, h + 200, 200, 200);
        this.add(west);


        JButton snack = buttonforMenu.getSnackButton();
        snack.setBounds(r+400, h + 200, 200, 200);
        this.add(snack);


        JButton outNaja = outNaJa.getOutButton();
        outNaja.setBounds(this.getWidth()-60,0,50,50);
        this.add(outNaja);


        JButton home = goHome.getHomeButton();
        home.setBounds(this.getWidth()-110,0,50,50);
        this.add(home);

        this.setVisible(true);
    }

}