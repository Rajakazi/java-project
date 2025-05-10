import javax.swing.*;
import java.awt.event.*;

public class AddSubtractForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Addition and Subtraction Form");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(20, 20, 80, 25);
        JTextField field1 = new JTextField();
        field1.setBounds(100, 20, 150, 25);
        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(20, 50, 80, 25);
        JTextField field2 = new JTextField();
        field2.setBounds(100, 50, 150, 25);
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 110, 250, 25);
        JButton addButton = new JButton("Add");
        addButton.setBounds(20, 80, 100, 25);
        addButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(field1.getText());
                int num2 = Integer.parseInt(field2.getText());
                int sum = num1 + num2;
                resultLabel.setText("Result: " + sum);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers.");
            }
        });
        JButton subButton = new JButton("Subtract");
        subButton.setBounds(130, 80, 100, 25);
        subButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(field1.getText());
                int num2 = Integer.parseInt(field2.getText());
                int diff = num1 - num2;
                resultLabel.setText("Result: " + diff);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers.");
            }
        });
        frame.add(label1);
        frame.add(field1);
        frame.add(label2);
        frame.add(field2);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}
