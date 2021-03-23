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

public class Main implements ActionListener{
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
        System.out.println("Audio system is poggers");

        Gui renderGui = new gui();
    }

    public void actionPerformed(ActionEvent e) { 
        VitaminWorm game = new VitaminWorm();
    }
}