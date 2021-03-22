import javax.swing.JFrame;
import java.awt.Color;

public class Main {
    public static void main(String[] args){
        System.out.println("Running");
        JFrame gui = new JFrame("Xopitele - Running Application");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(1280,720);
        gui.getContentPane().setBackground(new Color(22, 156, 204));
    }
}
