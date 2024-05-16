import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCong {
    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;
    private JLabel resultLabel;

    public FormCong() {
        frame = new JFrame("Phép cộng");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        textField1 = new JTextField();
        textField1.setBounds(50, 30, 100, 20);
        frame.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(50, 60, 100, 20);
        frame.add(textField2);

        addButton = new JButton("+");
        addButton.setBounds(50, 90, 50, 20);
        frame.add(addButton);

        resultLabel = new JLabel("Kết quả: ");
        resultLabel.setBounds(50, 120, 200, 20);
        frame.add(resultLabel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int sum = num1 + num2;
                resultLabel.setText("Kết quả: " + sum);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FormCong();
    }
}
