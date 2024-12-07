import javax.swing.*;
import java.util.Date;
import java.awt.*;
import java.text.SimpleDateFormat;

public class Digital_Timer extends JFrame {
    JLabel timeLabel;

    public Digital_Timer() {
        setTitle("Digital Timer");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timeLabel = new JLabel("", JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
        add(timeLabel);
    }

    public void updateTime() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeData = sdf.format(now);
        timeLabel.setText(timeData);
    }

    public static void main(String[] args) {
        Digital_Timer timer = new Digital_Timer();
        timer.setVisible(true);
    }
}