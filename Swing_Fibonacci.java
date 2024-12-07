import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_Fibonacci extends JFrame {
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public Swing_Fibonacci() {
        setTitle("Fibonacci Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JTextField field = new JTextField(10);
        JTextArea area = new JTextArea(8, 20);
        area.setEditable(false);
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    int n = Integer.parseInt(field.getText());
                    int result = fibonacci(n);
                    area.setText("Fibonacci(" + n + ") = " + result);
                } catch (NumberFormatException e) {
                    area.setText("Invalid Expression: Enter a Number in the Text Field!");
                }
            }
        });
        panel.add(new JLabel("Enter the Value of N: "));
        panel.add(field);
        panel.add(calculateButton);
        panel.add(new JScrollPane(area));
        add(panel);

    }

    public static void main(String[] args) {
        Swing_Fibonacci fibonacci = new Swing_Fibonacci();
        fibonacci.setVisible(true);
    }
}
