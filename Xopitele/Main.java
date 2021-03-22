import javax.swing.JFrame;

public class Main extends JFrame {
    public static void main(String[] args){
        System.out.println("Running");
        JFrame gui = new JFRame("Xopitele - Running Application");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        gui.pack();
        gui.setVisible(true);
    }
}