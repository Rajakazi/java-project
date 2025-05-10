import javax.swing.*;
import java.awt.*;
public class HelloBCASwing extends JFrame {
    public HelloBCASwing(){
    setSize(500, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(173, 216, 230));
    setLocationRelativeTo(null);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("Hello BCA", 150, 100);
    }
    public static void main(String[] args) {
        HelloBCASwing window = new HelloBCASwing();
        window.setVisible(true);
    }
}