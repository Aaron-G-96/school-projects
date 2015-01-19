/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.io.File;
import java.io.IOException;
import java.io.*;
import javax.sound.sampled.*;
import java.net.URL;
import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
/**
 *
 * @author 008230
 */
public class JavaApplication9 {
        private  AudioInputStream clipNameAIS;
    private static Clip clipNameClip;
    
    
    public JavaApplication9()
    {
        
    }
  
public void playMusic()
{
       try
        {
        clipNameAIS = AudioSystem.getAudioInputStream(getClass().getResourceAsStream("Apprentice.wav"));
        clipNameClip = AudioSystem.getClip();
        clipNameClip.open(clipNameAIS);
        }catch(Exception e){System.out.println("Failure to load sound");}

        //Action where .wav is played
        clipNameClip.setFramePosition(0);
        clipNameClip.start();

}

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        JavaApplication9 app = new JavaApplication9();
        
       
    }

    }

