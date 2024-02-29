package scenes;
import foods.*;
import ui.*;
import utils.RandomFrame;
import utils.Randomizer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

public class yesOrNoFrame extends JFrame implements ActionListener {
    private char type;
    private final JButton yesB;
    private final JButton noB;
    private final JLabel yesL;
    private final JLabel noL;
    private String name;
    private int count;
    private int [] nlist;
    private boolean isGifFinished = false; // เพิ่มตัวแปรเพื่อตรวจสอบว่า GIF เสร็จสิ้นหรือยัง


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
        this.getContentPane().setBackground(new Color(0x67020C));


        // ปุ่มไปบ้าน
        goHomeButton goHome = new goHomeButton(this,'Y');
        JButton home = goHome.getHomeButton();
        home.setBounds(this.getWidth()-110,0,50,50);
        this.add(home);
        //ปุ่มออก
        exitButton outNaJa = new exitButton(this,'Y');
        JButton outNaja = outNaJa.getOutButton();
        outNaja.setBounds(this.getWidth()-60,0,50,50);
        this.add(outNaja); // เพิ่มปุ่มลงใน JFrame


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

        JLabel namefood = yesNoL.getNameFood();
        this.add(yesB);
        this.add(noB);
        this.add(yesL);
        this.add(noL);
        this.add(namefood);
        yesB.setVisible(false);
        noB.setVisible(false);
        yesL.setVisible(false);
        noL.setVisible(false);
        namefood.setVisible(false);

        int num;
        if (type == 'A') {
            ArrayList<AllFood> all = Food.getAllFood();
            Randomizer rd = new Randomizer(all.size());
            rd.randomNumber();
            nlist = rd.getNlist();
            count = rd.getCount();
            num = rd.getIndex()-1;
            name = all.get(num).getName();
            yesNoL.setName(name);
        }
        else if (type == 'T') {
            ArrayList<ThaiFood> th = Food.getThaiFood();
            Randomizer rd = new Randomizer(th.size());
            rd.randomNumber();
            nlist = rd.getNlist();
            count = rd.getCount();
            num = rd.getIndex()-1;
            name = th.get(num).getName();
            yesNoL.setName(name);
        }
        else if (type == 'I') {
            ArrayList<AsianFood> as = Food.getAsianFood();
            Randomizer rd = new Randomizer(as.size());
            rd.randomNumber();
            nlist = rd.getNlist();
            count = rd.getCount();
            num = rd.getIndex()-1;
            name = as.get(num).getName();
            yesNoL.setName(name);
        }
        else if (type == 'H') {
            ArrayList<HealthyFood> h = Food.getHealthyFood();
            Randomizer rd = new Randomizer(h.size());
            rd.randomNumber();
            nlist = rd.getNlist();
            count = rd.getCount();
            num = rd.getIndex()-1;
            name = h.get(num).getName();
            yesNoL.setName(name);
        }
        else if (type == 'W') {
            ArrayList<WesternFood> w = Food.getWesternFood();
            Randomizer rd = new Randomizer(w.size());
            rd.randomNumber();
            nlist = rd.getNlist();
            count = rd.getCount();
            num = rd.getIndex()-1;
            name = w.get(num).getName();
            yesNoL.setName(name);
        }
        else if (type == 'S') {
            ArrayList<SnackAndSweet> s = Food.getSnackAndSweet();
            Randomizer rd = new Randomizer(s.size());
            rd.randomNumber();
            nlist = rd.getNlist();
            count = rd.getCount();
            num = rd.getIndex()-1;
            name = s.get(num).getName();
            yesNoL.setName(name);
        }

        JLabel open = setOpenFood(namefood);
        open.setBounds((this.getWidth()/2) - (this.getHeight()/2),0,this.getHeight(),this.getHeight());
        this.add(open);

