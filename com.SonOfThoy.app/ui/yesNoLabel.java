package ui;

import scenes.yesOrNoFrame;
import utils.Randomizer;

import javax.swing.*;
import java.awt.*;

public class yesNoLabel {
    private final JLabel nameFood;
    private final yesOrNoFrame yesNoF;
    private String name;
    private char type;

    public yesNoLabel(yesOrNoFrame yesNoF) {
        this.yesNoF = yesNoF;
        nameFood = new JLabel();
    }

    public void setType(char x){
        type = x;
    }
    
    public void setName(String n) {
        name = n;
        nameFood.setText(name);
//        System.out.print(nameFood.getText());
        nameFood.setFont(new Font("Arial",Font.ITALIC,40));
        nameFood.setBounds((yesNoF.getWidth() - (nameFood.getPreferredSize().width)+5) / 2, 250, nameFood.getPreferredSize().width+5, nameFood.getPreferredSize().height+20);
    }


    public JLabel getNameFood() {
        return nameFood;
    }
}