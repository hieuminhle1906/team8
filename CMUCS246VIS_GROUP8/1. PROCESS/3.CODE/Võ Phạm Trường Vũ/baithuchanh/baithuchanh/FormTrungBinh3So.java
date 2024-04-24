import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormTrungBinh3So extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel resultLabel;

    public FormTrungBinh3So() {
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField3 = new JTextField(10);
        add(new JLabel("Number 1:"));
        add(textField1);
        add(new JLabel("Number 2:"));
        add(textField2);
        add(new JLabel("Number 3:"));
        add(textField3);

        resultLabel = new JLabel("Result:");
        add(resultLabel);

        JButton calculateButton = new JButton("Calculate Average");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                double num3 = Double.parseDouble(textField3.getText());
                double average = (num1 + num2 + num3) / 3;
                resultLabel.setText("Result: " + average);
            }
        });
        add(calculateButton);

        setTitle("Average Form");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormTrungBinh3So();
    }
}

