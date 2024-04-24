import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FormTru extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JLabel resultLabel;

    public FormTru() {
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        add(new JLabel("Number 1:"));
        add(textField1);
        add(new JLabel("Number 2:"));
        add(textField2);

        resultLabel = new JLabel("Result:");
        add(resultLabel);

        JButton FormTru = new JButton("Subtract");
        FormTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int result = num1 - num2;
                resultLabel.setText("Result: " + result);
            }
        });
        add(FormTru);

        setTitle("Subtraction Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormTru();
    }
}