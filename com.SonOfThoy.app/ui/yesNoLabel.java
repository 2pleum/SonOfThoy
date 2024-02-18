package ui;

import scenes.yesOrNoFrame;

import javax.swing.*;

public class yesNoLabel {
    private final JLabel nameFood;
    private final yesOrNoFrame yesNoF;
    private char type;

    public yesNoLabel(yesOrNoFrame yesNoF) {
        this.yesNoF = yesNoF;
        nameFood = new JLabel();
        nameFood.setText("Hi");
//        System.out.println(type);
        //ask pleum to random here i got char la
        // A is allfood
        //T thai
        //I asian
        //H healthy
        //W weaster
        //S ขนม
        nameFood.setBounds(100, 500, 200, 400);
    }
    public void setType(char x){
        type = x;
    }

    public JLabel getNameFood() {
        return nameFood;
    }

}
