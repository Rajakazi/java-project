import javax.swing.*;
import java.awt.*;

public class HelloSwing extends JFrame {
    public HelloSwing(){
    setSize(500, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(173, 216, 230));
    setLocationRelativeTo(null);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("Hello Milan, How Are you?", 150, 100);
    }
    public static void main(String[] args) {
        HelloSwing window = new HelloSwing();
        window.setVisible(true);
    }
}