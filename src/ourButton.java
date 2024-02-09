import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ourButton implements ActionListener {
    private Button a = new Button();
    private String img, name;
    private float size;
    public ourButton(String img,String name,float size) {
        this.img = img;
        this.name = name;
        this.size = size;
    }
    public void setButton() {

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
