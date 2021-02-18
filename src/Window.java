import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public final int WIDTH = 1280;
    public final int HEIGHT = 720;
    private int button_c;

    Window(){
        setBounds(100, 100, WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setLayout(null);
        addVidgets();
        pack();
        button_c = 0;
    }

    private void addVidgets(){
        JLabel label = new JLabel("Button pressed 0 times");
        label.setFont(new Font("Times New Roman", Font.BOLD, 50));
        label.setBounds(50, 50, WIDTH-50, 100);
        getContentPane().add(label);
        JButton button = new JButton();
        button.setBounds(50, 250, 50, 50);
        button.addActionListener(i->{
            button_c++;
            label.setText(String.format("Button pressed %d times", button_c));
        });
        getContentPane().add(button);
    }
}
