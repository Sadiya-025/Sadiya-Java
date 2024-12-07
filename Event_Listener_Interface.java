import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event_Listener_Interface extends JFrame {
    JButton button;

    public Event_Listener_Interface() {
        setTitle("Event Listener Interface");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Click Me!");
        ButtonClickListener buttonClickListener = new ButtonClickListener();
        button.addActionListener(buttonClickListener);
        add(button);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Button Clicked!");
        }
    }

    public static void main(String[] args) {
        Event_Listener_Interface event_Listener_Interface = new Event_Listener_Interface();
        event_Listener_Interface.setVisible(true);
    }
}