        this.setVisible(true);
        open.setVisible(true);
    }



    public String getName() {return name;}

    public yesOrNoFrame(char x,int [] n,int c) {
        type = x;
        nlist = n;
        count = c;

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
        this.getContentPane().setBackground(new Color(0x67020C));


        // ปุ่มไปบ้าน
        goHomeButton goHome = new goHomeButton(this,'Y');
        JButton home = goHome.getHomeButton();
        home.setBounds(this.getWidth()-110,0,50,50);
        this.add(home);
        //ปุ่มออก
        exitButton outNaJa = new exitButton(this,'Y');
        JButton outNaja = outNaJa.getOutButton();
        outNaja.setBounds(this.getWidth()-60,0,50,50);
        this.add(outNaja); // เพิ่มปุ่มลงใน JFrame


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

        JLabel namefood = yesNoL.getNameFood();
        this.add(yesB);
        this.add(noB);
        this.add(yesL);
        this.add(noL);
        this.add(namefood);
        yesB.setVisible(false);
        noB.setVisible(false);
        yesL.setVisible(false);
        noL.setVisible(false);
        namefood.setVisible(false);

        int num;
        if (type == 'A') {
            ArrayList<AllFood> all = Food.getAllFood();
            Randomizer rd = new Randomizer(all.size());
            rd.randomNumber();
            nlist = rd.getNlist();
            count = rd.getCount();
            num = rd.getIndex()-1;
            name = all.get(num).getName();
            yesNoL.setName(name);
        }
        else if (type == 'T') {
            ArrayList<ThaiFood> th = Food.getThaiFood();
            Randomizer rd = new Randomizer(th.size());
            rd.randomNumber();
            nlist = rd.getNlist();
            count = rd.getCount();
            num = rd.getIndex()-1;
            name = th.get(num).getName();
            yesNoL.setName(name);
        }
        else if (type == 'I') {
            ArrayList<AsianFood> as = Food.getAsianFood();
            Randomizer rd = new Randomizer(as.size());
            rd.randomNumber();
            nlist = rd.getNlist();
            count = rd.getCount();
            num = rd.getIndex()-1;
            name = as.get(num).getName();
            yesNoL.setName(name);
        }
        else if (type == 'H') {
            ArrayList<HealthyFood> h = Food.getHealthyFood();
            Randomizer rd = new Randomizer(h.size());
            rd.randomNumber();
            nlist = rd.getNlist();
            count = rd.getCount();
            num = rd.getIndex()-1;
            name = h.get(num).getName();
            yesNoL.setName(name);
        }
        else if (type == 'W') {
            ArrayList<WesternFood> w = Food.getWesternFood();
            Randomizer rd = new Randomizer(w.size());
            rd.randomNumber();
            nlist = rd.getNlist();
            count = rd.getCount();
            num = rd.getIndex()-1;
            name = w.get(num).getName();
            yesNoL.setName(name);
        }
        else if (type == 'S') {
            ArrayList<SnackAndSweet> s = Food.getSnackAndSweet();
            Randomizer rd = new Randomizer(s.size());
            rd.randomNumber();
            nlist = rd.getNlist();
            count = rd.getCount();
            num = rd.getIndex()-1;
            name = s.get(num).getName();
            yesNoL.setName(name);
        }

        JLabel open = setOpenFood(namefood);
        open.setBounds((this.getWidth()/2) - (this.getHeight()/2),0,this.getHeight(),this.getHeight());
        this.add(open);

        this.setVisible(true);
        open.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == yesB) {
            yesL.setVisible(true);
            yesB.setVisible(false);
            // ให้ Label แสดงก่อนด้วย SwingUtilities.invokeLater()
            SwingUtilities.invokeLater(() -> {
                // ปิดหน้าต่าง scenes.MainFrame
                this.setVisible(false);

                // สร้างและแสดงหน้าต่าง LastFrame
                LastFrame lastF = new LastFrame(name);
            });
        } else if (e.getSource() == noB) {
            noL.setVisible(true);
            noB.setVisible(false);
            // ให้ Label แสดงก่อนด้วย SwingUtilities.invokeLater()
            SwingUtilities.invokeLater(() -> {
                // ปิดหน้าต่าง scenes.MainFrame
                // สร้างและแสดงหน้าต่าง LastFrame
                RandomFrame ranF = new RandomFrame(type,nlist,count);
                this.setVisible(false);
            });
        }
    }


    public JLabel setOpenFood(JLabel namefood){
        ImageIcon open = new ImageIcon("img/open2.gif");
        Image opens = open.getImage().getScaledInstance(this.getHeight(),this.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon resizedGifIcon = new ImageIcon(opens);
        JLabel openss = new JLabel(resizedGifIcon);

        // สร้าง Timer เพื่อตรวจสอบว่า GIF เล่นเสร็จสิ้นหรือไม่
        Timer gifTimer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isGifFinished = true; // ตั้งค่า isGifFinished เมื่อ GIF เล่นเสร็จสิ้น
                // ตรวจสอบและแสดงปุ่มและ Label เมื่อ GIF เสร็จสิ้น
                if (isGifFinished) {
                    yesB.setVisible(true);
                    noB.setVisible(true);
                    namefood.setVisible(true);
                    yesL.setVisible(false);
                    noL.setVisible(false);
                }
                ((Timer) e.getSource()).stop(); // หยุด Timer เมื่อเสร็จสิ้น
            }
        });

        gifTimer.setInitialDelay(4000); // ตั้งเวลาเริ่มต้นให้ Timer รอ 4 วินาที โดยให้เพื่อน Timer ทำงานในเวลาที่เหมาะสมกับ GIF
        gifTimer.setRepeats(false); // ไม่ต้องทำซ้ำ
        gifTimer.start(); // เริ่มต้น Timer

        return openss;
    }

}
