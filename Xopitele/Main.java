import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Main {
    public static void main(String[] args){
        System.out.println("Running");
        JFrame gui = new JFrame("Xopitele - Running Application");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(1280,720);
        gui.getContentPane().setBackground(new Color(22, 156, 204));

        ImageIcon image = new ImageIcon("logo.png");
        gui.setIconImage(image.getImage());
    }
}