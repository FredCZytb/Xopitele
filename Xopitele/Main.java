import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.sound.sampled.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        /*//////*
        * AUDIO *
        *///////*

        File music = new File("menumusic.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(music);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        System.out.println("Audio system running");

        /*////*
        * GUI *
        */////*

        JFrame gui = new JFrame("Xopitele - Running Application");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(1280,720);
        gui.getContentPane().setBackground(new Color(22, 156, 204));
        gui.setIconImage(new ImageIcon("logo.png").getImage());
        System.out.println("GUI system running");
    }
}