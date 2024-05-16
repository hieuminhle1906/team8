import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FormPhuongTrinhBac2 extends JFrame {
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JTextField textFieldC;
    private JLabel resultLabel;

    public FormPhuongTrinhBac2() {
        setLayout(new FlowLayout());

        textFieldA = new JTextField(10);
        textFieldB = new JTextField(10);
        textFieldC = new JTextField(10);
        add(new JLabel("Coefficient a:"));
        add(textFieldA);
        add(new JLabel("Coefficient b:"));
        add(textFieldB);
        add(new JLabel("Constant c:"));
        add(textFieldC);

        resultLabel = new JLabel("Result:");
        add(resultLabel);

        JButton solveButton = new JButton("Solve");
        solveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(textFieldA.getText());
                double b = Double.parseDouble(textFieldB.getText());
                double c = Double.parseDouble(textFieldC.getText());
                if (a == 0) {
                    JOptionPane.showMessageDialog(FormPhuongTrinhBac2.this, "Invalid equation! Coefficient a cannot be zero.");
                    return;
                }
                double discriminant = b * b - 4 * a * c;
                if (discriminant > 0) {
                    double sqrtDiscriminant = Math.sqrt(discriminant);
                    double root1 = (-b + sqrtDiscriminant) / (2 * a);
                    double root2 = (-b - sqrtDiscriminant) / (2 * a);
                    resultLabel.setText("Result: Roots are real and different. Root 1 = " + root1 + ", Root 2 = " + root2);
                } else if (discriminant == 0) {
                    double root = -b / (2 * a);
                    resultLabel.setText("Result: Roots are real and equal. Root = " + root);
                } else {
                    double realPart = -b / (2 * a);
                    double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                    resultLabel.setText("Result: Roots are complex and different. Root 1 = " + realPart + " + " + imaginaryPart + "i, Root 2 = " + realPart + " - " + imaginaryPart + "i");
                }
            }
        });
        add(solveButton);

        setTitle("Quadratic Form");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormPhuongTrinhBac2();
    }
}