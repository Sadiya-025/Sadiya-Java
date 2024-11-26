//Program to implement Recursive Fibonacci function method using swing

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecursiveFibonacci extends JFrame implements ActionListener {
    JTextArea area;
    JTextField field;

    public RecursiveFibonacci() {
        setTitle("Recursive Fibonacci Calculator");
        setSize(600, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Enter the Value of N: ");
        field = new JTextField(25);
        JButton button = new JButton("Calculate");
        button.addActionListener(this);
        area = new JTextArea(15, 40);
        area.setEditable(false);
        add(label);
        add(field);
        add(button);
        add(area);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(field.getText());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(Fibonacci(i) + " ");
        }
        String text = sb.toString().trim();
        area.setText(text);
    }

    public static int Fibonacci(int n) {
        if (n <= 2) {
            return n - 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        new RecursiveFibonacci();
    }
}
