package com.company;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;


public class Main {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Main() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame("Basic Piano Made in Java | Krishan");
        frame.setBounds(100, 100, 706, 318);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);




        JButton btnC = new JButton("C");
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                try{
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("E:\\4TH SEM\\Java\\Music Player\\src\\com\\company\\Audio\\bensound-summer.mp3"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start( );
                }

                catch(Exception ex)
                {}





            }
        });
        btnC.setFont(new Font("Avenir Heavy", Font.BOLD, 42));
        btnC.setBounds(10, 60, 74, 190);
        frame.getContentPane().add(btnC);

        JButton btnD = new JButton("D");
        btnD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                try{
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("E:\\4TH SEM\\Java\\Music Player\\src\\com\\company\\Audio\\bensound-summer.mp3"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start( );
                }

                catch(Exception ex)
                {}

            }
        });
        btnD.setFont(new Font("Avenir Heavy", Font.BOLD, 42));
        btnD.setBounds(94, 60, 74, 190);
        frame.getContentPane().add(btnD);

        JButton btnE = new JButton("E");
        btnE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                try{
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("E:\\4TH SEM\\Java\\Music Player\\src\\com\\company\\Audio\\bensound-summer.mp3"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start( );
                }

                catch(Exception ex)
                {}

            }
        });
        btnE.setFont(new Font("Avenir Heavy", Font.BOLD, 42));
        btnE.setBounds(178, 60, 74, 190);
        frame.getContentPane().add(btnE);

        JButton btnF = new JButton("F");
        btnF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try{
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("E:\\4TH SEM\\Java\\Music Player\\src\\com\\company\\Audio\\bensound-summer.mp3"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start( );
                }

                catch(Exception ex)
                {}


            }
        });
        btnF.setFont(new Font("Avenir Heavy", Font.BOLD, 42));
        btnF.setBounds(262, 60, 74, 190);
        frame.getContentPane().add(btnF);

        JButton btnG = new JButton("A");
        btnG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                try{
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("E:\\4TH SEM\\Java\\Music Player\\src\\com\\company\\Audio\\bensound-summer.mp3"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start( );
                }

                catch(Exception ex)
                {}

            }
        });
        btnG.setFont(new Font("Avenir Heavy", Font.BOLD, 42));
        btnG.setBounds(430, 60, 74, 190);
        frame.getContentPane().add(btnG);

        JButton button = new JButton("G");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                try{
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("E:\\4TH SEM\\Java\\Music Player\\src\\com\\company\\Audio\\bensound-summer.mp3"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start( );
                }

                catch(Exception ex)
                {}


            }
        });
        button.setFont(new Font("Avenir Heavy", Font.BOLD, 42));
        button.setBounds(346, 60, 74, 190);
        frame.getContentPane().add(button);

        JButton btnB = new JButton("B");
        btnB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try{
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("E:\\4TH SEM\\Java\\Music Player\\src\\com\\company\\Audio\\bensound-summer.mp3"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start( );
                }

                catch(Exception ex)
                {}


            }
        });
        btnB.setFont(new Font("Avenir Heavy", Font.BOLD, 42));
        btnB.setBounds(515, 60, 74, 190);
        frame.getContentPane().add(btnB);

        JButton btnC_1 = new JButton("C");
        btnC_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                try{
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("E:\\4TH SEM\\Java\\Music Player\\src\\com\\company\\Audio\\bensound-summer.mp3"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start( );
                }

                catch(Exception ex)
                {}


            }
        });
        btnC_1.setFont(new Font("Avenir Heavy", Font.BOLD, 42));
        btnC_1.setBounds(599, 60, 74, 190);
        frame.getContentPane().add(btnC_1);

        JLabel lblCreatedByConcepts = new JLabel("Created by Krishan Rupani");
        lblCreatedByConcepts.setBounds(525, 261, 157, 14);
        frame.getContentPane().add(lblCreatedByConcepts);
    }
}
