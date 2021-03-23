// Swing
import javax.swing.JFrame;
import javax.swing.ImageIcon;

// Awt Imports
import java.awt.Color;

// Audio Imports
import javax.sound.sampled.*;¨

// IO Imports
import java.io.File;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

public class Main implements Runnable{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, Exception{
        /*//////*
        * AUDIO *
        *///////*

        // Download Audio File
        String link = "https://replit.com/@PetrNed/Nice.zip"
        File out = new File("C:\\Program Files\\Xopitele.zip");

        new Thread(new Download(link,out)).start();

        // Unzip Audio File
        String zipFilePath = "C:\\Program Files\\Xopitele.zip";
        String destFilePath = "C:\\Program Files\\Xopitele";

        unzip(zipFilePath,destFilePath)

        // Play Audio File
        File music = new File("C:\\Program Files\\Xopitele\\menumusic.wav");
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

    public static void unzip(String filepath, String destpath){
        File dir = new File(destpath);

        if(!dir.exists))
            dir.mkdirs();

        try {
            FileInputStream fis = new FileInputStream(zipFilePath);
            ZipInputStream zis = new ZipInputStream(filepath);
            ZipEntry ze = zis.getNextEntry();

            while(ze != null){
                byte[] buffer = new byte[(int) ze.getSize()];
                //byte[] buffer = new byte[1024];
                String fileName = ze.getName();
                File newFile = new File(destpath + File.seperator + fileName);
                System.out.println("Unzipped to: " + newFile.getAbsolutePath());

                if(ze.isDirectory()){
                    newFile.mkdir();
                } else {
                    if(!newFile.exists()){
                        System.out.println("Creating a file as it does NOT exist.");
                        newFile.getParentFile();
                        newFile.createNewFile();

                        FileOutputStream fos = new FileOutputStream(newFile);

                        int len;

                        while((len=zis.read(buffer))>0){
                            fos.write(buffer,0,len)
                        }

                        fos.close();
                        zis.closeEntry();
                    }
                    ze=zis.getNextEntry();
                }

                zis.closeEntry();
                zis.close();
                fis.close();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}