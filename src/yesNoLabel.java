import javax.swing.*;

public class yesNoLabel {
    private JLabel nameFood;
    private yesOrNoFrame yesNoF;
    public yesNoLabel(yesOrNoFrame yesNoF) {
        this.yesNoF = yesNoF;
        nameFood = new JLabel();
        nameFood.setText("Kuy");
        nameFood.setBounds(100,500,200,400);
    }
    public JLabel getNameFood(){
        return nameFood;
    }

}
