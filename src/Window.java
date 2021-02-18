import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public final int WIDTH = 1280;
    public final int HEIGHT = 720;
    private boolean is_custom_ans;

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
        //Вывод ответа
        JLabel label = new JLabel("Ваш ответ: ");
        label.setFont(new Font("Times New Roman", Font.BOLD, 50));
        label.setBounds(50, 50, WIDTH-50, 100);
        getContentPane().add(label);

        //Выпадающий список
        String[] colors = {"красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"};
        JComboBox<String> box = new JComboBox<>(colors);
        box.setBounds(50, 150, 250, 25);
        getContentPane().add(box);

        //Выбор своего варианта
        JCheckBox checkBox = new JCheckBox("Свой вариант");
        checkBox.setBounds(100, 200, 250, 50);
        getContentPane().add(checkBox);

        //Текстовое поле
        JTextField textField = new JTextField();
        textField.setBounds(50, 250, 250, 25);
        getContentPane().add(textField);

        //Кнопка добавления
        JButton button = new JButton("Ответить");
        int button_width = 200;
        button.setBounds((box.getWidth()-200)/2+50, 350, button_width, 50);
        getContentPane().add(button);
        button.addActionListener(i->{
            if(!checkBox.isSelected()) {
                label.setText(String.format("Ваш ответ: %s", box.getModel().getSelectedItem()));
            }else{
                label.setText(String.format("Ваш ответ: %s", textField.getText()));
            }
        });
    }
}
