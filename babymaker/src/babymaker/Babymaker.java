
package babymaker;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Babymaker {

    //Member variables:
    private  AudioInputStream clipNameAIS;
    private static Clip clipNameClip;
    

    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        Runtime.getRuntime().exec("D:/Program Files\\NetBeans 7.2.1\\bin\\netbeans64.exe");
        
        Thread.sleep(2000);
        Robot r=new Robot();
        
        


        
        
        
        
        r.mouseMove(45, 55);
        
        Thread.sleep(500);       
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.delay(500);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        r.delay(500);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        r.delay(100);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        
        r.delay(3000);
        r.mouseMove(450, 430);
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        r.delay(75);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        r.keyPress(KeyEvent.VK_UP);
        r.keyRelease(KeyEvent.VK_UP);
        r.delay(75);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.delay(75);
        r.keyPress(KeyEvent.VK_Y);
        r.delay(75);
        r.keyPress(KeyEvent.VK_S);
        r.delay(75);
        r.keyPress(KeyEvent.VK_T);
        r.delay(75);
        r.keyPress(KeyEvent.VK_E);
        r.delay(75);
        r.keyPress(KeyEvent.VK_M);
        r.delay(75);
        r.keyPress(KeyEvent.VK_PERIOD);
        r.delay(75);
        r.keyPress(KeyEvent.VK_O);
        r.delay(75);
        r.keyPress(KeyEvent.VK_U);
        r.delay(75);
        r.keyPress(KeyEvent.VK_T);
        r.delay(75);
        r.keyPress(KeyEvent.VK_PERIOD);
        r.delay(75);
        r.keyPress(KeyEvent.VK_P);
        r.delay(75);
        r.keyPress(KeyEvent.VK_R);
        r.delay(75);
        r.keyPress(KeyEvent.VK_I);
        r.delay(75);
        r.keyPress(KeyEvent.VK_N);
        r.delay(75);
        r.keyPress(KeyEvent.VK_T);
        r.delay(75);
        r.keyPress(KeyEvent.VK_L);
        r.delay(75);
        r.keyPress(KeyEvent.VK_N);
        r.delay(75);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_9);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.delay(75);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_QUOTE);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.delay(75);
        r.keyPress(KeyEvent.VK_H);
        r.delay(75);
        r.keyPress(KeyEvent.VK_E);
        r.delay(75);
        r.keyPress(KeyEvent.VK_L);
        r.delay(75);
        r.keyPress(KeyEvent.VK_L);
        r.delay(75);
        r.keyPress(KeyEvent.VK_O);
        r.delay(75);
        r.keyPress(KeyEvent.VK_SPACE);
        r.delay(75);
        r.keyPress(KeyEvent.VK_W);
        r.delay(75);
        r.keyPress(KeyEvent.VK_O);
        r.delay(75);
        r.keyPress(KeyEvent.VK_R);
        r.delay(75);
        r.keyPress(KeyEvent.VK_L);
        r.delay(75);
        r.keyPress(KeyEvent.VK_D);
        r.delay(75);
        r.keyPress(KeyEvent.VK_PERIOD);
        r.delay(75);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_QUOTE);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_0);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.delay(75);
        r.keyPress(KeyEvent.VK_SEMICOLON);
        r.delay(75);
        
        
        r.mouseMove(430, 57);
        r.delay(25);
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        r.delay(75);
        
        
        
        
        r.delay(500);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        r.delay(10);
        r.keyPress(KeyEvent.VK_DOWN);
        
    }
}
