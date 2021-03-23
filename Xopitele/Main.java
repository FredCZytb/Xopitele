// Swing
import javax.swing.*;

// Awt Imports
import java.awt.*;
import java.awt.event.*;

// Audio Imports
import javax.sound.sampled.*;

// IO Imports
import java.io.File;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

public class Main{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, Exception{
        /*//////*
        * AUDIO *
        *///////*

        // Download Audio File
        String link = "https://github.com/RobumViren849/Xopitele/raw/main/Xopitele/menumusic.wav";
        File out = new File("C:\\Program Files\\XopiteleMenu.wav");

        new Thread(new Download(link,out)).start();

        // Play Audio File
        File music = new File("C:\\Program Files\\XopiteleMenu.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(music);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        System.out.println("Audio system running");

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
        JLabel vwicon = new JLabel(new ImageIcon("C:\\Program Files\\XopiteleVitaminWorm.png"));
        JButton vitaminWormBTN = new JButton();

        bg.setSize(1280,720);
        vitaminWormBTN.setBounds(25,100,453,734);

        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.add(vitaminWormBTN);
        gui.add(bg);
        gui.setVisible(true);
        gui.setResizable(false);
        gui.setSize(1280,720);
        gui.getContentPane().setBackground(new Color(22, 156, 204));
        System.out.println("GUI system running");
    }
}
