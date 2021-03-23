// Swing
import javax.swing.*;

// Awt Imports
import java.awt.*;
import java.awt.event.*;


public class Gui{
    public void render(){
        /*////*
        * GUI *
        */////*
        
        // Download Images

        // > Background
        String bglink = "https://github.com/RobumViren849/Xopitele/raw/main/Xopitele/Image/Background.png";
        File bgout = new File("C:\\Program Files\\XopiteleBG.png");
        new Thread(new Download(bglink,bgout)).start();

        // > Buttons
        String vwlink = "https://github.com/RobumViren849/Xopitele/raw/main/Xopitele/Image/VitaminWorm.png";
        File vwout = new File("C:\\Program Files\\XopiteleVitaminWorm.png");
        new Thread(new Download(bglink,bgout)).start();

        // Render gui
        JFrame gui = new JFrame("Xopitele - Running Application");
        JLabel bg = new JLabel(new ImageIcon("C:\\Program Files\\XopiteleBG.png"));
        JButton vitaminWormBTN = new JButton("Play Vitamin Worm");

        bg.setSize(1280,720);
        vitaminWormBTN.setBounds(25,210,453,320);
        vitaminWormBTN.addActionListener();

        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.add(vitaminWormBTN);
        gui.add(bg);
        gui.setVisible(true);
        gui.setResizable(false);
        gui.setSize(1280,720);
        gui.getContentPane().setBackground(new Color(22, 156, 204));
        System.out.println("GUI system pogging");
    }
}