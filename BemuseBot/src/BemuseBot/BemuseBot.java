/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BemuseBot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author derie
 */
public class BemuseBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        Robot robot = new Robot();
        final int yCoord = 573;
        while (true) {
        quickTime(532, yCoord, robot, KeyEvent.VK_S);
        quickTime(580, yCoord, robot, KeyEvent.VK_D);
        quickTime(620, yCoord, robot, KeyEvent.VK_F);
        quickTime(665, yCoord, robot, KeyEvent.VK_SPACE);
        quickTime(710, yCoord, robot, KeyEvent.VK_J);
        quickTime(755, yCoord, robot, KeyEvent.VK_K);
        quickTime(800, yCoord, robot, KeyEvent.VK_L);
            
        }
        // TODO code application logic here
    }

    public static void quickTime(int XCoord, int YCoord, Robot robot, int key) {
        BufferedImage screenFullImage = robot.createScreenCapture(new Rectangle(XCoord, YCoord, 10, 10));
        Color RGB = new Color(screenFullImage.getRGB(3, 0));
        int red = RGB.getBlue();
        if (red >180) {
                robot.keyPress(key);
          } else {
                robot.keyRelease(key);
                
            }
    }

}
