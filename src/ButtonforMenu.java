import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonforMenu implements ActionListener {

    private JButton allmenuButton;
    private JButton thaiFoodButton;
    private JButton asianFoodButton; // เปลี่ยนชื่อตัวแปรจาก AsainFood เป็น AsianFood
    private JButton healthyFoodButton; // เปลี่ยนชื่อตัวแปรเป็น healthyFoodButton
    private JButton westernFoodButton;
    private JButton snackButton;
    private  Menuframe menuframe;

    public ButtonforMenu(Menuframe menuframe) {
        this.menuframe = menuframe;
        // สร้าง JButton สำหรับเมนูทั้งหมด
        allmenuButton = new JButton("All Menu");
        allmenuButton.setPreferredSize(new Dimension(200, 100));
        allmenuButton.addActionListener(this);

        // สร้าง JButton สำหรับอาหารไทย
        thaiFoodButton = new JButton("Thai Food");
        thaiFoodButton.setPreferredSize(new Dimension(200, 100));
        thaiFoodButton.addActionListener(this);

        asianFoodButton = new JButton("Asian Food");
        asianFoodButton.setPreferredSize(new Dimension(200, 100));
        asianFoodButton.addActionListener(this);

        westernFoodButton = new JButton("Western Food");
        westernFoodButton.setPreferredSize(new Dimension(200, 100));
        westernFoodButton.addActionListener(this);

        healthyFoodButton = new JButton("Healthy Food");
        healthyFoodButton.setPreferredSize(new Dimension(200, 100));
        healthyFoodButton.addActionListener(this);

        snackButton = new JButton("Snack&Sweet");
        snackButton.setPreferredSize(new Dimension(200, 100));
        snackButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == allmenuButton){
            menuframe.setVisible(false);
            FrameofAllmenu frameofAllmenu = new FrameofAllmenu();
        }
        else if (e.getSource() == thaiFoodButton) {
            menuframe.setVisible(false);
            FrameofThaifood frameofThaifood = new FrameofThaifood();
        }
        else if (e.getSource() == asianFoodButton) {
            menuframe.setVisible(true);
            FrameofAsainfood frameofAsainfood = new FrameofAsainfood();
        }
        else if (e.getSource() == healthyFoodButton) {
            menuframe.setVisible(false);
            FrameofHealtyfood frameofHealtyfood = new FrameofHealtyfood();
        }
        else if (e.getSource() == westernFoodButton) {
            menuframe.setVisible(false);
            FrameofWesternfood frameofWesternfood = new FrameofWesternfood();
        }
        else if (e.getSource() == snackButton) {
            menuframe.setVisible(false);
            FrameofSnackandsweet frameofSnackandsweet = new FrameofSnackandsweet();
        }

    }


    // เมทอดสำหรับคืนค่า JButton สำหรับเมนูทั้งหมด
    public JButton getAllmenuButton() {
        return allmenuButton;
    }

    // เมทอดสำหรับคืนค่า JButton สำหรับอาหารไทย
    public JButton getThaiFoodButton() {
        return thaiFoodButton;
    }

    public JButton getAsianFoodButton() {
        return asianFoodButton;
    }

    public JButton getWesternFoodButton() {
        return westernFoodButton;
    }

    public JButton getHealthyFoodButton() {
        return healthyFoodButton;
    }

    public JButton getSnackButton() {
        return snackButton;
    }


}
