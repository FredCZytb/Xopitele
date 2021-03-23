import javax.swing.*;

public class VitaminWorm{
    public static void Renderer(){
        JFrame gui = new JFrame("Xopitele - Game Running - 1280x697");
        JLabel warning = new JLabel("Thanks for trying this out, the games however ARE still being made");
        warning.setBounds(100,100,1180,150);


        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.add(vitaminWormBTN)
        gui.add(warning);
        gui.setVisible(true);
        gui.setResizable(false);
        gui.setSize(1280,720);
        gui.getContentPane().setBackground(new Color(0,0,0));
    }
}