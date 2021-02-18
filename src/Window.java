import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public final int WIDTH = 800;
    public final int HEIGHT = 600;

    Window(){
        setBounds(100, 100, WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setLayout(null);
        addVidgets();
        pack();
    }

    private void addVidgets(){
        JLabel label = new JLabel("Моя первая надпись!");
        label.setFont(new Font("Times New Roman", Font.BOLD, 50));
        label.setBounds(50, 50, WIDTH-50, 100);
        getContentPane().add(label);
        JSlider slider = new JSlider(5, 100);
        slider.setBounds(50, 200, 100, 25);
        slider.addChangeListener(i-> label.setFont(label.getFont().deriveFont(Font.BOLD, slider.getValue())));
        getContentPane().add(slider);
    }
}
