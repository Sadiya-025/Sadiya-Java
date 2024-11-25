import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Application");
        frame.setSize(350, 300);
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Name: ");
        label1.setSize(100, 100);

        JTextField field = new JTextField(25);
        field.setSize(100, 100);

        JLabel label2 = new JLabel("Gender: ");
        label2.setSize(100, 100);

        JRadioButton b1 = new JRadioButton("Male");
        JRadioButton b2 = new JRadioButton("Female");
        ButtonGroup b = new ButtonGroup();
        b.add(b1);
        b.add(b2);

        JLabel label3 = new JLabel("Age: ");
        label3.setSize(100, 100);

        String[] choices = { "<18", "18-30", "31-60", ">60" };
        JComboBox<String> combo = new JComboBox<>(choices);
        JButton submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = field.getText();
                String gender = "";
                if (b1.isSelected())
                    gender = "Male";
                else if (b2.isSelected())
                    gender = "Female";
                String age = (String) combo.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "Name: " + name + "\nGender: " + gender + "\nAge: " + age);
            }
        });
        frame.add(label1);
        frame.add(field);
        frame.add(label2);
        frame.add(b1);
        frame.add(b2);
        frame.add(label3);
        frame.add(combo);
        frame.add(submit);
        frame.setVisible(true);
    }
}
