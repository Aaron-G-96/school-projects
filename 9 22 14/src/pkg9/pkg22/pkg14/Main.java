/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg22.pkg14;

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


/**
 *
 * @author 008230
 */
public class Main {
    private static String line;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException, AWTException  {
   	Runtime.getRuntime().exec("notepad.exe");
        
        Thread.sleep(2000);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_H);
        r.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(50);
        r.keyPress(KeyEvent.VK_E);
        Thread.sleep(10);
        r.keyPress(KeyEvent.VK_L);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_L);
        Thread.sleep(250);
        r.keyPress(KeyEvent.VK_O);
                
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_SPACE);
        
        
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_D);
        r.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_A);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_N);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_1);
        r.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(500);
        
        r.mouseMove(35, 190);
        
        Thread.sleep(500);       
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.delay(500);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
        r.mouseMove(35, 280);
        r.delay(500);
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
        
        Thread.sleep(1500);
        r.keyPress(KeyEvent.VK_D);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_A);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_N);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_PERIOD);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_B);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_A);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_T);
        Thread.sleep(500);
        
        r.keyPress(KeyEvent.VK_D);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_A);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_N);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_PERIOD);
        
        
    }
        	
    }

