import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListApp extends JFrame implements ActionListener {
    JTextArea area;
    JTextField field;
    List<String> tasks;
    JButton addButton, deleteButton;

    public ToDoListApp() {
        setTitle("To Do List Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        area = new JTextArea();
        area.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(area);
        add(scrollPane, BorderLayout.CENTER);
        JPanel panel = new JPanel(new FlowLayout());
        field = new JTextField(20);
        panel.add(field);
        addButton = new JButton("Add Task");
        deleteButton = new JButton("Delete Task");
        addButton.addActionListener(this);
        deleteButton.addActionListener(this);
        panel.add(addButton);
        panel.add(deleteButton);
        add(panel, BorderLayout.SOUTH);
        tasks = new ArrayList<>();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("File");
        JMenuItem saveTasks = new JMenuItem("Save");
        JMenuItem loadTasks = new JMenuItem("Load");
        saveTasks.addActionListener(this);
        loadTasks.addActionListener(this);
        menu.add(saveTasks);
        menu.add(loadTasks);
        menuBar.add(menu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == addButton) {
            addTask();
        } else if (source == deleteButton) {
            deleteTask();
        } else if (source instanceof JMenuItem) {
            JMenuItem menuItem = (JMenuItem) source;
            if (menuItem.getText().equals("Save")) {
                saveTasks();
            } else if (menuItem.getText().equals("Load")) {
                loadTasks();
            }
        }
    }

    public void addTask() {
        String task = field.getText().trim();
        if (!task.isEmpty()) {
            tasks.add(task);
            updateTextArea();
            field.setText("");
        }
    }

    public void deleteTask() {
        if (!tasks.isEmpty()) {
            tasks.remove(tasks.size() - 1);
            updateTextArea();
        }
    }

    public void updateTextArea() {
        StringBuilder sb = new StringBuilder();
        for (String task : tasks) {
            sb.append(task).append("\n");
        }
        area.setText(sb.toString());
    }

    public void saveTasks() {
        try (PrintWriter writer = new PrintWriter("tasks.txt")) {
            for (String task : tasks) {
                writer.println(task);
            }
            JOptionPane.showMessageDialog(this, "Tasks Saved Successfully!", "Save", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error Saving Tasks!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void loadTasks() {
        try (BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"))) {
            tasks.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }
            updateTextArea();
            JOptionPane.showMessageDialog(this, "Tasks Loaded Successfully!", "Load", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error Loading Tasks!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        ToDoListApp toDoListApp = new ToDoListApp();
        toDoListApp.setVisible(true);
    }
}
