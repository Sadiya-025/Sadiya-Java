//Demonstrate delegation event handling using keyboard events

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardEvents implements KeyListener {
    JLabel newLabel;
    JTextField field;

    public KeyBoardEvents() {
        JFrame frame = new JFrame("Delegation Event Handling");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Text Box: ");
        label.setSize(200, 100);
        field = new JTextField(25);
        field.addKeyListener(this);
        newLabel = new JLabel();
        frame.add(label);
        frame.add(field);
        frame.add(newLabel);
        frame.setVisible(true);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key Pressed: " + KeyEvent.getKeyText(keyCode));
        if (keyCode == KeyEvent.VK_BACK_SPACE) {
            String text = newLabel.getText();
            if (text.endsWith("[Enter]")) {
                field.setText(field.getText() + " ");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key Released: " + KeyEvent.getKeyText(keyCode));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        if (keyChar == '\b') {
            newLabel.setText("You Entered: " + field.getText());
            System.out.println("Key Typed: Backspace");
        } else if (keyChar == '\n') {
            newLabel.setText("You Entered: " + field.getText() + " [Enter]");
            System.out.println("Key Typed: Enter");
        } else {
            newLabel.setText("You Entered: " + field.getText() + keyChar);
            System.out.println("Key Typed: " + keyChar);
        }
    }

    public static void main(String[] args) {
        new KeyBoardEvents();
    }
}
