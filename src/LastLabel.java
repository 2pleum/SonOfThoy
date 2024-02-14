import javax.swing.*;

public class LastLabel {
    private JLabel thoy;
    private LastFrame lastF;
    public LastLabel(LastFrame lastF) {
        this.lastF = lastF;
        JLabel thoy= new JLabel();
        thoy.setText("Kuy");
        thoy.setBounds(100,500,200,400);
    }
    public JLabel getThoy(){
        return thoy;
    }

}
