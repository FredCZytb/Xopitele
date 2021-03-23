// Swing
import javax.swing.JFrame;
import javax.swing.ImageIcon;

// Awt Imports
import java.awt.Color;

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
        String bglink = "https://github.com/RobumViren849/Xopitele/raw/main/Xopitele/Image/Background.png";
        File bgout = new File("C:\\Program Files\\XopiteleBG.png");

        new Thread(new Download(link,out)).start();
        new Thread(new Download(logolink,logoout)).start();

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

        JFrame gui = new JFrame("Xopitele - Running Application");
        JLabel bg = new JLabel(new ImageIcon("C:\\Program Files\\XopiteleBG.png"));
        bg.setSize(1280,720)

        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.add(bg);
        gui.setVisible(true);
        gui.setSize(1280,720);
        gui.getContentPane().setBackground(new Color(22, 156, 204));
        System.out.println("GUI system running");
    }
}
